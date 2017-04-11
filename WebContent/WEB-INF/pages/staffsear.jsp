<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    </head>
  
  <body>
   <%-- 
    <c:form action="stfsear.nr" commandName="STF">
    <table>
    <tr><td>StaffID</td>
    <td><c:input path="stafid"/></td>
    </tr>
    <tr><td>Mbl</td>
    <td><c:input path="smbl"/></td>
    </tr>
    
     
     
     <tr>
    <td><input type="submit" value="search"></td></tr>
    
    </table>
    
    
    
    </c:form>
   
    --%>

<c:form action="searstaffrm.nr" commandName="STF">
<table>
<tr><td>
<c:input path="stafid"/></td></tr>
<tr><td><input type="submit" value="submit">
</td></tr>
</table>
</c:form>

  </body>
</html>
