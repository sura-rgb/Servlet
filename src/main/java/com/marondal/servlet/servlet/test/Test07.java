package com.marondal.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test07")
public class Test07 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		int price1 = Integer.parseInt(price);
		
		out.println(""
				+"<html>"
				+"<head><title>주문결과</title></head>"
				+"<body>"
				);
		
		// 서울시로 포함되어 있지 않으면
		if(!address.contains("서울시")) {
			out.println("       <h3>배달 불가 지역입니다.</h3>");
		} else if(card.equals("신한카드")) {
			out.println("       <h3>결제 불가 카드입니다.</h3>");
		} else {
			out.println("  <h4>" + address + "배달 준비중</h4>"
					+ " <hr> <div>결제금액 : " + price + "원 </div>");
		}
		
		
		
		out.println(""
				+"</body>"
				+"</html>"
				);
	}
	
}
