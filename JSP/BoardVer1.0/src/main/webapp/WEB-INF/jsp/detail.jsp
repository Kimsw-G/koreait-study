<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	제목 : ${vo.getTitle() }<br>
	내용
	${vo.getCtnt()}
	<form action="/delete" method="post">
		<input type="hidden" name="no" value="${vo.getIboard()}"/>
		<input type="submit" value="삭제"/>
	</form>
	
	<form action="/modify" method="post">
		<input type="hidden" name="no" value="${vo.getIboard()}"/>
		<input type="submit" value="수정"/>
	</form>
	
</body>
</html>