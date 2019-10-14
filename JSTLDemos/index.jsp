<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		for (int i = 1; i <= 5; i++) {
			out.println("<h1>" + i + "</h1>");
		}
	%>
	<hr/>
	<c:forEach var="j" begin="1" end="10" step="1">
		<h1><c:out value="${j}"></c:out></h1>
	</c:forEach>

</body>
</html>