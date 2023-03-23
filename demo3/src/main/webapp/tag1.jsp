<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
main pre{
	width : 100%;
	border: 1px solid black;
	padding : 20px;
}
</style>
<main>
	<pre>
		<%  %>-- 스크립트 릿(Script let, HTML 렌더링 후 태그는 보이지 않는다.)
		<%= "" %>-- 표현식 (Expression, HTML 렌더링 후 태그는 보이지 않는다.)
		<%-- 여기는 확인할 수 없어요 --%>-- jsp에서 쓰는 주석 (HTML 렌더링 후 태그는 보이지 않는다.)
		<!-- 여기는 HTML 주석입니다. 소스보기로 확인 가능합니다. -->
		-------------------------------------------------------------------
		스크립트 릿은 HTML과 Java 코드를 혼합하여 사용할 수 있다.
		<% new java.util.Date(); %>	-- 여기 부분은 출력 안됨
		화면에 데이터를 출력하려면 표현식을 사용해야 한다.
		<%= new java.util.Date() %>	-- 표현식에는 세미콜론 안쓴다.
		-------------------------------------------------------------------
		사용방법
		스크립트 릿 : <% %> JSP 페이지에 Java 코드를 실행할 수 있다.
		표현식 : <%="" %>  JSP 페이지에서 Java 코드의 결과 값을 출력할 수 있다.
		
		자바 코드 위치
		스크립트 릿 : JSP 페이지 어디든지 위치할 수 있다.
		표현식 : HTML 태그 내부에서만 사용할 수 있다.
		
		출력 결과
		스크릡트 릿 : 출력 결과를 지정하지 않으면 아무런 출력이 되지 않는다.
		표현식 : Java 결과 값을 출력한다.
		
	</pre>
</main>






<jsp:include page="/Layout/Footer.jsp" />