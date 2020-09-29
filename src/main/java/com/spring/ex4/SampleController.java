package com.spring.ex4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sample")
public class SampleController {
	
	@RequestMapping("/input")
	public String sample() {
		return "sample/input";
	}
	
	@RequestMapping("/list")
	public String list() {
		return "sample/list";
	}
	
}
