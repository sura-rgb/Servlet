<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.marondal.servlet.common.MysqlService" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

<%
	MysqlService mysqlService = new MysqlService();

	mysqlService.connect();
	
	String query = "SELECT * FROM `favorite` ORDER BY `id` DESC";
		//조회된 모든 행들을 맵으로 구성하고 그 모든 맵을 하나의 객채로 다룰수있도록 
		// 리스트에 저장해서 리턴해줌
		List<Map<String,Object>> favoriteList = mysqlService.select(query);
%>

	<div class="container">
		<h3>즐겨찾기 목록</h3>
		
		<table class="table text-center">
			<thead>
				<tr>
					<th>사이트</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody>
			<%for(Map<String,Object> favorite:favoriteList) { %>
				<tr>
					<td><%= favorite.get("name") %></td>
					<td><a href="<%= favorite.get("url")%>" target="_blank"><%=favorite.get("url") %></a></td>
					<td><a href="/db/favorite/delete?id=<%= favorite.get("id") %>" class="btn btn-danger">삭제</a></td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
	

	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>