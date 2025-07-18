package egovframework.example.emp.service.impl;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptVO;
import egovframework.example.emp.service.EmpService;
import egovframework.example.emp.service.EmpVO;
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
class EmpServiceImplTest {
   
   @Autowired
   EmpService empService;
   
   @Test
   void testSelectEmpList() {
//      여기서 각 메소드별 테스트하면 됩니다.: 전체조회
//      1) 테스트 조건
      Criteria criteria=new Criteria();
      criteria.setSearchKeyword("");	// 검색어
      criteria.setFirstIndex(3);		// 1페이지(0)
      criteria.setPageUnit(3);			// 화면 보일 개수(3)
//      2) 실제 메소드실행
      List<?> list=empService.selectEmpList(criteria);
//      3) 검증(확인): 로그 , DB 확인, assert~
      log.info(list);
   }
   
	@Test
	void testSelectEmpListTotCnt() {
//     여기서 각 메소드별 테스트하면 됩니다.: 전체조회
//     1) 테스트 조건
     Criteria criteria=new Criteria();
     criteria.setSearchKeyword("");	// 검색어

//     2) 실제 메소드실행
     int count=empService.selectEmpListTotCnt(criteria);
//     3) 검증(확인): 로그 , DB 확인, assert~
     log.info(count);
	}
	
	@Test
	void testInsert() {
//		1) 테스트 조건:DeptVO(dno,dname,loc)
		EmpVO empVO=new EmpVO(0,"스미스","사원",30,"20/01/01",
				300,500,30);
//		2) 실제 메소드실행
		empService.insert(empVO);
//		3) 검증(확인):로그, DB확인, assert~ (DB확인)
	}
	
	@Test
	void testSelectEmp() {
		int eno=8001;
		EmpVO empVO = empService.selectEmp(eno);
		log.info(empVO);
	}
	
	@Test
	void testUpdate() {
//		1) 테스트 조건:DeptVO(dno,dname,loc)
		EmpVO empVO=new EmpVO(8000,"스미스","사원",30,"20/01/01",
				300,500,30);
//		2) 실제 메소드실행
		empService.update(empVO);
//		3) 검증(확인):로그, DB확인, assert~ (DB확인)
	}
	
	@Test
	void testDelete() {
//		1) 테스트 조건:DeptVO(dno,dname,loc)
		EmpVO empVO=new EmpVO();
		empVO.setEno(8000);
//		2) 실제 메소드실행
		empService.delete(empVO);
//		3) 검증(확인):로그, DB확인, assert~ (DB확인)		
	}
}
