<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
   <h1>Welcome to Home Page</h1>
   <%-- 
   <br>
   <center>
   <table>
   <table border="1">
   <tr><td>
   <h1>Hi :<sec:authentication property="name"/>
     </h1>
     <sec:authorize ifAllGranted="ROLE_DIRECTOR">
     <h1>u r director</h1>
     </sec:authorize>
   <sec:authorize ifAllGranted="ROLE_ADMIN">
   <h1>u r manager</h1>
      </sec:authorize>
      <sec:authorize ifAllGranted="ROLE_STAFF">
      <h1> u  r  a staff</h1>
      </sec:authorize>
   </td>
   <td><h1><a href="j_spring_security_logout">Logout</a></h1></td></tr>
   </table>
   
   
   
   
    --%><tr height="200"><td align="center">
   <h1> 
   <a href="principal.nr">Principal</a></h1><br/>
   <h1>
   <a href="admin.nr">Admin</a></h1>
   <h1>
   <a href="teacher.nr">Teacher</a></h1>
   
   </table>
   </center>
  </body>
</html>
