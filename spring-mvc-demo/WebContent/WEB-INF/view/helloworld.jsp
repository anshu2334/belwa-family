<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
Hello world of Spring!
<br>
<br>
student name: ${param.studentName}

<br>
The Message: ${message}
<hr>
<a href="${pageContext.request.contextPath}">Home</a>

</body>
</html>