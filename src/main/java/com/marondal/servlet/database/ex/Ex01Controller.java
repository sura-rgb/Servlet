package com.marondal.servlet.database.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/db/ex/ex01")
public class Ex01Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		
		//used_goods 테이블의 모든 행을 조회해서 결과를 response에 담기
		
		
		try {
			//database 접속
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			// 접속 주소, 포트, id, password
			String url = "jdbc:mysql://localhost:3306/vamos";
			String id = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,id,password);
			
			//쿼리수행
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `used_goods`;");
			
			//쿼리 수행 결과 다루기
			while(resultSet.next()) {
			// 제목, 가격, 설명
			// 제목 : ~~ 가격 : ~~원 설명 : ~~
			String title = resultSet.getString("title");
			int price = resultSet.getInt("price");
			String description = resultSet.getString("description");
			
			out.println("제목  : " + title + "가격" + price + "원 설명 : " + description);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
