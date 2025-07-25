/**
 * 
 */
package egovframework.example.dept.service;

import java.util.List;

import egovframework.example.common.Criteria;

/**
 * @author user
 *
 */
public interface DeptService {
	List<?> selectDeptList(Criteria criteria);	// 전체 조회
	int selectDeptListTotCnt(Criteria criteria);// 총 개수 구하기
	int insert(DeptVO deptVO);	// 부서 insert
	DeptVO selectDept(int dno);
	int update(DeptVO deptVO);
	int delete(DeptVO deptVO);
}
