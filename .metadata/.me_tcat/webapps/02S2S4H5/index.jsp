<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>临时用页面</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/CustomerServlet">访问CustomerServlet</a>
	<hr/>
	<a href="${pageContext.request.contextPath}/cmservice/findCustomerById.action">访问动作类</a>
</body>
</html>