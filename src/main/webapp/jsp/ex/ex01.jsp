<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ page import="java.util.ArrayList" %>
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
	
	<h2>2. 리스트 다루기</h2>
	<%
		// 동물 이름 리스트
		List<String> animalList = new ArrayList<>();
		animalList.add("cat");
		animalList.add("dog");
	%>
	
	<ul>
		<li><%= animalList.get(0) %></li>
		<li><%= animalList.get(1) %></li>
	</ul>
	
	<h2>3. 메소드 만들기</h2>
	<%!
		// Hello World 문자열을 리턴하는 메소드
		public String getHelloWorld() {
			return "Hello World!!";
	}
	%>
	<h3><%= getHelloWorld() %></h3>
	
</body>
</html>  