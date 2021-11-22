package com.coment.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coment.model.ComentMapper;
import com.coment.service.ComentService;

@Service
public class ComentServiceImpl implements ComentService {
	//ComentServiceImpl
	
	@Autowired
	ComentMapper comentMapper;
	
	//댓글 작성
	@Override
	public int insertComent(HashMap<String, String> pMap) {
		
		int results = comentMapper.insertComent(pMap);
		
		return results;
	}
	
	//댓글 수정
	@Override
	public int updateComent(HashMap<String, String> pMap) {
		
		int results = comentMapper.updateComent(pMap);
		
		return results;
	}
	
	//댓글 삭제
	@Override
	public int deleteComent(HashMap<String, String> pMap) {
		
		int results = comentMapper.deleteComent(pMap);
		
		return results;
	}
}
