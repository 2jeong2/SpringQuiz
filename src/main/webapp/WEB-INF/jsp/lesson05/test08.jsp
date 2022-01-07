<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
            
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<title>날씨 정보 페이지</title>
</head>
<body>

<div class="container d-flex">
	<nav class="nav col-2 bg-info">
		<div class="logo">
			<img src="">
		<ul class="font-weight-bold text-white">
			<li class="nav-link" >날씨</li>
			<li class="nav-link">날씨입력</li>
			<li class="nav-link">테마날씨</li>
			<li class="nav-link">관측 기후</li>
			<li class="nav-link"></li>
			<li class="nav-link"></li>
		
		</ul>
	</nav>
	
	
	<div class="col-10">
	
		<header class="h-30" >
			<h3>날씨 입력</h3>
		</header>
		
		<form method="get" action="com.marondal.test.lesson05.test08">
			<section class="  h-70 p-4">
				<div class="d-flex">
					<label>날짜</label><input type="text" name="date">
					<label>날씨</label><input type="text" name="weather">
					<label>미세먼지</label><input type="text" name="microDust">
				</div>
				
				<div class="d-flex">
					<label>기온</label><input type="submit" value="C" name="temperatures">
					<label>강수량</label><input type="submit" value="mm" name="precipitation">
					<label>풍속</label><input type="submit" value="km/h" name="windSpeed">
				</div>
				<button type="button" >저장</button>
			</section>
		</form>
	
	</div>
</div>

</body>
</html>