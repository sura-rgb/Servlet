package com.marondal.servlet.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.marondal.servlet.common.MysqlService;
@WebServlet("/db/favorite/delete")
public class FavoriteDeleteControler extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String id =request.getParameter("id");
		
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		String query = "DELETE FROM `favorite` WHERE `id` = " + id + ";";
		
		int count = mysqlService.update(query);
		
		response.sendRedirect("/db/favorite/list.jsp");
		
	}

}
