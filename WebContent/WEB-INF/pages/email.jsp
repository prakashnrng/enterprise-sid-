<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   

  </head>
  
  <body>
  <h1>Sending email</h1>
  <c:form action="mailsend.nr" commandName="EF">
  <table> 
  <tr><td>To</td>
      <td><c:input size="30" path="email"/></td>  </tr>
  <tr>
  <td>To</td>
  <td><c:input  path="to"/></td></tr>
  <tr>
  <td>Subject</td>
  <td><c:input path="subject"/></td></tr>
  <tr>
  <td><c:textarea path="message"/></td>
  </tr>
  <tr>
  <td>
   <input type="submit" value="submit"></td></tr>
  
   </table>
  </c:form>
   
   
  
  
   
  
 <%-- <c:form action="getmail.nr" commandName="EF">
 <table>
  <td><c:input size="30" path="email"/></td>
 
 <tr><td> <c:input  path="subject"/></td></tr>
    
  <tr>
 <td>message</td>
 <td><c:input  path="message"/></td></tr>
 
 
 </table>
 </c:form>
 
 
 
 </table>
  --%>
 
   
  </body>
</html>
