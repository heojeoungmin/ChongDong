package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	/* 메인화면 호출 */
	@RequestMapping(value="/main.do")
	public String main() {
		return "main";
	}
	
}
