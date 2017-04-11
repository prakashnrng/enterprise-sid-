<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <body>
    <table>
      <tr><td>
     
      <f:if test="${not empty UNAME}">${error}</f:if>
      <f:if test="${not empty UNAME}">${message}${UNAME}</f:if>
      </td></tr>
      </table>
     <%--  Hi......${UNAME }  --%>
     
     
    
  </body>
</html>
