<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="ctag" uri="WEB-INF/customtag.tld"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom tag </title>
</head>
<body>
	Custom Taglib example....<br>
	<ctag:firstTag/>
	
	<ctag:message fromName="Sudarshan" toName="Ganesh">Welcome to Custom Tag</ctag:message>
</body>
</html>