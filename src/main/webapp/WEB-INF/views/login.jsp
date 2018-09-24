<%@include file="head.jsp"%>
<div align="center" class="bg">
<h1 style="font-family: 'Times New Roman'">Friend Finder</h1><br>
<h2 style="font-family: 'Times New Roman'">Sign in</h2><br>

<table>

    <form:form method="post" modelAttribute="user">

        <tr>

            <td align="right" style="font-family: 'Times New Roman'">Nick: </td>
            <td><form:input path="nick"/></td>
        </tr>
        <tr>
            <td align="right" style="font-family: 'Times New Roman'">Password: </td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center" style="font-family: 'Times New Roman'"><form:button>LOG IN</form:button></td>
        </tr>
    </form:form>

</table>
<H2 style="font-family: 'Times New Roman'">Not registered yet?</H2><br>
<a href="register" class="agenda-success-btn" style="font-family: 'Times New Roman'">CREATE AN ACCOUNT</a>
</div>
</body>
</html>
