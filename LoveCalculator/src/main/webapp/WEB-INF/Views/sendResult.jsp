<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Love Calculator - Email Confirmation</title>
<style type="text/css">
    body {
        background-image: url('/LoveCalculator/static/Images/bg.jpg');
        background-size: cover;
        background-position: center;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh; /* Full viewport height */
    }

    .container {
        max-width: 600px;
        width: 100%;
        margin: 20px;
        padding: 20px;
        background-color: rgba(255, 255, 255, 0.9);
        border-radius: 10px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.3);
        text-align: center;
    }

    h1 {
        color: #333;
        font-size: 36px;
        margin-bottom: 20px;
        border-bottom: 2px solid #333;
        padding-bottom: 10px;
    }

    h2 {
        color: #333;
        font-size: 24px;
        margin: 20px 0;
    }

    a {
        display: inline-block;
        text-align: center;
        color: white;
        background-color: #e5a8bc;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        text-decoration: none;
        font-size: 16px;
        cursor: pointer;
        margin-top: 20px;
    }

    a:hover {
        background-color: #e90b54;
    }
    
     b {
     	size:16px;
        color: blue; /* Changing text color to blue */
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Love Calculator</h1>
        <h3>Email has been sent to  <h4><b>${userEmail}</h4> </b></h3>
        <a href="${pageContext.request.contextPath}/">Calculate love with another?</a>
    </div>
</body>
</html>
