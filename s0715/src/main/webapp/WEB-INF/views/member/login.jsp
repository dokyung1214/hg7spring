<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
$(function (){
	$("#login_frm").click(function(){
		alert ("로그인되었습니다")
	})
	
}) // jquery 마침
</script>
<title>login.jsp</title>
</head>
<body>
<form action = "" method= "post" name="frm">
<label>아이디</label>
<input  type=text name="id" id="id">
<br>
<label>비밀번호</label>
<input  type=text name="pw" id="pw">
<br><br>
<input type="submit" value="로그인" id="login_frm">
</form>
</body>
</html>