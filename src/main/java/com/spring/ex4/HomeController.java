package com.spring.ex4;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("member/view")
	public String view() {
		System.out.println("view()");
		return "member/memberView";
	}
	
	@RequestMapping("a")
	public String a() {
		System.out.println("a()");
		return "b";
	}
	/* /WEB-INF/view/b.jsp�Դϴ�. */
	
	@RequestMapping("member/result")
	public String result(Model model) {
		model.addAttribute("id","abc"); // id��� �̸��� abc��� ���ڿ��� ����.
		//==request.setAttribute("id","abc");�̰Ͱ� ����.
		
		return "member/result";
	}
	
	@RequestMapping("member/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();//������ ������ ���� �������� �����ϴ� ��ü
		mav.addObject("name","�¿�");
		mav.addObject("pw","1234");
		mav.setViewName("member/list"); //return�� ���°Ŷ� �����Ŵ�
		//return "member/list";
		return mav;
	}
	
	
	
}//HomeController
