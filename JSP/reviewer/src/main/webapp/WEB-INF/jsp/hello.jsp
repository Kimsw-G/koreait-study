<%@page import="model.StoreDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' href="/css/hello.css">
<title>Insert title here</title>
</head>
<body>
	<!-- 검색기능도 구현! -->
	<div class="wrapper">
	<div class="search">
		<form action="/hello" method="post">
			<select name="sepKey">
				<option value="name">이름</option>
				<option value="ftype">분류</option>
			</select>
			<input type="text" name="sepValue">
			<input type="submit" value="검색">
		</form>
	</div>
	<!-- TODO: 정렬기능(최신,오래된,별점,분류 -->
	
	<!-- TODO: 게시판 기능. 15개씩 한 페이지에 구현 -->
	<div class="main">
		<table>
			<tr>
				<td>번호
				<td>이름
				<td>소개
				<td>분류
				<td>별점
		<c:forEach items="${list}" var="vo">
			<tr onclick="location.href='/detail?key=${vo.storeKey}'">
				<td>${vo.storeKey}
				<td>${vo.name}
				<td>${vo.ctnt}
				<td>${vo.ftype}
				<%--
				 <td><fmt:formatNumber value="${vo.avg}" maxFractionDigits="1"/>			
				--%>
				<td>
				<c:forEach begin="1" end="${vo.avg}">
					&#9733
				</c:forEach>
				<c:if test="">
					&#9734
				</c:if>
		</c:forEach>
		</table>
	</div>
	<div class="button">
		<a href="/regi"><button>가게등록</button></a>	
	</div>
		
	<div class="page">
		<c:forEach var="i" begin="1" end="${size}"><!-- end값을 list.size()/LEN의 값으로 -->
			<!-- i가 현재 page와 같다면 em으로만 감싸기 -->
			<a href="/hello?page=${i}">${i}</a>
		</c:forEach>
	</div>

	</div>
</body>
</html>