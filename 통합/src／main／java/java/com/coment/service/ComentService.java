package com.coment.service;

import java.util.HashMap;

public interface ComentService {
	
	//댓글 작성
	int insertComent(HashMap<String, String> pMap);
	
	//댓글 수정
	int updateComent(HashMap<String, String> pMap);
	
	//댓글 삭제
	int deleteComent(HashMap<String, String> pMap);
}