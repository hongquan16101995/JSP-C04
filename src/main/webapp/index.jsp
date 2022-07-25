<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<h1>${demo}</h1>
<h2>${dog.getName()}</h2>
<h2>${dog.getAge()}</h2>
<c:forEach items="${animals}" var="a">
    <p>${a.getName()}</p>
    <p>${a.getAge()}</p>
</c:forEach>
<a href="hello-servlet">Hello Servlet</a>
<a href="login.jsp">Hello Servlet</a>
</body>
</html>