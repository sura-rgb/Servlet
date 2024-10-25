<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료구조 다루기</title>
</head>
<body>

	<%
		// 과일이름 리스트
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("바나나");
		fruitList.add("딸기");
	%>
	
	
	<table border="1">
	<% for(String fruit : fruitList) { %>
		<tr>
			<td><%= fruit %></td>
		</tr>
	<% } %>
	</table>
	
	<%
	// [{"국어":90, "수학":95, "영어":80}, {"국어":100, "수학":90,"영어":70}]
			Map<String, Integer> score1 = new HashMap<>();
	score1.put("국어",90);
	score1.put("수학",95);
	score1.put("영어",80);
	
	Map<String, Integer> score2 = new HashMap<>();
	score2.put("국어",100);
	score2.put("수학",90);
	score2.put("영어",70);
	
	List<Map<String, Integer>> scoreList = new ArrayList<>();
	scoreList.add(score1);
	scoreList.add(score2);
	%>
	
	<table border="1">
		<thead>
			<tr>
				<th>국어</th>
				<th>수학</th>
				<th>영어</th>
		</thead>
		<tbody>
		<% for(Map<String,Integer> score:scoreList) { %>
			<tr>
				<td><%= score.get("국어") %></td>
				<td><%= score.get("수학") %></td>
				<td><%= score.get("영어") %></td>
			</tr>
		<% } %>
		</tbody>
		
	</table>
	
	
</body>
</html>