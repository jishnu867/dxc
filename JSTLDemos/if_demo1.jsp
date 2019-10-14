<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
  <head>
    <title>Using Choose,Otherwise and When</title>
  </head>

  <body>
    <c:if test="${pageContext.request.method=='POST'}">
    Ok, we'll send 
    <c:out value="${param.enter}" />

    <c:choose>
      <c:when test="${param.enter=='1'}">pizza.
      <br />
      </c:when>

      <c:otherwise>pizzas.
      <br />
      </c:otherwise>
    </c:choose>
    </c:if>

    <form method="post">Enter a number between 1 and 5:
    <input type="text" name="enter" />

    <input type="submit" value="Accept" />

    <br />
    </form>
  </body>
</html>
