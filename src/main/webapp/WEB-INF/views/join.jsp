<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h3>회원가입</h3>
	<hr>
	<form action="joinOk">
		아이디 :<input type="text" name="mid" size="60"><br><br>
		비밀번호 :<input type="text" name="mpw" size="60"><br><br>
		이름 :<input type="text" name="mname" size="60"><br><br>
		이메일 :<input type="text" name="memail" size="60"><br><br>
		<input type="submit" value="가입신청">
	</form>
	<hr>
	<h3>${joinFail}</h3>
</body>
</html>