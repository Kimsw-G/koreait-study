<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>

	<h1>리스트</h1>
	<div>
		<a href="/write">여기는 /write입니다.</a>	
	</div>
	
	<table border="1">
		<tr>
			<td><b>no</b>
			<td><b>제목</b>
	<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.getIboard()}
			<td><a href="/detail?no=${vo.getIboard()-1}">${vo.getTitle()}</a>
	</c:forEach>
	</table>
</body>
</html>