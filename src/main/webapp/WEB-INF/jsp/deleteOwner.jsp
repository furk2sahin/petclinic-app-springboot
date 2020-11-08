<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="owner" method="post">
	First Name: <form:input path="firstName"/>
	<form:errors path="firstName"/><br/>
	Last Name: <form:input path="lastName"/>
	<form:errors path="lastName"/><br/>
	<form:button name="submit">Delete</form:button>
	</form:form>
</body>
</html>