<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


<title>통나무 펜션</title>
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

<table class="table">
	<thead>
		<tr>
			<th>이름</th>
			<th>예약날짜</th>
			<th>숙박일수</th>
			<th>숙박인원</th>
			<th>전화번호</th>
			<th>예약상태</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>${booking.name }</td>
			<td>${booking.date }</td>
			<td>${booking.headcount }</td>
			<td>${booking.day }</td>
			<td>${booking.phoneNumber }</td>
			<td>${booking.state }</td>
			<td></td>
		</tr>
	</tbody>
	
</table>
<footer>
	<small class="text-secondary">
	제주특별차지도 제주시 <br>
	사업자 등록번호 : 111-22-2555222/농어촌민박사업자지정/대표.김동묵<br>
	Copyright 2026 All right reserved
	</small>
</footer>

</div>

<script>


</script>

</body>
</html>


