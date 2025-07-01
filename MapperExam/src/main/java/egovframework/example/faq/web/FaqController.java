/**
 * 
 */
package egovframework.example.faq.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import egovframework.example.common.Criteria;
import egovframework.example.faq.service.FaqService;
import lombok.extern.log4j.Log4j2;

/**
 * @author user
 *
 */
@Log4j2
@Controller
public class FaqController {
//	서비스 불러오기
	@Autowired
	private FaqService faqService;
//	전체조회
	@GetMapping("/faq/faq.do")
	public String name(@ModelAttribute Criteria criteria,
	         Model model) {
		
		List<?> faqs=faqService.selectFaqList(criteria);
		log.info(faqs);
		model.addAttribute("faqs",faqs);
		return "faq/faq_all";
	}
}
