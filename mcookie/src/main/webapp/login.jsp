<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// login.jsp 파일이 왔을 때 여기 코드 제일먼저 실행
// cookies 가 null이라서 실행안함
String hasUserId = "";
Cookie[] cookies = request.getCookies();
// 쿠키 배열이라서 인덱스 연산해서 긁어내야함
// 쿠키가 많은 경우, 하나도 없는 경우
// for문 돌렸을 때 null값이면 NPE 뜨니까 방어적 코드
if (cookies != null) {
	for (Cookie c : cookies) {
		// 이름 긁어내기, 문자열 비교연산 userId라는 키값이 있다면
		if (c.getName().equals("userId")) {
	hasUserId = c.getValue();
	// 100개있는데 2번째에 찾으면 멈춰라
	break;
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 사용해보기</title>
</head>
<body>
	<form action="loginProc.jsp" method="POST">
		<div>
			<!-- required : 값이 있어야 보낼거다 제약 -->
			아이디 : <input type="text" name="userId" value="<%=hasUserId%>"
				required="required">
		</div>
		<div>
			비밀번호 : <input type="password" name="password" value="1234"
				required="required">
		</div>
		<div>
			<input type="checkbox" name="remember" value=""> 아이디 기억하기
		</div>
		<div>
			<input type="submit" value="쿠키 저장 및 삭제">
		</div>
	</form>
</body>
</html>