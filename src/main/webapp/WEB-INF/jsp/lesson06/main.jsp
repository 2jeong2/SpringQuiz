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
	$.ajax({
		type:"get",
		url:"/lesson06/lookup",
		data{"name":name,"phoneNumber":phoneNumber},
		
		
	})
	

</script>

</body>
</html>