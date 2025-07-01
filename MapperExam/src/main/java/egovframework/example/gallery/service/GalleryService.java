/**
 * 
 */
package egovframework.example.gallery.service;

import java.util.List;

import egovframework.example.common.Criteria;

/**
 * @author user
 *
 */
public interface GalleryService {
	List<?> selectGalleryList(Criteria criteria);
	public int selectGalleryListTotCnt(Criteria criteria);
	int insert(GalleryVO galleryVO);
	GalleryVO selectGallery(String uuid);
	int delete(String uuid);
}
