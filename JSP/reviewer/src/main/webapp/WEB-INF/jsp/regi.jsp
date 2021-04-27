<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가게 등록하기</title>
</head>
<body>
	<form action="/regi" method="post">
		가게 이름 : <input type="text" name="name"><br>
		가게 설명 : <input type="text" name="ctnt"><br> 
		<!--  -->
		분류 : 	<select name="ftype">
				<c:forEach var="type" items="${ftype}">
					<option value="${type}">${type}</option>				
				</c:forEach>
				</select><br>
		<input type="submit"value="등록하기">
	</form>
</body>
</html>