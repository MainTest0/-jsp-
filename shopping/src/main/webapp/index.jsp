<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp" />
<style>
	#banner{
		display:flex;
		justify-content: left;
		align-items: left;
	}
</style>
<main>
	<div class =banner>
		<a href = "index.jsp"><img src="images/banner.jpg"></a>
	</div>
	<div>
		<img src = "images/contour.png">
	</div>
	<div>
		<img src = "images/cloth1.png">
		<img src = "images/cloth2.png">
		<img src = "images/cloth3.png">
		<img src = "images/cloth4.png">
	</div>
</main>
<jsp:include page="/layout/footer.jsp" />