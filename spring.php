API

1.로그인
	http://localhost:8080/loginCheck.do

	postJson
	{
		 "userId":"test"
		,"userPw":"abc"
	}

	result
	{
		"loginCheck": {
			"userNm": "테스트1",
			"userPw": "abc",
			"userId": "test"
		}
	}

2.비밀번호 변경
	http://localhost:8080/changePw.do
	
	postJson
	{
		 "userId":"test"
		,"userPw":"abc"
	}
	
	result
	{
		"changePw": "Y"			 성공 Y / 실패 N
	}

3.회원가입
	http://localhost:8080/signUp.do
	
	postJson
	{
		 "userId":"gkgkgk"
		,"userPw":"abc"
		,"userNm":"양현민"
	}
	
	result
	{
		"signUp": "Y"			 성공 Y / 실패 N
	}

4.회원가입 아이디 중복확인
	http://localhost:8080/checkSign.do
	
	postJson
	{
		 "userId":"d"
	}
	
	result
	{
		 "checkSign": "N"		성공 Y / 실패 N
	}
	
5.메뉴 조회
	http://localhost:8080/getMenuList.do
	
	postJson
	{
		 "userId":"test"
	}
	
	result
	{
		"menuList": [
        {
            "menuUrl": "/notive.do",
            "menuId": "A",
            "menuNm": "공지사항"
        },
        {
            "menuUrl": "/board.do",
            "menuId": "B",
            "menuNm": "게시판"
        },
        {
            "menuUrl": "/board",
            "menuId": "E",
            "menuNm": "동아리"
        }
    ]
}

6.메뉴 추가
	http://localhost:8080/createMenu.do
	
	postJson
	{
		 "menuId":"F"
		,"menuNm":"활동"
		,"menuUrl":"board1.do"
	}
	
	result
	{
		 "createMenu": "Y" 			성공 Y / 실패 N
	}
	
	메뉴 권한
		http://localhost:8080/authMenu.do
		
		postJson
		{
			 "menuId":"F"
			,"authId":"N"
			,"userId":"user"
		}
		
		result
		{
			 "authMenu": "Y"			성공 Y / 실패 N
		}
	
7.메뉴 변경
	http://localhost:8080/updateMenu.do
	
	postJson
	{
		 "menuId":"F"
		,"menuNm":"수정"
		,"menuUrl":"board2.do"
		,"userId":"user"
	}
	
	result
	{
		 "updateMenu": "Y" 			성공 Y / 실패 N
	}
	
8.게시글 추가
	http://localhost:8080/insertBoards.do
	
	postJson	
	{
		 "menuId":"F"
		 ,"userId":"user"
		 ,"boardsTitle":"제목"
		 ,"boardsContents":"내용"
	}
	
	result
	{
		 "insertBoards": "Y"		성공 Y / 실패 N
	}
	
9.게시글 수정
	http://localhost:8080/updateBoards.do
	
	postJson
	{
		  "userId":"user"
		 ,"boardsTitle":"제목수11"
		 ,"boardsContents":"내용수1"
		 ,"boardsSno":"1"
		 ,"menuId":"A"
	}
	
	result
	{
		 "updateBoards": "Y"			성공 Y / 실패 N
	}
	
10.댓글 작성
	http://localhost:8080/insertComent.do
	
	postJson
	{
		  "menuId":"A"
		 ,"userId":"user"
		 ,"boardsSno":"2"
		 ,"contents":"댓글2"
	}
	
	result
	{
		 "insertComent": "Y"			성공 Y / 실패 N
	}

11.댓글 수정
	http://localhost:8080/updateComent.do
	
	postJson
	{
		  "menuId":"A"
		 ,"userId":"user11"
		 ,"boardsSno":"2"
		 ,"contents":"11111"
         ,"commentsSno":"1"
	}
	
	result
	{
		 "updateComent": "Y"			성공 Y / 실패 N
	}

12.댓글 삭제
	http://localhost:8080/deleteComent.do
	
	postJson
	{
	 	  "menuId":"A"
         ,"boardsSno":"1"
         ,"commentsSno":"1"
		 ,"userId":"user99"
	}
	
	result
	{
		 "deleteComent": "Y"			성공 Y / 실패 N
	}
