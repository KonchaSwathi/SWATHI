<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form"prefix="spring-form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring-form:form action="${pageContext.request.contextPath}/student/save"   method="POST" modelAttribute="student">
<br/>
<br/>
<spring-form:label path="name">enter name</spring-form:label>
<spring-form:input path="name"/>
<br/>
<br/>
<spring-form:label path="email">enter email</spring-form:label>
<spring-form:input path="email"/>
<br>
<br/>
<spring-form:label path="address">enter address</spring-form:label>
<spring-form:input path="address"/>
<br/>
<input type="submit" value="save">
</spring-form:form>

</body>
</html>