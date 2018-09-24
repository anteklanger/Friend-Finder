<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <%--<link href="css/style.css" rel="stylesheet" type="text/css">--%>


    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <%--<link href="css/style.css" rel="stylesheet">--%>

    <style>
        body, div, html, table {
            /*width: 500px;*/
            margin: auto;
            text-align: center;
            /*background: darkgrey;*/
            justify-content: center;
            align-items: center;
            align-content: center;
        }

        td, tr, table {
            padding-right: 10px;
            padding-left: 10px;
            padding-bottom: 10px;
            padding-top: 10px;
        }

        .agenda-success-btn {
            text-decoration: none;
            color: black;
            display: flex;
            width: 400px;
            height: 50px;
            background-color: cornflowerblue;
            font-size: large;
            margin: 10px auto;
            justify-content: center;
            align-items: center;

        }

        .menu-btn {
            text-decoration: none;
            color: black;
            display: flex;
            width: 200px;
            height: 30px;
            background-color: cornflowerblue;
            font-size: smaller;
            margin: 10px auto;
            justify-content: center;
            align-items: center;
        }

        .center{
            justify-content: center;
            align-items: center;
        }

        .category{
            justify-content: left;
            align-items: left;
        }

        .bg{
            background-color: rgba(180, 186, 92, 0.4);        }
    </style>
</head>
<body background="/img/happy-friends.jpg">
