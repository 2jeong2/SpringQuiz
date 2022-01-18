<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<title>Insert title here</title>
</head>
<body>

<div class="container">

<h1 class="text-center">통나무 펜션</h1>

	<nav class="bg-warning " >
		
			
			<ul class="nav nav-fill mt-4">
				<li class="nav-item"><a href="#" class="nav-link main-link text-white">펜션소개</a></li>
				<li class="nav-item"><a href="#" class="nav-link main-link text-white">객실보기</a></li>
				<li class="nav-item"><a href="#" class="nav-link main-link text-white">예약하기</a></li>
				<li class="nav-item"><a href="#" class="nav-link main-link text-white">예약목록</a></li>
			</ul>
	</nav>
	
</div>

<script>

	$(document).ready(function(){
		
		var isDuplicateName = true;
		
		if()
		
		$.ajax({
			type:"get",
			url:"/lesson06/lookup",
			data{"name":name,"phoneNumber":phoneNumber},
			success:Function(data){
				if(data.result == "fail"){
					alert("조회된 결과가 없습니다.")
				}else if(data.result == "success"){
					
				alert("이름 : " + booking.name+ "\n"
						+"인원 : " + booking.headcount + "\n" 
						+ "상태 : " + booking.state )
				};
			}
			
			
			
		})
	})
	//c-pointer/C++,java-  class => 메모리 구조(운영체제)
	//자료구조 - 트리,트리순회,그래프(깊이,너비 우선탐색)
	//웹서버 개발tomcat,apache,Django =>네트워크
	//웹개발=>리눅스-웹 서버 배포=>운영체제
	//정보처리기사 필기
	
	/* 기술 면접 질문 */
	//이론,기본 개념
	//포트폴리오 질문***(무엇을 했느냐) 말하는 연습,발표준비
	//사회성,커뮤니케이션
	
	//자바 웹개발자 신입개발자 면접질문(구글 검색)
	//완성된 문장으로 대답
	//아는것만 대답 /모르겠습니다.
	
	
	
	
	
	
	
	
	

</script>

</body>
</html>