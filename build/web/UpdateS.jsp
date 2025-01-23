<%-- 
    Document   : UpdateS
    Created on : Jan 17, 2025, 10:05:17 PM
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
        <c:set value="${service}" var="l"/>
        <form action="UpdateService" method="post" accept-charset="UTF-8">
        <table>
            <tbody>
                <tr>
                    <td>ServiceID</td>
                    <td><input type="text" name="serviceID" value="${l.serviceID}" readonly/></td>
                </tr>
                <tr>
                    <td>Service Name</td>
                    <td><input type="text" name="serviceName" value="${l.serviceName}"/></td>
                </tr>
                <tr>
                    <td>Hourly Rate</td>
                    <td><input type="number" name="hourlyRate" value="${l.hourlyRate}"/></td>
                </tr>
                <tr>
            <input type="submit" value="Update" />
                </tr>
            </tbody>
        </table>
        </form>

    </body>
</html>
