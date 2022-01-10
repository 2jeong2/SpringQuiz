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
		<nav class="bg-info" >
			<div class="logo d-flex justify-content-center mt-3">
				<img class="logo-image mr-2" width="50" src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Emblem_of_the_Government_of_the_Republic_of_Korea.svg/800px-Emblem_of_the_Government_of_the_Republic_of_Korea.svg.png" >
				<span class="text-white logo-text">기상청</span>
			</div>
			
			<ul class="nav flex-column mt-4">
				<li class="nav-item"><a href="#" class="nav-link main-link text-white">날씨</a></li>
				<li class="nav-item"><a href="#" class="nav-link main-link text-white">날씨입력</a></li>
				<li class="nav-item"><a href="#" class="nav-link main-link text-white">테마날씨</a></li>
				<li class="nav-item"><a href="#" class="nav-link main-link text-white">관측 기후</a></li>
			</ul>
		</nav>
	
	
		<section class="mt-3 ml-5">
		
			<header class="" >
				<h3 class="font-weight-bold">날씨 입력</h3>
			</header>
			
			<form method="post" action="lesson05/add_weather">
				
					<div class="d-flex">
						<label>날짜</label><input type="text" name="date">
						<label>날씨</label>
						<select name="weather">
							<option>맑음</option>
							<option>흐림</option>
							<option>구름조금</option>
							<option>비</option>
						</select>
						<label>미세먼지</label>
						<select name="microDust">
							<option>좋음</option>
							<option>보통</option>
							<option>나쁨</option>
							<option>최악</option>
						</select>
					</div>
					
					<div class="d-flex">
						<label>기온</label><input type="submit" value="${temperatures }°C" name="temperatures">
						<label>강수량</label><input type="submit" value="mm" name="precipitation">
						<label>풍속</label><input type="submit" value="km/h" name="windSpeed">
					</div>
					<button type="button" class="btn btn-success" >저장</button>
				
			</form>
		
		</section>
</div>

</body>
</html>