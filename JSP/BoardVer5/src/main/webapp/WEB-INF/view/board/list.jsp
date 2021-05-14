<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${loginUser.unm}(${loginUser.uid})님 반갑습니다.
<table>
<tr>
	<th>게시글번호
	<th>제목
	<th>작성자
	<th>작성일
<c:forEach items="${list}" var="item">
<tr>
	<td>${item.iboard }
	<td>${item.title }
	<td>${item.unm }
	<td>${item.regdt }
</c:forEach>
</table>
<a href="./write">글쓰기</a>
</body>
</html>