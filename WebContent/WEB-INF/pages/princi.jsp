<%@  taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>    
  <body>
   
   <form:form action="princiform.nr" commandName="principal">
    <table>
    <tr><td>UserName</td>
    <td><form:input path="pusername"/></td>
    <td><font color="red"><form:errors path="pusername"/></font></td>
    </tr>
    <tr><td>Password</td>
    <td><form:password path="ppwd"/></td>
    <td><font color="red"><form:errors path="ppwd"/></font></td>
    </tr>
    <tr><td><input type="submit" value="Submit"/></td></tr>
    
    </table>
   
   </form:form>
   
  </body>
</html>
