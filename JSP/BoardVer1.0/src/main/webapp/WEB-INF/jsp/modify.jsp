<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>

<form action="/modify" method="post">
	<div>
		<label for="title">제목 : </label><input type="text" name="title" value="${vo.getTitle()}" />
	</div>
	<div>
		<label for="ctnt">내용 : </label><input type="text" name="ctnt" value="${vo.getCtnt()}"/>		
	</div>
	<input type="hidden" name="no" value="${no}">
	<input type="submit" value="수정"/>
</form>
</body>
</html>