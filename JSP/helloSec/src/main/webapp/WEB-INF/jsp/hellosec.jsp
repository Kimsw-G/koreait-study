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

flagTrue : ${flagTrue}<br>
flagFalse : ${flagFalse }<br>

<c:if test="${flagTrue}">
	여긴 flagTrue if<br>
</c:if>
<c:if test="${flagFalse}">
	여긴 flagFalse if<br>
</c:if>


<form action="/sec" method="post">
	<input type="password" name="pw">
	<input type="text" name="name">
	<input type="text" name="name">
	<input type="submit" value="제출">
</form> 
</body>
</html>