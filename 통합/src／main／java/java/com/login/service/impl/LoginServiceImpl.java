package com.login.service.impl;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.model.LoginMapper;
import com.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	//LoginServiceImpl
	
	@Autowired
	LoginMapper loginMapper;
	
	//로그인
	@Override
	public HashMap<String, String> selectLogin(HashMap<String, String> pMap) {
		
		HashMap<String, String> results = loginMapper.selectLogin(pMap);
		
		return results;
	}
	
	//비밀번호 변경
	@Override
	public int updatePw(HashMap<String, String> pMap) {
		
		int results = loginMapper.updatePw(pMap);
		
		return results;
	}
	
	//회원가입
	@Override
	public int insertUser(HashMap<String, String> pMap) {
		
		int results = loginMapper.insertUser(pMap);
		
		return results;
	}
	
	//회원가입 아이디 중복확인
	@Override
	public int checkUserid(HashMap<String, String> pMap) {
		
		int results = loginMapper.checkUserid(pMap);
		
		return results;
	}
}
