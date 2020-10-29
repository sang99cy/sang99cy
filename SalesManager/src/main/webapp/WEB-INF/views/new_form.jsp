<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>new_form</title>
</head>
<body>
	<div align="center">
		<h1>Enter New Sale</h1>
		<br />
		<form:form action="/save" method="post" modelAttribute="sale">

			<table border="1">
				<tr>
					<td>Item Name:</td>
					<td><form:input path="item"/></td>
				</tr>
				<tr>
					<td>Quantity:</td>
					<td><form:input path="quantity"/></td>
				</tr>
				<tr>
					<td>Amount (USD):</td>
					<td><form:input path="amount" /></td>
				</tr>
				<tr>
					<td colspan="2"><form:button value="themmoi">SAVE</form:button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>