<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<form method="post" action="./regist">
		<input type="text" name="uid">
		<input type="password" name="upw">
		<input type="password" name="upwck">
		<input type="text" name="unm">
		<input type="radio" name="gender" value="1" checked>남
		<input type="radio" name="gender" value="0">여
		<button type="submit">회원가입</button>
	</form>
</body>
</html>