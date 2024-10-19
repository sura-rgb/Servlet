package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test06")
public class Test06 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		
		int addtion = num1 + num2;
		int substraction = num1 - num2;
		int multiplication = num1 * num2;
		int division = num1 / num2;
		// {"addtion":100,"substraction":20,"multiplication":102, "division":10 }
		out.println("{ \"addtion\" :" + addtion + ", \"substraction\":" + substraction + ", \"multiplication\":" + multiplication + ", \"division\":" + division + "}");
		 
	}

}
