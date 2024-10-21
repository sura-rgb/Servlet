package com.marondal.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/ex05")
public class Ex05Controller extends HttpServlet{

	@Override
	// get 메소드를 수행할 메소드
	// 보안적으로 위험한 데이터를 파라미터로 전달 받을때
	// url 로 표현하기 힘든 큰 데이터나 파일을 파라미터로 전달 받을때
	// get이 기반이긴함
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 전달 받는쪽의 타입을 이렇게 받겠다
		// get은 그냥 url, url 전용의 인코딩 방식이있어서 그걸 고대로 가따씀
//		request.setCharacterEncoding("utf-8");
		// 내가 돌려줄 결과의 타입을 이렇게 주겠다
//		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		

		birthday.substring(0,4);
		int year = Integer.parseInt(birthday);
		int age = 2024 - year + 1;
		
		out.println(""
				+"<html>"
				+	"<head><title>정보</title></head>"
				+	"<body>");
		
		
		out.println("<h3>이름 : " + name + "<h3>나이 :" + age + "</h3>");
		
		
		out.println(""
				+	"</body>"
				+"</html>"
				);
	}
	
}
