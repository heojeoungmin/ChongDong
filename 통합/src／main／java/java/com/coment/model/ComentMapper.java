package com.coment.model;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ComentMapper {
	
	//댓글 작성
	int insertComent(HashMap<String,String> pMap);
	
	//댓글 수정
	int updateComent(HashMap<String,String> pMap);
	
	//댓글 삭제
	int deleteComent(HashMap<String,String> pMap);

}
