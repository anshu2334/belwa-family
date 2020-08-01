<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
	First Name: <form:input path="firstName"/>
	
	<br><br>
	
	Last name: <form:input path="lastName"/>
	<br><br>
	
	Country: <form:select path="country" >
			<form:options items="${student.countryOptions}"/>
				<%-- <form:option value="India" label="India" />
				<form:option value="USA" label="USA" />
				<form:option value="England" label="England" />
				<form:option value="Brazil" label="Brazil" />
				<form:option value="Canada" label="Canada" /> --%>
			 </form:select>
	<br><br>
	
	Country List from property file: <form:select path="country" >
			<form:options items="${theCountryOptions}"/>
				
			 </form:select>
	<br><br>
	
	
	Favourate Language: 
	<form:radiobuttons path="favourateLanguage" items="${student.favouriteLanguageOptions}"/>
	<%-- Java <form:radiobutton path="favourateLanguage" value="Java" />
	C# <form:radiobutton path="favourateLanguage" value="C#" />
	PHP <form:radiobutton path="favourateLanguage" value="PHP" />
	Ruby <form:radiobutton path="favourateLanguage" value="Ruby" />	 --%>	
	<br><br>
	
	Operating System: 
	<%-- <form:checkbox path="operatingSystems" items="${student.favouriteLanguageOptions}"/> --%>
	Windows <form:checkbox path="operatingSystems" value="Windows" />
	Linux <form:checkbox path="operatingSystems" value="Linux" />
	Unix <form:checkbox path="operatingSystems" value="Unix" />
	Mac <form:checkbox path="operatingSystems" value="Mac" />		
	<br><br>
	
	
	<input type="submit" value="Submit" />
</form:form>
</body>
</html>