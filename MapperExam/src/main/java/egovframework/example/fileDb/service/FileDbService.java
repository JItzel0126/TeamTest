/**
 * 
 */
package egovframework.example.fileDb.service;

import java.util.List;

import egovframework.example.common.Criteria;

/**
 * @author user
 *
 */
public interface FileDbService {
	List<?> selectFileDbList(Criteria criteria); 	//전체조회
	int selectFileDbListTotCnt(Criteria criteria);	// 총개수구하기
	int insert(FileDbVO fileDbVO);					// insert
	FileDbVO selectFileDb(String uuid);
	int delete(String uuid);
}
