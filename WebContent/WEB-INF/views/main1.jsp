<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:url value="/" var="url"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Pr20200609</h1>
	<form:form action="${url }submit"  method="post" modelAttribute="account">
		<div>
			<form:errors  value="${emailerror }" cssClass="text-danger"/>
<%-- 			<form:errors path="account" cssClass="text-danger"/> --%>
		</div>
		<div>
			uid:<br>
			<form:input path="uid"/>
			<form:errors path="uid" cssClass="text-danger"/>
		</div>
		<div>
			username:<br>
			<form:input path="username"/>
		</div>
		<div>
			email:<br>
			<form:input path="email"/>
			<form:errors path="email" cssClass="text-danger"/>
		</div>
		<div>
			manager:<br>
			<form:input path="manager"/>
		</div>
		<div>
			<form:errors path="title" cssClass="text-danger"/>
		</div>
		<br>
		<input type="submit" value="submit"/>
		
	</form:form>

</body>
</html>