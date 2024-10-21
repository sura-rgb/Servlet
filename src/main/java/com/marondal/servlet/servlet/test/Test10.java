package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/servlet/test10")
public class Test10 extends HttpServlet{
	
	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String passWord = request.getParameter("passWord");
	
		
		out.print(""
				+"<html>"
				+ "	<head><title>test10</title></head>"
				+  "<body>"
				);
		if(!id.equals(userMap.get("id"))) {
			out.print("<h3>id가 일치하지 않습니다 </h3>");
		} else if(!passWord.equals(userMap.get("password"))) {
			out.print("<h3>password가 일치하지 않습니다.</h3>");
		} else {
			out.print(""
					+"<h1>" + userMap.get("name") + "님 환영 합니다.</h2>"
					);
		}
		out.print(""
				+  "</body>"
				+"</html>"
				);
	}
}
