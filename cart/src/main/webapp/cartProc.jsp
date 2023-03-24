<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String[] fruits = request.getParameterValues("fruit");
	String[] names = {"사과", "바나나", "복숭아"};
	
	if(fruits != null && fruits.length > 0){
		// 사용자가 하나이상 선택한 경우
		for(String fruit : fruits){
			for(int i = 0; i < fruits.length; i++){
			Cookie cookie = new Cookie(names[i], "on");
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
			}
		}
	} else {
		Cookie[] cookies = request.getCookies();
		if(fruits == null && fruits.length <= 0){
			for(Cookie c : cookies){
				
			}
		} 
	}
	
	  response.sendRedirect("cart.jsp");
	
%>