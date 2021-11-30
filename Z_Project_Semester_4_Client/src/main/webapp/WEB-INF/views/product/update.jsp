<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Update Product </h3>
	<table>
	
	
	<s:form method="post" modelAttribute="product" action="${pageContext.request.contextPath }/product/update">
	
	<tr>
		<td>ID</td>
		<td><s:hidden path="id"/></td>
		
	</tr>
	<tr>
		<td>Name</td>
		<td><s:input path="name"/></td>
		
	</tr>
	<tr>
		<td>Price</td>
		<td><s:input path="price"/></td>
		
	</tr>

	<tr>
		<td>Status</td>
		<td><s:checkbox path="status"/></td>
		
	</tr>
	
		<tr>
		<td>&nbsp;</td>
		<td>	<s:input type="submit" value="save" path=""/></td>
		
	</tr>
	</table>
	</s:form>
</body>
</html>