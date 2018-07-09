<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.KakeiboDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録結果</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>内容</th>
			<th>金額</th>
			<th>判定</th>
			<th>月</th>
			<th>日</th>
		</tr>
		<tr>
			<%KakeiboDTO syu = (KakeiboDTO)request.getAttribute("tou"); %>
			<td><%=syu.getId() %></td>
			<td><%=syu.getNaiyou() %></td>
			<td><%=syu.getMoney() %></td>
			<td><%=syu.getHantei() %></td>
			<td><%=syu.getMonth() %></td>
			<td><%=syu.getDay() %></td>
		</tr>
	</table>

	<form action="/Kakeibo_sys/Top">
		<INPUT type="submit" value="戻る">
	</form>
</body>
</html>