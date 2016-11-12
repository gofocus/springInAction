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

        <a href='${pageContext.request.contextPath}/items/queryItems'>前往查询页</a>
    </body>
</html>