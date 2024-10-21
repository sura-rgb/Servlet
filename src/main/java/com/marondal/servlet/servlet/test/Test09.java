package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sevlet/test09")
public class Test09 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		out.print(""
				+"<html>"
				+ "	<head><title>test09</title></head>"
				+  "<body>"
				);
		out.print("<h2>" + name + "님 지원이 완료 되었습니다." + "</h2>" + "<hr>"
				+ "<div>지원내용</div>"
				+"<div>" + introduce + "</div>"
				);
		out.print(""
				+  "</body>"
				+"</html>"
				);
		
		
		
	}

}
