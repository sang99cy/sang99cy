<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Sales Records</h1>
		<a href="${pageContext.request.contextPath}/new">Enter New Sale</a> <br />
		<br />
		<table border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>Item Name</th>
					<th>Quantity</th>
					<th>Amount</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="sale">
					<tr>
						<td>${sale.id}</td>
                        <td>${sale.item}</td> 
                        <td>${sale.quantity}</td>
                        <td>${sale.amount}</td>
                        <td><a href="${pageContext.request.contextPath}/edit/${sale.id}">Edit</a></td>
                        <td><a href="${pageContext.request.contextPath}/delete/${sale.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>