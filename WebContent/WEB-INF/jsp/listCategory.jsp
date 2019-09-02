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
<div style="width:500px;margin:0px auto;text-align: center">
	<table align="center" border="1" cellspacing='0'>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>编辑</td>
		</tr>
		<c:forEach items="${cs}" var="c" varStatus="st">
			<tr>
				<td>${c.id}</td>
				<td>${c.name}</td>
				<td><a href="editCategory?id=${c.id}">编辑</a></td>
				<td><a href="deleteCategory?id=${c.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<div style="text-align: center">
		<a href="?start=0">首 页</a>
		<a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a>
		<a href="?start=${page.last}">末 页</a>
	</div>
	<form action="addCategory">
		<table align="center" border="1" cellspacing='0'>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value=""/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="添加分类"></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>