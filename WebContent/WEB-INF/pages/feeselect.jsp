<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page language="java" import="com.nr.stmarys.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>    
  <body>
   <h1>Fee Details by class wise</h1>
   <%
   Object o=request.getAttribute("student");
   Student st=(Student)o;
    %>
   <form:form action="searchfeebyidform.nr" commandName="student">
   
    <table>
   <tr><td>
   Enter Student Id
   </td>
   <td><form:input path="sid" value="${st.sid }"/></td>
   <td><form:errors path="sid"/></td>
   </tr>
   <tr><td>
   Enter the Std
   </td>
   <td><form:input path="classno"/>  
   </td>
   <td><form:errors path="classno"/></td>
   </tr>
   <tr><td>
   Enter the Section
   </td>
   <td><form:input path="section"/></td>
   <td><form:errors path="section"/></td>
   </tr>
   <tr><td>
   Enter the Section
   </td>
   <td><form:input path="section"/></td>
   <td><form:errors path="section"/></td>
   </tr>
   
   
   
   <tr><td><input type="submit" value="SEARCH">
   
   
   </table>
   
   
   
   
   </form:form>
  </body>
</html>
 --%>