<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.KakeiboDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>支出</title>
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
		<%
			@SuppressWarnings("unchecked")
			ArrayList<KakeiboDTO> al = (ArrayList<KakeiboDTO>) request.getAttribute("all");
			for (KakeiboDTO syu : al) {
		%>
		<tr>
			<td><%=syu.getId()%></td>
			<td><%=syu.getNaiyou()%></td>
			<td><%=syu.getMoney()%></td>
			<td><%=syu.getHantei()%></td>
			<td><%=syu.getMonth()%></td>
			<td><%=syu.getDay()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>