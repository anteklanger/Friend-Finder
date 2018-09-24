<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp" %>
<div class="bg">
<h2>REGISTER</h2><br>
<h3>Your interests:</h3><br>

<form:form method="post" modelAttribute="interestList">

    <h3>SPORTS</h3>
    <table >
        <c:forEach items="${sport}" var="sport" varStatus="iterator">
            <tr align="left">
                <td align="left"><form:checkbox path="empty" value="${sport.intrestName}"/> ${sport.intrestName}</td>
            </tr>
        </c:forEach>
    </table>

    <h3>MOVIE</h3>
    <table >
        <c:forEach items="${movies}" var="movies" varStatus="iterator">
            <tr align="left">
                <td align="left"><form:checkbox path="empty" value="${movies.intrestName}"/>${movies.intrestName}</td>
            </tr>
        </c:forEach>
    </table>

    <h3>SCIENCE</h3>
    <table>
        <c:forEach items="${science}" var="science" varStatus="iterator">
            <tr align="left">
                <td align="left"><form:checkbox path="empty" value="${science.intrestName}"/>${science.intrestName}</td>
            </tr>
        </c:forEach>
    </table>

    <h3>MUSIC</h3>
    <table >
        <c:forEach items="${music}" var="music" varStatus="iterator">
            <tr align="left">
                <td align="left"><form:checkbox path="empty" value="${music.intrestName}"/>${music.intrestName}</td>
            </tr>
        </c:forEach>
    </table>

    <h3>GAMES</h3>
    <table >
        <c:forEach items="${games}" var="games" varStatus="iterator">
            <tr align="left">
                <td align="left"><form:checkbox path="empty" value="${games.intrestName}"/>${games.intrestName}</td>
            </tr>
        </c:forEach>
    </table>

    <h3>BOOKS</h3>
    <table>
        <c:forEach items="${books}" var="books" varStatus="iterator">
            <tr align="left">
                <td align="left"><form:checkbox path="empty" value="${books.intrestName}"/>${books.intrestName}</td>
            </tr>
        </c:forEach>
    </table>
    <h3>LIFESTYLE</h3>
    <table>
        <c:forEach items="${lifestyle}" var="lifestyle" varStatus="iterator">
            <tr align="left">
                <td align="left"><form:checkbox path="empty" value="${lifestyle.intrestName}"/>${lifestyle.intrestName}</td>
            </tr>
        </c:forEach>
    </table>
    <h3>CULTURE</h3>
    <table>
        <c:forEach items="${culture}" var="culture" varStatus="iterator">
            <tr align="left">
                <td align="left"><form:checkbox path="empty" value="${culture.intrestName}"/>${culture.intrestName}</td>
            </tr>
        </c:forEach>
    </table>
    <table>
    <tr>
        <td><input type="submit" value="FINISH REGISTRATION"></td>
    </tr>

    </table>
</form:form>

</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="js/app.js"></script>
</body>
</html>
