/**
 * 
 */
package egovframework.example.gallery.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import egovframework.example.common.Criteria;
import egovframework.example.gallery.service.GalleryService;
import egovframework.example.gallery.service.GalleryVO;

/**
 * @author user
 *
 */
@Service
public class GalleryServiceImpl implements GalleryService {

	@Autowired
	GalleryMapper galleryMapper;

	@Override
	public List<?> selectGalleryList(Criteria criteria) {
		// TODO Auto-generated method stub
		return galleryMapper.selectGalleryList(criteria);
	}

	@Override
	public int selectGalleryListTotCnt(Criteria criteria) {
		// TODO Auto-generated method stub
		return galleryMapper.selectGalleryListTotCnt(criteria);
	}

	@Override
	public int insert(GalleryVO galleryVO) {
		String newUuid=UUID.randomUUID().toString();
		// TODO Auto-generated method stub
		String downloadURL=generateDownloadUrl(newUuid);
		galleryVO.setUuid(newUuid);
		galleryVO.setGalleryFileUrl(downloadURL);
		galleryMapper.insert(galleryVO);
		return 0;
	}
	
//	다운로드 URL을 만들어주는 메소드
	public String generateDownloadUrl(String uuid) {
//		인터넷주소 체계:http://localhost:8080/경로(path)?쿼리스트스트링
//		기본주소(ContextPath):http://localhost:8080
//		URL 만드는 클래스	  :ServletUriComponentsBuilder
		return ServletUriComponentsBuilder      
	          .fromCurrentContextPath()		//기본주소:http://localhost:8080
	          .path("/gallery/download.do")	//경로  :/gallery/download.do
	          .query("uuid="+uuid)			//쿼리스트링:?uuid=uuid
	          .toUriString();				
//	위에꺼조합:http://localhost:8080/gallery/download.do?uuid=uuid값
	   }	

	@Override
	public GalleryVO selectGallery(String uuid) {
		// TODO Auto-generated method stub
		return galleryMapper.selectGallery(uuid);
	}

	@Override
	public int delete(String uuid) {
		// TODO Auto-generated method stub
		return galleryMapper.delete(uuid);
	}
	
	
	
}
