<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>留言板</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/write.jsp">去留言</a>
	<h3>过往留言:</h3>
	<div>${msg}</div>
</body>
</html>