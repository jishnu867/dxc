<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/sql" prefix="sql" %>

<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/tufail"
scope="session" user="root" password="root1" />

<html>
  <head>
    <title>Query Example</title>
  </head>

  <body>

<sql:query var = "users" dataSource="${dataSource}">
select Roll,Name,Address,Marks from Student
</sql:query>

<table border=1>
<c:forEach var="row" items="${users.rows}">
<tr>
<td><c:out value="${row.Roll}"/></td>
<td><c:out value="${row.Name}"/></td>
<td><c:out value="${row.Address}"/></td>
<td><c:out value="${row.Marks}"/></td>

</tr>
</c:forEach>
</table>


  </body>
</html>


           
       