<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공인중개사 추가</title>
</head>
<body>

	<form method="get" action="/jsp/test/create" >
		<h1>공인중개사 추가</h1>
		<label>상호명</label><br><input type="text"name="id">
		<label>전화번호</label><br><input type="text" name="phoneNumber">
		<label>주소</label><br><input type="text" name="address">
		<label>등급</label><br><input type="text" name="grade"><br>
		<button type="submit">추가</button>
	</form>

</body>
</html>