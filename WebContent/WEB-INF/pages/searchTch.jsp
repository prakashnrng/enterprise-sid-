<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   
     
       <h1>Teacher Details</h1>
  <body>
    <form:form action="srchTchFrom.nr" commandName="teacher"> 
    <table>
    
    <tr><td>Enter Teacher Id</td>
    <td><form:input path="tid"/></td>
    <td><form:errors path="tid"/></td>
    </tr>
    <tr><td><input type="submit" value="Search"></td></tr> 
    
    </table>
    
    </form:form>
  </body>
</html>
