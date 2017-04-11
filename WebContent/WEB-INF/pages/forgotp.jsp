<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"  %>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="c" %>
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    

  </head>
  
  <body>
    
    <table>
    
    <c:form action="fortpwd.nr" commandName="USR">
    <tr><td>Enter Email</td></tr>
    <td><c:input path="uemail"/>
    </td>
    <tr><td>Enter mibile no</td>
    <td><c:input path="umbl"/></td>
    </tr>
    <tr><td><input type="submit" value="Submit"></td></tr> 
    
    
    </c:form>
    </table>
    
  </body>
</html>
