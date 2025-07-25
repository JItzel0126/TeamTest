/**
 * 
 */
package egovframework.example.emp.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.common.Criteria;
import egovframework.example.dept.service.DeptVO;
import egovframework.example.emp.service.EmpVO;

/**
 * @author user
 * 마이바티스: 1) 인터페이스: 메소드명 2)xml 파일:sql등
 *
 */
@Mapper
public interface EmpMapper {
	public List<?> selectEmpList(Criteria criteria); // 전체조회
	public int selectEmpListTotCnt(Criteria criteria);
	public int insert(EmpVO empVO);
	public EmpVO selectEmp(int eno);                  // 상세조회
	public int update(EmpVO empVO);
	public int delete(EmpVO empVO);
}
