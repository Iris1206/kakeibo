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
		ID:<input type="text" name="id"><br>
		内容:<input type="text"name="naiyou"><br>
		金額:<input type="text" name="money"><br><br>


		<select name = "hantei">
		<option value ="収入">収入</option>
		<option value ="支出">支出</option>
		</select><br>

		<select name ="month">
		<option value ="1">1月</option>
		<option value ="2">2月</option>
		<option value ="3">3月</option>
		<option value ="4">4月</option>
		<option value ="5">5月</option>
		<option value ="6">6月</option>
		<option value ="7">7月</option>
		<option value ="8">8月</option>
		<option value ="9">9月</option>
		<option value ="10">10月</option>
		<option value ="11">11月</option>
		<option value ="12">12月</option>
		</select>

		<select name ="day">
		<option value ="1">1日</option>
		<option value ="2">2日</option>
		<option value ="3">3日</option>
		<option value ="4">4日</option>
		<option value ="5">5日</option>
		<option value ="6">6日</option>
		<option value ="7">7日</option>
		<option value ="8">8日</option>
		<option value ="9">9日</option>
		<option value ="10">10日</option>
		<option value ="11">11日</option>
		<option value ="12">12日</option>
		<option value ="13">13日</option>
		<option value ="14">14日</option>
		<option value ="15">15日</option>
		<option value ="16">16日</option>
		<option value ="17">17日</option>
		<option value ="18">18日</option>
		<option value ="19">19日</option>
		<option value ="20">20日</option>
		<option value ="21">21日</option>
		<option value ="22">22日</option>
		<option value ="23">23日</option>
		<option value ="24">24日</option>
		<option value ="25">25日</option>
		<option value ="26">26日</option>
		<option value ="27">27日</option>
		<option value ="28">28日</option>
		<option value ="29">29日</option>
		<option value ="30">30日</option>
		<option value ="31">31日</option>
		</select>

		<input type="submit" value="登録">
	</form>
	<br>
	<form action="/Kakeibo_sys/Top">
		<INPUT type="submit" value="戻る">
	</form>
</body>
</html>