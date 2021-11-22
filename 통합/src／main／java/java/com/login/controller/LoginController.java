package com.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.login.service.impl.LoginServiceImpl;

@Controller
public class LoginController {

	//사용되는 서비스 선언
	@Autowired
	LoginServiceImpl loginService;
		
	/* 게시판 호출 */
	@RequestMapping(value="/login.do")
	public String main() {
		return "login/login";
	}
	
	//ajax 호출 로그인확인
	@ResponseBody
	@RequestMapping(value="/loginCheck.do")
	private Map<String, Object> getLogin(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		HashMap<String,String> results = loginService.selectLogin(map);
			
		reqMap.put("loginCheck", results);
			
		return reqMap;
	}
	
	//ajax 호출  비밀번호변경
	@ResponseBody
	@RequestMapping(value="/changePw.do")
	private Map<String, Object> updatePw(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = loginService.updatePw(map);

		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("changePw", check);
			
		return reqMap;
	}
	
	//ajax 호출  회원가입
	@ResponseBody
	@RequestMapping(value="/signUp.do")
	private Map<String, Object> signUp(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = loginService.insertUser(map);

		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("signUp", check);
			
		return reqMap;
	}
	
	//ajax 호출  회원가입 아이디 중복확인
	@ResponseBody
	@RequestMapping(value="/checkSign.do")
	private Map<String, Object> checkSign(@RequestBody HashMap<String, String> map) {
			
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		int results = loginService.checkUserid(map);

		String check = "N";
		if(results == 1) {
			check = "Y";
		}
		reqMap.put("checkSign", check);
			
		return reqMap;
	}
}
