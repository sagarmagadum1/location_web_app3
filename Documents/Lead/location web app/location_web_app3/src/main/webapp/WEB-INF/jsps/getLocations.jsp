<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h2>All Locations</h2>
     <table border="1">
     <tr>
          <th>Id</th>
          <th>Code</th>
          <th>Name</th>
          <th>Type</th>
          <th>Delete</th>
      </tr>
       <c:forEach items="${locations}" var="locations" >
       <tr>
         <td>${locations.id }</td>   
          <td>${locations.code}</td>   
           <td>${locations.name }</td>   
           <td>${locations.type }</td>  
           <td><a href="deleteLocation?id=${locations.id }">delete</a></td>
           </tr>
           </c:forEach> 
      </table>
</body>
</html>