<%@include file="head.jsp" %>
<div class="bg">
<h2>REGISTER</h2><br>
<h3>Personal Data:</h3>
<table>
    <form:form method="post" modelAttribute="user">
        <tr>
            <td>Nick:</td>
            <td><form:input path="nick"/></td>
            <br>
        </tr>
        <tr>
            <td>First name:</td>
            <td><form:input path="firstName"/></td>
            <br>
        </tr>
        <tr>
            <td>Last name:</td>
            <td><form:input path="lastName"/></td>
            <br>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/><form:errors path="email"/></td>
            <br>
        </tr>
        <tr>
            <td>Password:</td>
            <td><form:password path="password"/></td>
            <br>
        </tr>
        <tr>
            <td>Date of birth:</td>
            <td><form:select path="day" items="${dayC}"/>
                <form:select path="month" items="${monthC}"/>
                <form:select path="year" items="${yearC}"/></td>
        </tr>
        <br>

        <tr>
            <td>Country:</td>
            <br>
            <td><form:select path="country" items="${countryNames}"/></td>
            <br>
        </tr>
        <tr>
            <td align="center" colspan="2"><input type="submit" value="NEXT"></td>
        </tr>
    </form:form><br>
</table>
</div>
<%--<a href="register_2">NEXT STEP</a>--%>
</body>
</html>
