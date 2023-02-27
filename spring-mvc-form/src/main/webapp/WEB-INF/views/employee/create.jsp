<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/19/2022
  Time: 9:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:input path="contactNumber"/></td>
        </tr>
    </table>
<input type="submit" value="Create">
</form:form>
</body>
</html>
