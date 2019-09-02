<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<table align="center" border="1" cellspacing='0'>
	<tr>
		<td>name</td>
		<td><input type="text" value="${category.name}" name="name"></td>
		<input type="hidden" value="${category.id}" name="id">
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="提交">
</table>
</form>
</body>
</html>