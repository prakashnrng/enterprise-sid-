<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body> 
    <font color=red>Welcome to Siddhrans Techonology</font>
    <table>
    <tr><td>
     <c:if test="${not empty UNAME}"> ${UNAME}${message}
     <tr><td> <a href="logouses.nr">Logout</a>  </td></tr>
     </c:if></td></tr>
     <tr><td>${message}</td></tr>
     
     </table>
     <table>
     
     </table>
  </body>
</html>
