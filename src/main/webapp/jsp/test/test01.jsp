<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.List" %>
 <%@ page import="java.util.Arrays" %>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int[] scores = {80, 90, 100, 95, 80};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = sum / (double)scores.length;
	%>
	<h2><%= avg %></h2>
	
	<%
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	int score = 0;
	for(String dap : scoreList) {
		if(dap.equals("O")) {
			score += 10;
		}
	}
	%>
	<h2><%= score %></h2>
	
	<%!
		
		public int getNumbers(int num1) {
		int sum = 0;
		for(int i = 1; i <= num1; i++) {
			 sum += i;
		}
		return sum;
	}
	%>
	<h3>1부터 50까지의 합은 <%= getNumbers(50) %></h3>
	
	<%
		String birthDay = "20010820";
		int year = Integer.parseInt(birthDay.substring(0,4));
		int age = 2024 - year + 1;
	%>
	<h3><%= birthDay %>의 나이는 <%= age %>살 입니다.</h3>
</body>
</html>