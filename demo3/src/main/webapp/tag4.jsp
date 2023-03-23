<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/Layout/Header.jsp" />
<style>
main {
	display: flex;
	padding: 20px;
	flex-direction: column;
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
	margin: 5px 10px;
}

td, th{
	background-color: #f2f2f2;
	border: 1px solid #ccc;
	text-align: center;
	padding:10px;
	border: 1px solid #ccc;
}

</style>
<main>

	<h1> 학생 성적표 </h1>

	<table>
		<tr>
		<th> 이름 </th>
		<th> 국어 </th>
		<th> 수학 </th>
		<th> 영어 </th>
		<th> 총점 </th>
		<th> 평균 </th>
		</tr>
		<%
			// 학생 정보를 이중 배열로 정의하기
			String[][] students = {
					{"홍길동", "90", "80", "85"},
					{"김철수", "85", "90", "99"},
					{"박영희", "75", "99", "80"},
			};
		
			for(int i = 0; i < students.length; i++){
				String name = students[i][0];
				int kor = Integer.parseInt(students[i][1]);
				int eng = Integer.parseInt(students[i][2]);
				int math = Integer.parseInt(students[i][3]);
				int total = (kor+eng+math);
				double avg = total/3.0;
		%>
		
			<tr>
				<td><%=name %></td>
				<td><%=kor %></td>
				<td><%=eng %></td>
				<td><%=math %></td>
				<td><%=total %></td>
				<td><%= String.format("%.1f" ,avg) %></td>
			</tr>		
		<% } %>
	</table>

</main>






<jsp:include page="/Layout/Footer.jsp" />