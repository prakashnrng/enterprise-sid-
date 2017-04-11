<%@page import="com.nr.enquiry.EnquiryForm"%>

<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="w" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%-- <%@ taglib uri="WEB-INF/struts-logic.tld" prefix="logic" %> --%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   

  </head>
  
  <body>
    
    <%
    Object ef= request.getAttribute("LED");
    List<EnquiryForm> li=(List<EnquiryForm>)ef;
    
     %>
     <%-- <c:if test="${fn:contains(NOT_FOUND,'no records available') }"> --%>
      <c:if test="${ NOT_FOUND eq 'not found'}">
       <div>
       <h1><font color="red">no records available</font></h1>
       </div>
       </c:if>
       <table>
       <c:if test="${ NOT_FOUND ne 'not found'}">
       
       <tr><td colspan="8" align="right">${BEGIN } to ${END} of ${TNOR}</td></tr>
       
     <table border="4">
<tr>

<th colspan="4">Id </th>
 <th colspan="4">Name</th>
 <th colspan="4">Mbl</th>
 <th colspan="4">Gender</th>
 <th colspan="4">Email</th>
 <th colspan="4">Qualification</th>
 <th colspan="4">State</th>
 <th colspan="4">Know</th>
 <th colspan="4">Course</th>
 <th colspan="4">Date</th>
 <th colspan="4">Address</th>
 <th colspan="4">CollegeName</th>
 <th colspan="4">Semester</th>
 
</tr>
 
<c:forEach var="e" items="${sessionScope.LED }" >

 <tr>
 
 <td colspan="4">${e.id}</td>
  

 <td colspan="4">${e.name}</td> 
 
  
 <td colspan="4">${e.mblno}</td> 
 
  
 
 <td colspan="4">${e.gender}</td> 
 
  
 
 <td colspan="4">${e.email}</td> 
 
  
 
 <td colspan="4">${e.quali}</td> 
 
  
 
 <td colspan="4">${e.state}</td> 
  
  <td colspan="4">
 <c:forEach var="ek" items="${e.know}">
${ek} <hr/>
 </c:forEach>
 </td>
 
  
 <td colspan="4">
   <c:forEach var="ec" items="${e.course}">
  ${ec}  <hr/>
 </c:forEach></td>
  
   
  
 
 <td colspan="4">${e.date}</td> 
  
  <td colspan="4">${e.address}</td>
  
  <td colspan="4">${e.collegeName }</td>
  
  <td colspan="4">${e.semester }</td>
 
</tr>
</c:forEach>    
</table>
 <tr>
 <%-- 
 <%
 session.setAttribute(arg0, arg1)
  %>
  --%>
 <f:form action="showprevdate.nr" commandName="EF">
 <%-- <a href='<c:url value="showprevdate.nr"/>'>Previous</a></td> --%>\
 <td colspan="4" align="left">
 
 <f:hidden value="${e.date}" path="date"/>
 <input type="submit" value="previous"/>
 </td>
 </f:form>
 
 <f:form action="shownewdate.nr" commandName="EF">
<td colspan="4" align="right">
 <%-- <a href='<c:url value="shownewdate.nr"/>'>Next</a> --%>
 <f:hidden value="${e.date}" path="date"/>
  <input type="submit" value="next"/>
  </td>
  </f:form>
 </tr> 
           
         </c:if>  
            <tr><td>
            
             <!-- <a href= "getExcel">download</a>    -->
        
            <f:form commandName="EF" action="downloadexcel.nr">
           <!--  <input type="date" -->
       <input type="submit" value="download">
       </f:form>  
            </td></tr>
     </table>
<%--      <table border="4">
<tr>

<th colspan="4">Id </th>
 <th colspan="4">Name</th>
 <th colspan="4">Mbl</th>
 <th colspan="4">Gender</th>
 <th colspan="4">Email</th>
 <th colspan="4">Qualification</th>
 <th colspan="4">State</th>
 <th colspan="4">Know</th>
 <th colspan="4">Course</th>
 <th colspan="4">Date</th>
</tr>
     
     
<c:forEach var="e" items="${requestScope.LED }">

 <tr>
 
 <td colspan="4">${e.id}</td>
  

 <td colspan="4">${e.name}</td> 
 
  
 <td colspan="4">${e.mblno}</td> 
 
  
 
 <td colspan="4">${e.gender}</td> 
 
  
 
 <td colspan="4">${e.email}</td> 
 
  
 
 <td colspan="4">${e.quali}</td> 
 
  
 
 <td colspan="4">${e.state}</td> 
  
  <td colspan="4">
 <c:forEach var="ek" items="${e.know}">
${ek} <hr/>
 </c:forEach>
 </td>
 
  
 <td colspan="4">
   <c:forEach var="ec" items="${e.course}">
  ${ec}  <hr/>
 </c:forEach></td>
  
   
  
 
 <td colspan="4">${e.date}</td> 
  
 

</c:forEach>    
</table>
 --%>
   </body>
</html>

