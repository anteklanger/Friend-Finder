<%@include file="head.jsp"%>
<h2>UPDATE</h2><br>

${user.nick}

<h3>Personal Data:</h3>
<form:form method="post" modelAttribute="user">
    Nick: <form:input path="nick"/><br>
    First name: <form:input path="firstName"/><br>
    Last name: <form:input path="lastName"/><br>
    Email: <form:input path="email"/><form:errors path="email"/> <br>
    Password: <form:password path="password" placeholder="Set new password"/><br>

    Date of birth: <form:select path="day" items="${dayC}"/><form:select path="month" items="${monthC}"/><form:select path="year" items="${yearC}"/> <br>

    Country:<br>
    <form:select path="country" items="${countryNames}"/><br>
    <input type="submit">

</form:form><br>

</body>
</html>
