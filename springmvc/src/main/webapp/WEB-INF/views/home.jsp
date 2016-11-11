<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<html>
    <head>
        <title>Attendance</title>
        <%--<link rel="stylesheet"--%>
              <%--type="text/css"--%>
              <%--href="<c:url value="/resources/style.css" />">--%>
    </head>
    <body>
        <h1>Attendance</h1>
        <%--<a href="<c:url value="/spittles" />">Spittles</a> |--%>
        <%--<a href="<c:url value="/spitter/register" />">Register</a>--%>
        <%--<sf:form method="POST" commandName="User">--%>
            <%--ID :<sf:input path="id" /><br/>--%>
            <%--<input type="submit" value="Register" />--%>
        <%--</sf:form>--%>
        <%--<tr>--%>
            <%--<td>商品名称</td>--%>
            <%--<td><input type="text" name="name" value="${user.birthday }"/></td>--%>
        <%--</tr>--%>
        <a href='${pageContext.request.contextPath}/items/queryItems'>前往查询页</a>
    </body>
</html>