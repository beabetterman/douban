<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.lang.Exception"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<span>exp.jsp</span>
	</div>
	<% Exception ex = (Exception)request.getAttribute("exception"); %>
	<H2>Exception: <%= ex.getMessage()%></H2>
	<P/>
	<% ex.printStackTrace(new java.io.PrintWriter(out)); %>
</body>
</html>