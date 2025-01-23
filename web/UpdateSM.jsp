<%-- 
    Document   : UpdateSM
    Created on : Jan 22, 2025, 2:43:48 AM
    Author     : Admin_Coder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set value="${serviceSM}" var="l"/>
        <form action="UpdateServiceMechanic" method="post" accept-charset="UTF-8">
            <table>
                <tbody>
                    <tr>
                        <td>serviceTicketID</td>
                        <td><input type="text" name="serviceTicketID" value="${l.serviceTicketID}" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td>serviceID</td>
                        <td><input type="text" name="serviceID" value="${l.serviceID}" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td>mechanicID</td>
                        <td><input type="text" name="mechanicID" value="${l.mechanicID}" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <td>hours</td>
                        <td><input type="text" name="hours" value="${l.hours}" /></td>
                    </tr>
                    <tr>
                        <td>comment</td>
                        <td><input type="text" name="comment" value="${l.comment}" /></td>
                    </tr>
                    <tr>
                        <td>rate</td>
                        <td><input type="text" name="rate" value="${l.rate}" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Update" /></td>
                    </tr>
                </tbody>
            </table>
        </form>

    </body>
</html>
