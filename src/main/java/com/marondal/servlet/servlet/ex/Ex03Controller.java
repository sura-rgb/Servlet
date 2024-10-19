package com.marondal.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/ex03")
public class Ex03Controller extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일을 전달받고,
		// 이름과 나이를 정리한 html을 구성
		// getParameter() request로 부터 name이란 파마레터를 얻어오겠다
		// 즉, name과 birthday가 주소창에 드가야된다는뜻
		// 링크를 통해서, 사용자가 직접 입력하긴 그러니
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday"); //20240812 규격정하기
		
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
		int age = 2024 - year + 1;
//		{"name" : "김인규", "age":22}
		// 문자열안에 들어간 따옴표는 앞에 역슬래쉬 붙여줘야 구분가능
		// json
		out.println("{\"name\" : \"" + name + "\",\"age\":" + age + "}");
		
		
//		out.println(""
//				+ "<html>"
//				+ 	"<head>"
//				+		"<title>정보</title>"
//				+	"</haad>"
//				+	"<body>"
//				+ 		"<h3>이름 : " + name + "</h3>"
//				+ 		"<h3>나이 : " + age + "</h3>"
//				+	"</body>"
//				+ "</html>");
				
	}

}
