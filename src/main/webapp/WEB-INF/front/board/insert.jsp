<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${! empty result}">
<script>
	if(${result}==1){
		alert('등록되었습니다.');
		location.href='/boardinfos'
	}
</script>
</c:if>
<form method="post" action="/boardinfo/insert" enctype="multipart/form-data">
	<input type="text" name="biTitle" placeholder="제목"><br>
	<textarea name="biContent"></textarea><br>
	<input type="text" name="biWriter" placeholder="이름"><br>
	<button>글쓰기</button>
</form>
</body>
</html>