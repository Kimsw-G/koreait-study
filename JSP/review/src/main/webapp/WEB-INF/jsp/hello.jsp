<%@page import="model.StoreDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td> 번호
			<td width="200"> 이름
			<td width="300"> 소개
			<td> 별점
			<td>
		<c:forEach items="${list}" var="vo">
		<tr>
			<td>${vo.getStoreKey()}
			<td><a href="/detail?key=${vo.getStoreKey()}">${vo.getName()}</a>
			<td>${vo.getCtnt() }
			<td>
		</c:forEach>
	</table>
	<a href="/regi"><button>가게등록</button></a>

	
</body>
</html>