<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.marondal.servlet.common.MysqlService"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%
		MysqlService mysqlService = new MysqlService();
		mysqlService.connect();
		
		List<Map<String,Object>> userList = mysqlService.select("SELECT * FROM `new_user` ORDER BY `id` DESC;");
		mysqlService.disconnect();
		
	%>

	<h3>사용자 목록</h3>
	
	<table border="1">
		<thead>
		<tr>
			<th>이름</th>
			<th>이메일</th>
			<th>자기소개</th>
		</tr>
		</thead>
		<<tbody>
		<% for(Map<String, Object> user:userList) { %>
			<tr>
				<td><%= user.get("name") %></td>
				<td><%= user.get("email") %></td>
				<td><%= user.get("introduce") %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>