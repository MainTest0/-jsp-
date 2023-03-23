<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.util.Date" %>
<!-- 이 코드가 DOCTYPE부터 시작해서 <html> 닫아주는거까지 해주고있음 -->
<jsp:include page="/Layout/Header.jsp" />

<style>
main {
	display: flex;
	padding: 20px;
	flex-direction: column;
	/* 주축방향 교차축 주축방향 기억 */
	align-items: center;
	justify-content: flex-start;
}

main pre {
	width: 100%;
	border: 1px solid black;
	padding: 20px;
}

</style>
	<pre>
		선언문(Declaration)
		<%! %>-- 태그를 표현한다.
		JSP 페이지에서 전역변수, 메서드, 클래스들을 선언할 수 있다.
		스크립트 릿과 달리, JSP 페이지에서 직접 호출할 수 없다.
		---------------------------------------------
		선언문과 표현식 연습
		현재 시간은 한국 표기법으로 <%= getKoreanTime() %>이다.
	</pre>

</main>
<%!
	public String getKoreanTime(){
	
	// 아파치 톰캣에 내장되어있는 기본 돌아가고있는 서버의 시간대를 한국 시간대로 변경하기
	TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
	// 현재 시간을 가져와서 문자열로 변환
	// import하는 방법
	Date now = new Date();
	// 현재시간을 1000분의 1초로 찍어냄
	System.out.println(System.currentTimeMillis());
	String timeStr = String.format("%tY년 %tm월 %td일 %tT", now, now ,now, now);
	return timeStr;
}
%>


<jsp:include page="/Layout/Footer.jsp" />