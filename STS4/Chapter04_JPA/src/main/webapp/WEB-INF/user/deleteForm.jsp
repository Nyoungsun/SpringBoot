<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제</title>
<style>
div {
	color: red;
	font-size: 10pt;
	font-weight: bold;
	font-size: 10pt;
}
</style>
</head>
<body>
	아이디 입력
	<input type="text" name="id" id="id">
	<input type="button" value="삭제" id="deleteBtn">
	<div id="idDiv"></div>
	<script src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
	<script src="/js/delete.js"></script>
</body>
</html>