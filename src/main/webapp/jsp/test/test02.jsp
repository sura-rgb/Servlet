<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>
<body>
	<%
		String feet = request.getParameter("feet");
		int feet1 = Integer.parseInt(feet);
		String kg = request.getParameter("kg");
		int kg1 = Integer.parseInt(kg);
	%>
	
	<%
		String result = null;
		double bmi = kg1 / ((feet1 / 100.0) * (feet1 / 100.0));
		if(bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 25) {
			result = "정상";
		} else if (bmi > 30) {
			result = "과체중";
		} else {
			result = "비만";
		}
	%>
	<div class="container">
		<h1>BMI 측정 결과</h1>
		<div class="display-4">당신은 <span class="text-info"><%=result %></span> 입니다.</div>
		<div>BMI 수치 : <%=bmi %></div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>