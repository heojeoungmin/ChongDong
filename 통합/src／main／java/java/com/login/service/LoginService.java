package com.login.service;

import java.util.HashMap;

public interface LoginService {
	
	HashMap<String, String> selectLogin(HashMap<String, String> pMap);
	
	int updatePw(HashMap<String, String> pMap); 
	
	int insertUser(HashMap<String, String> pMap); 
	
	int checkUserid(HashMap<String, String> pMap);
	
}
