<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 추가</title>
</head>
<body>

<%-- input에서 사용자 입력받기, create에서 실제 리스트에 추가됨, list에서 확인 --%>

	<form method="get" action="/db/user/create">
	<h3>사용자 추가</h3>
	<label>이름 : </label><input type="text" name="name">
	<label>생년월일 :</label> <input type="text" name="birthday">
	<label>이메일 : </label> <input type="text" name="email">
	<button type="submit">추가</button>
	</form>
</body>
</html>