<%--
  Created by IntelliJ IDEA.
  User: vannam
  Date: 10/10/2022
  Time: 08:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    *{
        padding: 0;
        margin: 0;
        box-sizing: border-box;
    }
    body{
        width: 100%;
        height: 100%;
    }
    header{
        background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(https://images.pexels.com/photos/994605/pexels-photo-994605.jpeg?auto=compress&cs=tinysrgb&w=1200);
        height: 100vh;
        background-size: cover;
        background-position: center;
    }
    #main{
        background: transparent;
        width: 100%;
        height: 50px;
    }
    #main .logo{
        float: left;
    }
    #main nav ul {
        float: right;
        margin-right: 20px;
        margin-top: 20px;
    }
    #main nav ul li {
        list-style-type: none;
        display: inline-block;
        margin: 0 8px;
        line-height: 50px;
    }
    #main nav ul li a {
        text-decoration: none;
        color: #fff;
        font-size: 14px;
        padding: 6px 13px;
        transition: 0.5s all ease-out;
    }
    #main nav ul li a.active,
    #main nav ul li a:hover{
        background: coral;
        color: #fff;
        transition: 0.5s all ease-out;
    }
    .text {
        transform: translate(-50%,-50%);
        position: absolute;
        top: 54%;
        left: 35%;
    }
    .text h1 {
        color: #fff;
        font-size: 100px;
    }
    .text span {
        width: 4px;
        height: 20px;
        background: coral;
        transform: translate(-50%,50%);
        position: absolute;
        top: 5%;
        left: -15%;
    }
    .text p {
        font-size: 14px;
        line-height: 25px;
        letter-spacing: 2px;
        color: #fff;
        font-family: "Raleway", sans-serif;

    }
    .text .btn {
        width: 150px;
        height: 35px;
        border: none;
        background: coral;
        color: #fff;
        transition: 0.5s all ease-out;
        margin-top: 10px;
        font-family: "Raleway", sans-serif;
    }
    .text .btn:hover {
        background: transparent;
        border: 1px solid coral;
        transition: 0.5s all ease-out;
    }
</style>
<body>
<header>
    <div id="main">
        <div class="logo"></div>
        <nav>
            <ul>
                <li><a href="home.html">Home</a></li>
                <li><a href="/customer">Customer</a></li>
                <li><a href="/employee">Employee</a></li>
                <li><a href="/contract">Contract</a></li>
                <li><a href="/service">Service</a></li>
                <li><a href="home.html" class="active">Log in</a></li>
            </ul>
        </nav>
    </div>
    <div class="text">
        <p>Welcome to...</p>
        <h1>FURAMA</h1>
        <span></span>
        <p>Overlooking the long stretch of wide white sand on Danang Beach, <br> Furama Resort Danang is a gateway to three World Heritage Sites of Hoi An, My Son and Hue. </p>
        <br>
        <input type="button" class="btn" value="ORDER NOW">
    </div>
</header>
</body>
</html>
