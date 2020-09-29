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
	/* /WEB-INF/view/b.jsp입니다. */
	
	@RequestMapping("member/result")
	public String result(Model model) {
		model.addAttribute("id","abc"); // id라는 이름에 abc라는 문자열을 담자.
		//==request.setAttribute("id","abc");이것과 같다.
		
		return "member/result";
	}
	
	@RequestMapping("member/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();//무엇을 가지고 어디로 갈것인지 지정하는 객체
		mav.addObject("name","태연");
		mav.addObject("pw","1234");
		mav.setViewName("member/list"); //return에 쓰는거랑 같은거다
		//return "member/list";
		return mav;
	}
	
	
	
}//HomeController
