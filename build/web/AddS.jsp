<%-- 
    Document   : AddService
    Created on : Jan 18, 2025, 12:36:23 AM
    Author     : Admin_Coder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Service</h1>
        <form action="AddService" method="post" accept-charset="UTF-8">
            <table>
                <tbody>
                    <tr>
                        <td>ServiceID</td>
                        <td><input type="text" name="serviceID" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Service Name</td>
                        <td><input type="text" name="serviceName" value="" required=""/></td>
                    </tr>
                    <tr>
                        <td>Hourly Rate</td>
                        <td><input type="text" name="hourlyRate" value="" required=""/></td>
                    </tr>
                    <tr><td><input type="submit" value="Add Service" /></td></tr>                  
                </tbody>
            </table>
            <h3 style="color: red">${error}</h3>
        </form>
    </body>
</html>
