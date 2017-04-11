<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  
  <body>
  
  <f:form action="showbyidregister.nr" commandName="REGF">
  <table>
  <tr><td>Enter id</td>
  <td><f:input path="id"/></td></tr>
  <tr><td><input type="submit" value="Submit"></td></tr> 
  </table>
  
  </f:form>
  
    
  </body>
</html>
