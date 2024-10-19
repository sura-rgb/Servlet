package com.marondal.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 결과물에 대한 정보 설정
		// Response Header
		// 대표적인 두개 (CharacterEncoding (사용언어),ContentType(데이터 타입))
		// character set : utf-8 (내가 utf-8로 전달할것)
		response.setCharacterEncoding("utf-8");
		// response의 데이터 타입
		// MIME (확장자)
		// text/plain : 그냥 문자열
		response.setContentType("text/plain");
		// 결과물
		// Response Body
		// response.getWirter() 호출, PrintWriter라는 객체를 리턴받고. 활용하기위해 out이란 변수에저장
		PrintWriter out = response.getWriter();
		out.println("URL Mapping 예제");
		
		// 현재 날짜 시간 정보 얻어오기 (자바에서 쓰라고 만들어놓음)
		// Date() 객체가 생성된 시기의 날짜와 시간정보를 저장하고 관리
		// import util로
		// toString을 통해 그대로 출력이되지만(만들어놓은 클래스니까 toString 있을확률높음) 투박함
		Date now = new Date();
		out.println(now);
		
		// 원하는 형태의 문자열로 날짜 시간 표현하기 (만들어져있는거)
		//2024년 07월 15일 17시 44분 13초
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		//SimpleDateFormat이 갖고있는 규격에 따라 실제 날짜 시간이 적용된 문자가 만들어지고,리턴
		//now를 만든 규격으로 변환하고 변환된 값을 변수에 저장
		String dateTimeString = formatter.format(now);
		
		out.println(dateTimeString);
		
	}
}
