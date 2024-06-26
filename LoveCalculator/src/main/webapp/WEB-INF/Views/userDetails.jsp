<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	max-width: 600px; /* Increase the max-width */
	width: 100%; /* Ensure the container takes full width up to the max-width */
	margin: 20px; /* Add some margin for spacing */
	padding: 20px;
	background-color: rgba(255, 255, 255, 0.9); /* Adding some opacity to make the text more readable */
	border-radius: 10px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.3); /* Adding shadow effect */
}

h1, h3, h4 {
	text-align: center;
	color: #333;
}


h1 {
	border-bottom: 2px solid #333; /* Add a bottom border */
	padding-bottom: 10px; /* Add some padding for spacing */
	margin-bottom: 20px; /* Add some margin for spacing */
}

.button-container {
	display: flex;
	justify-content: space-between;
	margin-top: 20px; /* Adjusting top margin for better spacing */
}

a.button {
	display: inline-block;
	text-align: center;
	color: white;
	background-color: #e5a8bc;
	padding: 10px 20px; /* Padding for the button */
	border: none;
	border-radius: 5px;
	text-decoration: none;
	font-size: 16px;
	cursor: pointer;
}

a.button:hover {
	background-color: #e90b54; 
}
</style>
</head>
<body>
	<div class="container">
		<h1>User Details</h1>
		

		<h4>Your Name: ${userData.userName}</h4>
		<h4>Your CrushName: ${userData.crushName}</h4>
		<h4>Your Email: ${userData.emailAddress}</h4>
		<h4>Your Age: ${userData.userAge}</h4>

		<div class="button-container">
			<a href="${pageContext.request.contextPath}/" class="button">Edit Details</a>
			<a href="resultSave" class="button">Next</a>
		</div>
	</div>
</body>
</html>
