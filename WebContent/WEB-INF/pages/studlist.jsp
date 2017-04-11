<%-- <%@page import="org.apache.struts2.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" import="java.util.*"  %>
 <%@ page language="java" import="com.nr.stmarys.*"  %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
   
     
   <table background="red" border="2">
    <tr><!--  -->
     
    
    <th colspan="4">studentid </th>
    <th colspan="4">Student Name</th>
    <th colspan="4">Student Section</th>
    <th colspan="4">Student class no</th>
    <th colspan="4">Student Fname</th>
    <th colspan="4">Student Mname</th>
    <th colspan="4">Student Gender</th>
    <th colspan="4">Student Addres</th>
    <th colspan="4">Student Mblno</th>
    <th colspan="4">Student cast</th> 
    <th colspan="4">Fee Details</th></tr> 
   
   <%
   Object o=session.getAttribute("LSTU");
    
       
    %>
    
    <c:forEach items="${LSTU }" var="s">
    
         <f:form action="studentfee.nr" commandName="student">
      
   <tr>
  
      <td colspan="4">
      
       <f:hidden path="sid"  value="${s.sid }"/> 
       ${s.sid}      </td>
        
     <td colspan="4">
      
      ${s.sname}  </td> 
       
     <td colspan="4">${s.section} </td>
           
     <td colspan="4">
      
      ${s.classno}   </td>
     
      
     <td colspan="4">
      
     ${s.fname} </td>
      
     <td colspan="4">
      
     ${s.mname} </td> 
     <td colspan="4">${s.gender}</td> 
     <td colspan="4">${s.address} </td> 
     <td colspan="4">${s.mblno} </td> 
     <td colspan="4">${s.cast} </td> 
      <td colspan="4"> <input type="submit" value="FeeDetails"/> </td>
      </tr>
      
   </f:form>
   
   </c:forEach>
   
   
    
   
   </table>
   
    
  </body>
</html>
 --%>