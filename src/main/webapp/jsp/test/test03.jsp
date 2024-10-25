<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date" %>
    <%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
	<%
		Date date = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("오늘 날짜 yyyy년 M월 d일");
		SimpleDateFormat timeFormatter = new SimpleDateFormat("현재 시간은 H시 m분 s초");

		String dateString = dateFormatter.format(date);
		String timeString = timeFormatter.format(date);
		
		// 어떤 정보를 보여줄지 파라미터를 통해 전달받는다.
		// 시간을 보여줄지, 날짜를 보여줄지
		// what : time - 시간, date - 날짜
		String what = request.getParameter("what");
		String result = null;
		if(what.equals("time")) {
			result = timeString;
		} else if(what.equals("date")) {
			result = dateString;
		}
	%>
	
	<div class="container">
		<div class="display-4"><%= result %></div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>