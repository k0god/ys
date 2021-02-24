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
		alert('수정되었습니다.');
		location.href='/boardinfos'
	}
</script>
</c:if>
<form method="post" action="/boardinfo/update" enctype="multipart/form-data">
	<input type="hidden" name="biNUm" value="${bi.biNum }">
	<input type="text" name="biTitle" placeholder="제목" value="${bi.biTitle }"><br>
	<textarea name="biContent">${bi.biContent }</textarea><br>
	<input type="text" name="biWriter" placeholder="이름" value="${bi.biWriter }"><br>
	<button>글쓰기</button>
</form>
</body>
</html>