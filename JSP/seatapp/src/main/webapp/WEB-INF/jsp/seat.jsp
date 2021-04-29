<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<link rel='stylesheet' href="/css/seat.css">
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<button class="back" onclick="location.href='/main'">뒤로가기</button>
	<c:set var="cnt" value="${0}"/>
	<!-- 테이블 호출! -->
	<div class="wrap">
	<!-- B반 -->
	<div class="lineB">
	<div class="class"><h2>BClass</h2></div>
		
	<c:forEach var="i" begin="0" end="4"><!-- 5줄 반복 -->	
		<div class="table">
		<c:forEach var="j" begin="1" end="4"><!-- 4개짜리 테이블 -->
			<button class="seat" onclick="location.href='/seat?no=${7*i+j}'">
				<c:if test="${cnt != seats.size() and(7*i+j) eq seats.get(cnt).seatKey}">
					${seats.get(cnt).name}
					<c:set var="cnt" value="${cnt+1}" ></c:set>
				</c:if>
			</button>		
		</c:forEach>
		</div> 
		<div class="table">
		<c:forEach var="j" begin="1" end="3"><!-- 3개짜리 테이블 -->
			<button class="seat" onclick="location.href='/seat?no=${7*i+j+4}'">
				<c:if test="${cnt != seats.size() and(7*i+j+4) eq seats.get(cnt).seatKey}">
					${seats.get(cnt).name}
					<c:set var="cnt" value="${cnt+1}" ></c:set>
				</c:if>
			</button>		
		</c:forEach>
		</div> 
	</c:forEach>
	</div>
	
	<!-- C반 -->
	<div class="lineC">
	<div class="class"><h2>CClass</h2></div>
	<c:forEach var="i" begin="0" end="3"><!-- 4줄 반복 -->
		<div class="table">
		<c:forEach var="j" begin="1" end="2"><!-- 2개짜리 테이블 -->	
			<button class="seat" onclick="location.href='/seat?no=${35+6*i+j}'">
				<c:if test="${cnt != seats.size() and(35+6*i+j) eq seats.get(cnt).seatKey}">
					${seats.get(cnt).name}
					<c:set var="cnt" value="${cnt+1}" ></c:set>
				</c:if>
			</button>	
		</c:forEach>
		</div>
		<div class="table">
		<c:forEach var="j" begin="1" end="4"><!-- 4개짜리 테이블 -->
			<button class="seat" onclick="location.href='/seat?no=${37+6*i+j}'">
				<c:if test="${cnt != seats.size() and(37+6*i+j) eq seats.get(cnt).seatKey}">
					${seats.get(cnt).name}
					<c:set var="cnt" value="${cnt+1}" ></c:set>
				</c:if>
			</button> 
		</c:forEach>
		</div>	
	</c:forEach>
	</div>
	</div>
	<!-- 명단 호출! -->
	<ul>
	<c:forEach var="stu" items="${list}">
		<li>${stu.stuKey}:${stu.name}
	</c:forEach>
	</ul>
</body>
</html>