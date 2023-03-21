<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
* {
	box-border: border-box;
}

h1, h2, h3, h4, h5, h6 {
	margin: 0;
}

body{
	display: flex;
	justify-content: center;
}

section {
	width: 1300px;
	margin: 40px, 20px;
	padding: 20px;
	background-color: #fff;
	display: flex;
}

article.main {
	flex:3;
	order : 2;
	justify-content: center;
	display: flex;
	flex-direction: column;
}

alticle.main img {
	flex:1;
}

article.side1{
	flex:1;
	order:1;
	text-align: left;
}
article.side2{
	flex:1;
	order:3;
	text-align : right;
}
</style>
<body>

	<section>
		<article class="main">
			<img alt="메인이미지" src="images/main_img.jpg">
			<h2>main Content</h2>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed
				do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut
				enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi
				ut</p>
		</article>
		<article class= " side1">
			<h2>Side Content 1</h2>
			Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
			eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
			ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
			aliquip ex ea commodo consequat. Duis aute irure dolor in
			reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
			pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
			culpa qui officia deserunt mollit anim id est laborum.
		</article>
		<article class= " side2">
			<h2>Side Content 2</h2>
			Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
			eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
			ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
			aliquip ex ea commodo consequat. Duis aute irure dolor in
			reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
			pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
			culpa qui officia deserunt mollit anim id est laborum.
		</article>
	</section>

</body>
</html>