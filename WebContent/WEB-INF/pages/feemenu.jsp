<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
  
   <font color=blue size="5">Fee Details </font>
   <c:if test="${EDIT eq 'FALSE'}">
   <form:form action="searchfee.nr" commandName="fee">
   
   <table>
   
    <tr><td>Enter ur sid value</td>
    <td>
   <form:input path="sid"/></td>
   <td>
   <font color=red><form:errors path="sid"/></font>
    </td></tr>
   <tr><td>
   <input type="submit" value="Search">
   </td></tr>
   
   </table>
   </form:form>
   </c:if>
  <%--  <c:if test="EDIT eq 'TRUE'">
   <h1>Enter the fee details</h1>
   <form:form action="feeupdate.nr" commandName="fee">
  
    <table>
     <tr> <th>Student ID</th><th>Student Name</th><th>Actual fee</th><th>Fee Paid</th><th>Bal Fee</th></tr>
     <tr><td>${}</td><td>${ }</td><td>${}</td><td>${ }</td><td>${ }</td></tr>
            
       
    
    </table>
    <input type="submit"/>
   </form:form>
   </c:if>
   
   --%> 
  </body>
</html>
