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
		alert('삭제되었습니다.');
		location.href='/boardinfos'
	}
</script>
</c:if>
<script>
function deleteBi(){
	document.querySelector('#delFrm').submit();
}
</script>
<form method="post" action="/boardinfo/delete" id="delFrm">
	<input type="hidden" name="biNum" value="${bi.biNum }">
</form>
<table border="1">
	<tr>
		<th>번호</th>
		<td>${bi.biNum}</td>
	</tr>
	<tr>
		<th>제목</th>
		<td>${bi.biTitle}</td>
	</tr>
	<tr>
		<th>내용</th>
		<td>${bi.biContent}</td>
	</tr>
	<tr>
		<th>등록일</th>
		<td>${bi.credat}</td>
	</tr>
	<tr>
		<th>글쓴이</th>
		<td>${bi.biWriter}</td>
	</tr>
	<tr>
		<th colspan="2"><button onclick="location.href='/boardinfo/update?biNum=${bi.biNum}'">수정</button> <button onclick="deleteBi()">삭제</button></th>
	</tr>
</table>
</body>
</html>