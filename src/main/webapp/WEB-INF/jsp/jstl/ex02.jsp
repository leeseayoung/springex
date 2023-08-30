<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 제어문</title>
</head>
<body>

	<h2>조건문, 반복문</h2>

	<h3>1. if else if</h3>
	<%-- 몸무게가 70이하면 치킨, 80이하면 샐러드, 그게 아니면 굶어 --%>
	<c:set var="weight" value="40"/>

	
	<c:choose>
	
			<c:when test="${weight <= 70 }" >
				<h4>치킨 먹자!!</h4>
			</c:when>
			<c:when test="${weight <= 80 }" >
				<h4>샐러드</h4>
			</c:when>
			<c:otherwise>
				<h4>굶어!!</h4>
			</c:otherwise>
	</c:choose>
	
	
	<h3>2. 반복문</h3>
	<%--for(int i = 0; i < 5; i++) {} --%>
	
	<c:forEach var="i" begin="0" end="4" step="1">
		${i}
	</c:forEach>
	
	
	<%-- for(String fruit:fruitList) {} --%>
	<c:forEach var="fruit" items="${fruitList}" varStatus="status" >
		<h3>${fruit} :::::: ${status.count} ${status.index}  ${status.first}  ${status.last} </h3>
	</c:forEach>
	
	<%-- 연습문제 테이블 캐그로 만들으셈 --%>
	
	
	
	
	
</body>
</html>