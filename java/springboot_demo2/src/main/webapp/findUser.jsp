<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="searchUserById" method="get">
  <label for="fname">User ID (e.g. 101):</label>
  <input type="text" id="id" name="userId">
  <input type="submit" value="Submit">
</form>

</br></br>

<!-- 
<form action="searchUserByUsername" method="get">
  <label for="fname">User Name (e.g. user1):</label>
  <input type="text" id="username" name="username">
  <input type="submit" value="Submit">
</form>
 -->

</body>
</html>