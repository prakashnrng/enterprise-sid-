<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u" %>

 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <body>
<u:if test="${UNR eq 'already registered' }"> user name already register provide another user name
  </u:if>   
  
<u:if test="${EML eq 'email registered' }"> email  already registeref provide another email id
  </u:if>  
  
  <u:if test="${CPWD eq 'pwd not' }">email and cpwd are not correct</u:if>
  
  
  <u:if test="${PWD eq 'not equal' }"> password and pwd doesnot match
  </u:if>  
  
   <c:form action="newuform.nr" commandName="US">
   <table>
   <tr><td>Name</td>
   <td><c:input path="uname"/></td>
   <td><c:errors path="uname"/></td>
   </tr>
   <tr><td>Password</td>
   <td><c:password path="pwd"/></td>
   <td><c:errors path="pwd"/></td>
   </tr>
   
   <tr><td>confirmPassword</td>
   <td><c:password path="rpwd"/></td>
   <td><c:errors path="rpwd"/></td>
   </tr>
   
   
   <tr>
   <td>
   MobilNo</td>
   <td><c:input path="umbl"/></td> 
   <td><c:errors path="umbl"/></td>  
   </tr>
   
   <tr><td>email</td>
   <td><c:input path="uemail"/></td>
   <td><c:errors path="uemail"/></td>
   </tr>
   
   
   <tr><td>Role</td>
   <td><c:select path="role">
   <c:option value="manager">Manger</c:option>
   <c:option value="admin">Admin</c:option>
      </c:select></td>
      <td><c:errors path="role"/></td>
      </tr>
   
   
      
   
   <tr><td><input type="submit" value="Submit"></td></tr>
   </table>
   
   </c:form>
   
  </body>
</html>
