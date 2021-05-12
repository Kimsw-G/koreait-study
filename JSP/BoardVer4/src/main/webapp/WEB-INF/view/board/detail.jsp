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

	<h1>디테일 페이지</h1>
	<div>${vo.iboard}</div>
	<div>${vo.title }</div>
	<div>${vo.unm }</div>
	<div>${vo.regdt }</div>
	<div>
		${data.ctnt }
	</div>
	<c:if test="${loginUser.iser == vo.iuser}">
	<div>
		<a href="del?iboard=${vo.iboard}">삭제</a>
		<a href="">수정</a>
	</div>
	</c:if>
</body>
</html>