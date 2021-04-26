<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inputWrite</title>
</head>
<body>
	<h1>글쓰기</h1>
	<form action="/write" method="post">
		<div>
			<label for="title">제목 : </label><input type="text" name="title" />
		</div>
		<div>
			<label for="ctnt">내용 : </label><input type="text" name="ctnt" />		
		</div>
		<div>
			<input type="submit" value="글쓰기"/>
		</div>
	</form>
</body>
</html>