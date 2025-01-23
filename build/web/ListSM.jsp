<%-- 
    Document   : ListSM
    Created on : Jan 18, 2025, 4:20:34 AM
    Author     : Admin_Coder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="HomeMechanic.jsp">Home</a>
        <table border="1">
            <thead>
                <tr>
                    <th>serviceTicketID</th>
                    <th>serviceID</th>
                    <th>mechanicID</th>
                    <th>hours</th>
                    <th>comment</th>
                    <th>rate</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${dataSM}" var="l">
                <tr>
                    <td>${l.serviceTicketID}</td>
                    <td>${l.serviceID}</td>
                    <td>${l.mechanicID}</td>
                    <td>${l.hours}</td>
                    <td>${l.comment}</td>
                    <td>${l.rate}</td>
                    <td>
                        <a href="UpdateServiceMechanic?serviceTicketID=${l.serviceTicketID}&serviceID=${l.serviceID}">Update</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
