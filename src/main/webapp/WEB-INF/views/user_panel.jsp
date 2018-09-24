<%@include file="head.jsp" %>
<div class="bg">
    <title>User Panel</title>
    <h1>GRATULACJE UDALO CI SIE ZALOGOWAC</h1>
    <h2>Zalogowano jako ${nick}</h2>
    <button class="agenda-success-btn" type="button" onclick="window.location='/home/update'">EDIT YOUR DATA</button>
    <button class="agenda-success-btn" type="button" onclick="window.location='/home/friends'">FRIENDS</button>
    <button class="agenda-success-btn" type="button" onclick="window.location='/home/messages'">MESSAGES</button>
    <button class="agenda-success-btn" type="button" onclick="window.location='/home/login'">LOG OUT</button>

</div>
</body>
</html>
