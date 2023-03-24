<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Cookie[] cookies = request.getCookies();

    	String apple = "";
    	String banana = "";
    	String pich = "";
    	
    	if(cookies != null){
    		for(Cookie c : cookies){
    			if(c.getName().equals("apple")&&
    					c.getName().equals("banana")&&
    					c.getName().equals("pich")){
    				apple = c.getValue();
    				banana = c.getValue();
    				pich = c.getValue();
    				break;
    			}
    		}
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<label>내가 담은 과일</label>
	<% if(apple!=null && banana != null && pich != null){ %>
	<label>사과</label>
	<label>바나나</label>
	<label>복숭아</label>
	<%} else if(apple!=null && banana != null){%>
	<label>사과</label>
	<label>바나나</label>
	<%} else if(apple!= null){ %>
	<label>사과</label>
	<%} else if(banana != null){ %>
	<label>바나나</label>
	<%} else if(pich != null){ %>
	<label>복숭아</label>
	<%} else{ %>
	<label>담은 과일이 없다</label>
	<%} %>
</body>
</html>