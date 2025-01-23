<%-- 
    Document   : List
    Created on : Jan 16, 2025, 4:21:11 PM
    Author     : Admin_Coder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function doDelete(serviceID) {
                if (confirm("Are you sure to delete Service id= '" + serviceID + "'?")) {
                    window.location = "DeleteService?serviceID=" + serviceID;
                }
            }
        </script>
    </head>
    <body>
        <a href="HomeMechanic.jsp">Home</a>
        <table border="1">
            <thead>
                <tr>
                    <th>serviceID</th>
                    <th>serviceName</th>
                    <th>hourlyRate</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${data}" var="c">
                <tr>
                    <td>${c.serviceID}</td>
                    <td>${c.serviceName}</td>
                    <td>${c.hourlyRate}</td>
                    <td>
                        <a href="#" onclick="doDelete('${c.serviceID}')">Delete</a>
                        <a href="UpdateService?serviceID=${c.serviceID}">Update</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="AddS.jsp">Add new service</a>

    </body>
</html>
