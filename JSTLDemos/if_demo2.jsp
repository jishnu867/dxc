<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
  <head>
    <title>If with Body</title>
  </head>

  <body>
    <c:if test="${pageContext.request.method=='POST'}">
      <c:if test="${param.guess=='5'}">You guessed my number!
      <br />

      <br />

      <br />
      </c:if>

      <c:if test="${param.guess!='5'}">You did not guess my number!
      <br />

      <br />

      <br />
      </c:if>
    </c:if>

    <form method="post">Guess what number I am thinking of?
    <input type="text" name="guess" />

    <input type="submit" value="Try!" />

    <br />
    </form>
  </body>
</html>


           
       