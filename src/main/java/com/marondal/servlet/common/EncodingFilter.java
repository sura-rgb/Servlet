package com.marondal.servlet.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
// 마찬가지로 xml에서 필터 범위지정 해야하는걸 @Web으로 사용가능
// 해당 필터가 거쳐갈 서블릿에 대한 path 범위 지정
// 모든 범위지정 * 
@WebFilter("/*")
public class EncodingFilter implements Filter{
	// 서블릿 코드에 공톡적으로 들어가는것을 처리, 필터
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 체인(필터) 사용법, 필터 여러개 있을수있음, 이필터 끝나면 다음꺼 해라 이런거
		chain.doFilter(request, response);
	}
}
