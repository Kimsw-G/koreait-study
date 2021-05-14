<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
${errmsg}
	<form action="/user/login" method="post" id="login">
		<input type="text" name="uid">
		<input type="password" name="upw">
		<button type="submit">로그인</button>
		<a href="./regist">회원가입</a>
	</form>
</body>
</html>