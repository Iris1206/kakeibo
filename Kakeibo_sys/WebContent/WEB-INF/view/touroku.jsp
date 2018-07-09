<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<body>
	<form action="/Kakeibo_sys/Tourokukekka">
		ID:<input type="text" name="id">
		内容:<input type="text"name="naiyou">
		金額:<input type="text" name="money">
		判定:<input type="text" name="hantei">
		月:<input type="text" name="month">
		日：<input type="text" name="day">

		<input type="submit" value="登録">
	</form>
	<form action="/Kakeibo_sys/Top">
		<INPUT type="submit" value="戻る">
	</form>
</body>
</html>