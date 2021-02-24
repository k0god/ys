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
<form method="GET" action="/boardinfos">
	<input type="text" name="biTitle" placeholder="제목"><br>
	<input type="text" name="biWriter" placeholder="글쓴이"><br>
	<button>검색</button>
</form>
<table border="1">
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="bi" items="${list}">
		<tr onclick="location.href='/boardinfo?biNum=${bi.biNum}'" style="cursor:pointer">
			<td>${bi.biNum}</td>
			<td>${bi.biTitle}</td>
			<td>${bi.biWriter}</td>
			<td>${bi.credat}</td>
			<td>${bi.biCnt}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<button onclick="location.href='/front/board/insert'">글쓰기</button>
</body>
</html>