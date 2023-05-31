<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
<style>
div {
	color: red; 
	font-size : 10pt;
	font-weight: bold;
	font-size: 10pt;
}
</style>
</head>
<body>
	<form id="updateForm">
		아이디 입력 <input type="text" name="id" id="id"> 
		<input type="button" value="검색" id="searchBtn">
		<div id="idDiv"></div>
		<table id="updateTable">
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" id="name">
					<div id="nameDiv"></div>
					</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="text" name="pwd" id="pwd">
					<div id="pwdDiv"></div>
					</td>
			</tr>
			<tr>
				<td colspan=2 align="center">
				<input type="button" value="등록" id="updateBtn">
				<input type="button" value="취소" id="cancelBtn">
				</td>
			</tr>
		</table>
	</form>
	<script src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
	<script src="/js/update.js"></script>
</body>
</html>