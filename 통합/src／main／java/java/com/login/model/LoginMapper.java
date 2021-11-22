package com.login.model;

import java.util.HashMap;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
	//로그인 확인
	HashMap<String,String> selectLogin(HashMap<String,String> pMap);
	
	//비밀번호 변경
	int updatePw(HashMap<String,String> pMap);
	
	//회원가입
	int insertUser(HashMap<String,String> pMap);
	
	//회원가입 아이디 중복확인
	int checkUserid(HashMap<String,String> pMap);
	
}
