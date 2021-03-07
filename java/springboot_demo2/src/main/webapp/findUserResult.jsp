<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
   This is result1: </br>
   ${user.toString()}
   ${user.getUsername()}
   ${user.getPassword()}
   
   </br>This is result2:  </br>
   ${userlist}
   ${userlist.toString()}
   
   <c:if test="${not empty userlist}">

        <ul>
            <c:forEach var="userItem" items="${userlist}">
                <li>${userItem}</li>
            </c:forEach>
        </ul>

    </c:if>   
   
   
</body>
</html>