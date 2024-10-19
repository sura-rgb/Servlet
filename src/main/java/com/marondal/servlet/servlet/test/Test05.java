package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test05")
public class Test05 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		//request안에서 dan이라는 파라메터를 찾는다
		String gugu = request.getParameter("dan");
		int gugudan = Integer.parseInt(gugu);
		out.println(""
				+ "<html>"
				+ 	"<head>"
				+	 	"<title>test05</title>"
				+	"</head>"
				+	"<body>"
				+		"<ul>"
				);
		for(int i = 1; i <= 9; i++) {
			out.println("<li>" + gugudan + " X " + i + " = " + (gugudan * i) + "</li>");
		}
		out.println(""
				+ 		"</ul>"
				+	"</body>"
				+ "</html>"
				);
	}
}
