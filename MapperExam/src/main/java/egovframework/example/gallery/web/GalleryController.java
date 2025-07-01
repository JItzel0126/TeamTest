/**
 * 
 */
package egovframework.example.gallery.web;

import java.util.List;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import egovframework.example.common.Criteria;
import egovframework.example.fileDb.service.FileDbVO;
import egovframework.example.gallery.service.GalleryService;
import egovframework.example.gallery.service.GalleryVO;
import lombok.extern.log4j.Log4j2;

/**
 * @author user
 *
 */
@Log4j2
@Controller
public class GalleryController {
//	서비스 가져오기
	@Autowired
	private GalleryService galleryService;
	
//	전체조회
	@GetMapping("/gallery/gallery.do")
	public String name(@ModelAttribute Criteria criteria,
	         Model model,
	         @RequestParam(defaultValue = "") String searchKeyword) {

//		1) 등차자동계산 클래스: PaginationInfo
//			- 필요정보: (1) 현재페이지번호(pageindex), (2) 보일 개수(pageUnit): 3
		PaginationInfo paginationInfo=new PaginationInfo();
		paginationInfo.setCurrentPageNo(criteria.getPageIndex());
		paginationInfo.setRecordCountPerPage(criteria.getPageUnit());
//		등차를 자동 계산 : FirstRecordIndex 필드에 있음
		criteria.setFirstIndex(paginationInfo.getFirstRecordIndex());
		
//		전체조회 서비스 메소드 실행
		List<?> gallerys=galleryService.selectGalleryList(criteria);
		log.info("테스트 : "+gallerys);
		model.addAttribute("gallerys",gallerys);

//		페이지 번호 그리기: 페이지 플러그인(전체테이블 행 개수)
		int totCnt=galleryService.selectGalleryListTotCnt(criteria);
		paginationInfo.setTotalRecordCount(totCnt);
		log.info("테스트2 : "+totCnt);
//		페이지 모든 정보 : paginationInfo
		model.addAttribute("paginationInfo", paginationInfo);
		
//		페이지 초기화 수정(개인추가)
//		model.addAttribute("searchKeyword", searchKeyword);
				
		return "gallery/gallery_all";
	}
	
   	@GetMapping("/gallery/addition.do")
   	public  String createFileDbView() {
   		return "gallery/add_gallery";
   	}


   	@PostMapping("/gallery/add.do")
   	public String name(@RequestParam(defaultValue = "") String galleryTitle,
   			@RequestParam(required = false) MultipartFile image
   			) throws Exception {
   		GalleryVO galleryVO=new GalleryVO(
   				galleryTitle,image.getBytes());
   		galleryService.insert(galleryVO);
		return "redirect:/gallery/gallery.do";
	}
   	
   	@ResponseBody
   	@GetMapping("/gallery/download.do")
   	public ResponseEntity<byte[]> fileDownload(@RequestParam(defaultValue = "") String uuid) {
//		1) 상세조회: 첨부파일을 가져오려고
   		GalleryVO galleryVO=galleryService.selectGallery(uuid);
//   	2) 헤더: 첨부파일을 보낼때(통신규칙) (1)첨부파일 보내요!ㅋ (2)첨부파일 문서형식도 지정
//   	=> HTML 문서: 헤더(문서형식,암호화등)+바디(실제 데이터)
   		HttpHeaders headers=new HttpHeaders();
//   	첨부파일일 보낸다는 의미:1)attachment(첨부파일)
//   					2)fileDbVO.getUuid()(첨부파일명)
   		headers.setContentDispositionFormData("attachment", galleryVO.getUuid());
//   	첨부파일 문서형식(이진파일)
   		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
   		
//   	ResponseEntity: 데이터와 함께 신호도 같이 전송가능.
//   	신호 예) HttpStatus.OK(200번),HttpStatus.NOT_FOUND(404)등
//   	사용법: new ResponseEntity<byte[]>(데이터, 헤더(생략가능),신호);
   		return new ResponseEntity<byte[]>
   					(galleryVO.getGalleryData(),
   					headers, HttpStatus.OK);
	}
   	
//	삭제
	@PostMapping("/gallery/delete.do")
	public String delete(@RequestParam(defaultValue = "") String uuid) {
		galleryService.delete(uuid);
		return "redirect:/gallery/gallery.do";
}
}
