package egovframework.example.fileDb.service.impl;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptVO;
import egovframework.example.fileDb.service.FileDbService;
import egovframework.example.fileDb.service.FileDbVO;
import lombok.extern.log4j.Log4j2;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
      "classpath:/egovframework/spring/context-aspect.xml",
       "classpath:/egovframework/spring/context-common.xml",
       "classpath:/egovframework/spring/context-datasource.xml",
       "classpath:/egovframework/spring/context-idgen.xml",
       "classpath:/egovframework/spring/context-mapper.xml",
       "classpath:/egovframework/spring/context-sqlMap.xml",
       "classpath:/egovframework/spring/context-transaction.xml"
   })
@Log4j2
class FileDbSeriveImplTest {
	
	@Autowired
	FileDbService fileDbService;

	@Test
	void testSelectFileDbList() {
//      여기서 각 메소드별 테스트하면 됩니다.: 전체조회
//      1) 테스트 조건
      Criteria criteria=new Criteria();
      criteria.setSearchKeyword("");	// 검색어
      criteria.setFirstIndex(0);		// 1페이지(0),2페이지(3)
      criteria.setPageUnit(3);			// 화면 보일 개수(3)
//      2) 실제 메소드실행
      List<?> list=fileDbService.selectFileDbList(criteria);
//      3) 검증(확인): 로그 , DB 확인, assert~
      log.info(list);		
	}
	
	@Test
	void testSelectFileDbListTotCnt() {
	      Criteria criteria=new Criteria();
	      criteria.setSearchKeyword("");	// 검색어
	      
//	      2) 실제 메소드실행
	      int count=fileDbService.selectFileDbListTotCnt(criteria);
//	      3) 검증(확인): 로그 , DB 확인, assert~
	      log.info(count);
	}
	

	
	@Test
	void testSelectFileDb() {
//		1) 테스트 조건(given):
		String uuid="12345671";
//		2) 실제 메소드실행(when)
		FileDbVO fileDbVO=fileDbService.selectFileDb(uuid);
//		3) 검증(확인)(then):로그, DB확인, assert~ (DB확인)
		log.info(fileDbVO);	
	}
	
	@Test
	void testDelete() {
		String uuid="12345671";
		fileDbService.delete(uuid);
	}

}
