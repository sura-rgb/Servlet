<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp 시작</title>
</head>
<body>
	<h2>1.기본 문법</h2>
	<!-- 브라우저에서 확인 가능 -->
	<!-- html 주석 -->
	<%-- 브라우저에서 확인 불가능, 판단해서 쓰기 --%>
	<%-- jsp 주석 --%>
	
	<%-- 1부터 10까지의 합을 h3 태그로 구성 --%>
	<%
	int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
	%>
	
	<h3>합계 : <%=sum%></h3>
	<input type="text" value="<%=sum%>">
	<div><%=sum * 2 %></div>
	
</body>
</html>