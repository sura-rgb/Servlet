package com.marondal.servlet.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet{
	
	// 웹 페이지를 만들기위해 서블릿을 기반으로 작성하는 클래스는 기본적으로 
	// extends HttpServlet 상속받아야함 , 사용법
	
	// HttpServlet에 있는 클래스 상속받아 재정의
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		//PrintWriter 객체안에있는 메소드
		out.println("Hello World!!");
		//request(요청) 받으면 해당 코드를 reponse(응답)에 담음
		//이제 요청할수있도록 주소가 필요하다. web.xml
		// 만든 웨페이지가 어떤 주소로 동작하는지 정해주는거 web.xml
	}
	
	
}
