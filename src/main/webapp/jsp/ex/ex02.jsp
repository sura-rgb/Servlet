<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Method</title>
</head>
<body>
	<%
		// 이름 생년월일 전달받고, 이름과 나이를 보여주는 테이블을 만든다.
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		int year = Integer.parseInt(birthday.substring(0,4));
		int age = 2024 - year + 1;
	%>
	
	
	
	<table border="1">
		<tr>
			<td>이름</td>
			<td><%= name %></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%= age %></td>
		</tr>
	</table>
	
</body>
</html>