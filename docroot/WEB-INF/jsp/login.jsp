<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>


<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="lui" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://code.jquery.com/jquery-1.12.3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<portlet:defineObjects />

<portlet:actionURL var="authenticate">
<portlet:param name="action" value="authenticate"/>
</portlet:actionURL>

<title>Insert title here</title>
</head>
<body>

<div class="output" ></div>
<form:form action="${authenticate}" commandName="loginBean" method="POST">

Enter your username:<input name="name" type="text"/>
<form:hidden path="username" id="username"/>
Enter your password:<input name="password" type="text"/>
<form:hidden path="password" id="password"/>
<input type="submit"/>
</form:form>

<div>
	<script type="application/json" class="hi__json" > ${hi} </script>
	<!--  <script>
		var hi__json = JSON.parse( $('.hi__json').html() );
		var id = hi__json.id;
		alert(id);
	</script>-->
</div>
</body>
</html>