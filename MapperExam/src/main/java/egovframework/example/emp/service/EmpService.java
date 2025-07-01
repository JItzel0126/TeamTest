/**
 * 
 */
package egovframework.example.emp.service;

import java.util.List;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptVO;

/**
 * @author user
 *
 */
public interface EmpService {
   List<?> selectEmpList(Criteria criteria); // 전체 조회
   int selectEmpListTotCnt(Criteria criteria);
   int insert(EmpVO empVO);
   EmpVO selectEmp(int eno);
   int update(EmpVO empVO);
   int delete(EmpVO empVO);
}