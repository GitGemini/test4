<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加留言</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/servlet/saveServlet">
用户：<input type="text" name="username" /><br/><br/>
<div style="floa:left;">留言：</div><textarea name="message" rows="5" cols="20"></textarea><br/><br/>
<input type="submit" value="提交" />
</form>
</body>
</html>