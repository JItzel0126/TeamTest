/**
 * 
 */
package egovframework.example.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.common.Criteria;
import egovframework.example.emp.service.EmpService;
import egovframework.example.emp.service.EmpVO;

/**
 * @author user
 *
 */
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpMapper empMapper;

	@Override
	public List<?> selectEmpList(Criteria criteria) {
		// TODO Auto-generated method stub
		return empMapper.selectEmpList(criteria);
	}

	@Override
	public int selectEmpListTotCnt(Criteria criteria) {
		// TODO Auto-generated method stub
		return empMapper.selectEmpListTotCnt(criteria);
	}

	@Override
	public int insert(EmpVO empVO) {
		// TODO Auto-generated method stub
		return empMapper.insert(empVO);
	}

	
	@Override
	public EmpVO selectEmp(int eno) {
		// TODO Auto-generated method stub
		return empMapper.selectEmp(eno);
	}

	@Override
	public int update(EmpVO empVO) {
		// TODO Auto-generated method stub
		return empMapper.update(empVO);
	}

	@Override
	public int delete(EmpVO empVO) {
		// TODO Auto-generated method stub
		return empMapper.delete(empVO);
	}
	
	
}
