<%-- 
    Document   : newjsp
    Created on : May 7, 2018, 6:11:48 PM
    Author     : INNOCENT
--%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Duke's Soccer League:Home</title>
    </head>
    <% Date d=new Date();
    %>
    <body Bgcolor='white'>
        <table border='1' cellpadding='5'cellspacing='0' width='400'>
            <tr bgcolor='#CCCCFF' align='center' valign='center' height='20'>
                <td><h3> Duke's Soccer League:List Leagues</h3>
                    <h1>Today Date:<%= d%></h1></td>
            </tr>
            
        </table>
        <p>The set of Soccer Leagues are:</p>
        <ul>
            <li>The Summer of Soccer Love 2004</li>
            <li>Fall Soccer League (2003)</li>
            <li>Soccer League (Spring'03)</li>
            <li>Summer Soccer Fest 2003</li>
            <li>Soccer League(Spring '04)</li>
        </ul>
    </body>
</html>

