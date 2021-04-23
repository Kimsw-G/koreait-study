<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsExam</title>
</head>
<body>
	<div>
		<input type="text" id="num1">
		<input type="text" id="num2">
		<button onclick="sum()">더하기</button>
		<button onclick="minus()">빼기</button>
	</div>
	<div>
		<input type="text" id="result">
	</div>
	
	
	
	<script>
		var num1El = document.getElementById('num1');
		var num2El = document.querySelector('#num2');
		var rs = document.querySelector('#result');
		function sum() {
			result.value = Number(num1El.value)+Number(num2El.value);
		}
		function minus(){
			result.value = Number(num1El.value)-Number(num2El.value)
		}
		
		
	</script>
	
</body>
</html>