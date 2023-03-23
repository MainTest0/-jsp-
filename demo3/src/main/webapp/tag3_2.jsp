<%@page import="java.util.TimeZone"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
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

table{
	border-collapse: collapse;
	width : 400px;
	font-size: 14px;
	margin: 20px;
}

td{
	background-color: #f2f2f2;
	border: 1px solid #ccc;
	text-align: center;
}

</style>
<main>
	<pre>
	<%=getDate() %>
	</pre>
	<table>
		<tr>
			<td>
				<%for(int i = 2; i < 10; i++){ %>
			</td>
			<tr>
				<td><%=i %>단 시작</td>
			</tr>
			<tr>
				<td><%for(int j = 1; j <10; j++){ %></td>
			</tr>
			<tr>
				<td><%=i %> X <%=j %> = <%=i*j %></td>
			</tr>
		</tr>
			<%} %>
			<td>&nbsp;</td>
		<%} %>
	</table>
	
</main>

<%! 
	public String getDate(){
	
	TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
	Date date = new Date();
	
	System.out.println(System.currentTimeMillis());
	
	String strDate = String.format("%tY년 %tm월 %td일 %tT", date, date, date, date);
	
	return strDate;
}
%>


<jsp:include page="/Layout/Footer.jsp" />