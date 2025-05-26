<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to smart programming</h1>
	<%!
	int rollno=101;
	String name="rakesh";
	public int add(int a,int b){
		return a+b;
	}
	%>
	
	<%=rollno %>
	<%=name %>
	<%=add(10,20) %>
	
	<%
	int no1=10;
	if(no1>5){
		out.println("true");
	}
	
	
	%>
	<%=LocalTime.now()
	
	%>
	
</body>
</html>