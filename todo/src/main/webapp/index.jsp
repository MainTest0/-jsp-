<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

<title>Insert title here</title>
<style type = "text/css">
	*{
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}

	body{
		display: flex;
		justify-content: center;
		
	}
	/*
	 flex-grow 값은 flex item이 늘어날 수 있는 비율을 지정하며, 기본값은 0이다.
	 flex-grow 속성을 사용하여 확장하는 크기 비율을 조정할 수 있다.
	 flex: 1 0 0 중 첫번째 
	*/
	/* 
	
	 */
	.page-container{
		flex: 1 0 0;
		max-width: 500px;
		display: flex;
		justify-content: center; 
		/* 수직방향 정렬 */
		flex-direction: column;
		padding: 0 16px;
		
	}
	
	.header{
		height: 80px;
		/* 얼마큼 늘어날건지 얼마큼 줄어들건지 기본크기 */
		flex: 0 0 80px;
		border-bottom: 1px solid grey;
		background-color: blanchedalmond;
		display: flex;
		justify-content: flex-end;
		align-items: center;
		padding: 0 20px;
	}
	.main-container{
		flex: 1;
		padding: 0 16px;
		background-color: blanchedalmond;
	}

	.section-title-heading{
		margin: 20px 0;
		font-size: 1.5rem;
	}
	
	.section-home-menu{
		display: flex;
		justify-content: flex-start;
		
	}
	
	.menu-icon{
		display: flex;
		flex-direction: column;
		border: 1px solid grey;
		align-items: center;
		justify-content: center;
		padding: 10px;
		border-radius: 20px;
		
		flex: 0 0 20px;
		margin-right: 10px;
	}
	
	.article{
		display:flex;
		flex-direction: column;
	}
	
	.article-img{
		flex: 2 0 30px;
		margin-bottom: 20px;
	}
	
	.article-img-description{
		flex: 1;
	}
	
</style>
</head>
<body>
	<div class = "page-container">
	
		<div class = "header">
		<span class="material-symbols-outlined">search</span>
		<span class="material-symbols-outlined" style = "color: red">favorite</span>
		</div>
		<div class = "main-container">
			<div class = "section section-title">
				<h2 class = "section-title-heading"> Recipes </h2>
			</div>
			
			<div class = "section section-home">
			<!-- 우리가 직접 만든 아이콘 -->
			<div class = "section-home-menu">
				<div class = "menu-icon">
					<span class="material-symbols-outlined" style="color: red">home</span>
					<span>ALL</span>
				</div>
				<div class = "menu-icon">
					<span class="material-symbols-outlined" style="color: red">home</span>
					<span>ALL</span>
				</div>
				<div class = "menu-icon">
					<span class="material-symbols-outlined" style="color: red">home</span>
					<span>ALL</span>
				</div>
				<div class = "menu-icon">
					<span class="material-symbols-outlined" style="color: red">home</span>
					<span>ALL</span>
				</div>
			</div>
			<br>
			<div class = "article">
				<img alt="" class="article-img" src="images/cat4.jpg">
				<span class = "article-img-description">일어났구만..</span>
			</div>
			<div class = "article">
				<img alt="" class="article-img" src="images/cat5.jpg">
				<span class = "article-img-description">일어났으면 밥 달라!</span>
			</div>
			<div class = "article">
				<img alt="" class="article-img" src="images/cat6.jpg">
				<span class = "article-img-description">밥달라 ㅈㅂ...</span>
			</div>
			<div class = "article">
				<img alt="" class="article-img" src="images/cat7.jpg">
				<span class = "article-img-description">호두</span>
			</div>
			<div class = "article">
				<img alt="" class="article-img" src="images/cat8.jpg">
				<span class = "article-img-description">사진</span>
			</div>
			</div>
		</div>
		
	</div>
	
</body>
</html>