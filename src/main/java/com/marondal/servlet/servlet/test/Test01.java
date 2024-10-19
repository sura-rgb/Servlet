package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test01 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//Response Header 정보
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		// print 쓸려고
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 M월 d일");
		String time = format.format(now);
		out.println("오늘의 날짜는 " + time);
		
	}
}
