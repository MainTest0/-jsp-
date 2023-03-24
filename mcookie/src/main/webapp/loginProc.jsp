<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// form 태그로 넘어오는 값을 파싱하는 기술
// form 태그의 MIME TYPE은 application/x-www.urlencoded
// name이라는 식별자를 통해서 key 값을 찾아서 값을 긁어낼 수 있다.

String inputId = request.getParameter("userId");
String inputPwd = request.getParameter("password");
String remember = request.getParameter("remember");

// 여기 파일의 목적은 remember의 값 유무에 따라서 로직을 작성할 예정 (쿠키 사용해서)
if (remember != null) { // 값이 들어온 상태
	// 쿠키를 생성하는 로직 짜기
	// 사용자가 다시 로그인 요청했을 때 remember를 체크안했으면
	// 쿠키를 삭제하는 로직

	// 생성자에는 키와 값을 할당한다.
	Cookie cookie = new Cookie("userId", inputId); // 쿠키 생성됨
	cookie.setMaxAge(60 * 60 * 24 * 30); //쿠키 유효시간 설정 60초 * 60초 = 1시간 *24 = 하루 * 30 = 30일
	// 쿠키는 서버에서 생성되고 보낼 떄 response 객체에 담아서 보낸다.
	response.addCookie(cookie);

} else {
	// 쿠키 삭제하는 로직
	// setMaxAge를 0으로 만들어주면 삭제
	// remember에 사용자가 체크를 하지않은 상태라면 쿠키를 삭제

	// request 내장객체에 쿠키가있는지 확인
	Cookie[] cookies = request.getCookies();
	// 최초 요청이라면 없을 수도 있다.
	if (cookies != null) {
		// 탐색하기
		for (Cookie c : cookies) {
	if (c.getName().equals("userId")) {
		c.setMaxAge(0);
		response.addCookie(c);
		break;	
	}
		}
	}

}
// 로그인했을 때 다시 login.jsp로 돌아가게 하기(쿠키 가진상태로)
response.sendRedirect("login.jsp");
%>