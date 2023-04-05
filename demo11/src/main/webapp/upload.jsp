<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
<!-- 누가 내컴퓨터에 파일 업로드하면 내컴퓨터에 저장되어야한다. -->
<!-- 파일 업로드 폼을 하기위해서는 enctype="multipart/form-data"적어줘야한다. -->
	<form action="uploadProc" method="post" enctype="multipart/form-data">
		<label for="file">Choose a file : </label>
		<input type="file" name="file" id="file">
		<br>
		<input type="submit" value="파일 업로드">
	</form>
</body>
</html>