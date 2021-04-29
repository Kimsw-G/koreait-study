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
	<a href="/hello"><button>홈화면</button></a><br>
	${store.name }<br> 
	내용<br>
	${store.ctnt }<br>

	<!-- 여기에 댓글을 보여줍니다 -->
	<ul>
	<c:forEach var="review" items="${list}">
		<li>${review.id}(
		<c:forEach begin="1" end="${review.star}">
			&#9733
		</c:forEach>
		<c:if test="">
				
		</c:if>
		) : ${review.ctnt}
	</c:forEach>
	</ul>
	<!-- 여기에 댓글 작성란을 보여줍니다. -->
	<form action="/detail" method="post"><!-- css로 알맞은 형식으로 감싸기! -->
		<input type="hidden" name="key" value="${store.storeKey}">
		<div>
			<input type="text" name="id" placeholder="아이디">
			<input type="text" name="pw" placeholder="비밀번호">			
		</div>
		<input type="text" name="ctnt" placeholder="내용입력"/>
		<select name="star">
		<c:forEach var="i" begin="1" end="5">
			<option value="${i}">${i}</option>				
		</c:forEach>
		</select>
		<input type="submit" value="댓글쓰기">
	</form>

</body>
</html>