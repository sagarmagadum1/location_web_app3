<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show</title>
</head>
<body>
<h2>Location</h2>
<form action="savLoc" method="post" >
              Id<input type="text"  name="id" />
              Code<input type="text" name="code" />
               Name<input type="text" name="name" />
                Type Urban:<input type="radio" name="type" value="urban" />
                 Rural: <input type="radio" name="type" value="rural" />
                 <input type="submit" value="Save" />
            <%-- <c:out value="vikas"></c:out> --%>
    </form>
    ${msg }
</body>
</html>