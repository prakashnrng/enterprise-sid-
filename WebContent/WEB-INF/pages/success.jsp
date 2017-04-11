<%@page import="com.nr.enquiry.EnquiryForm"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ page language="java" import="com.nr.enquiry.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="q" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  <body>
      <%
      Object ob=session.getAttribute("ENQUIRYD");
      EnquiryForm ef=(EnquiryForm)ob;
      Object ob2=session.getAttribute("EQEF");
      EnquiryForm eef=(EnquiryForm)ob2;
       %>
      
      
      <table border="3" >
      
       
      <q:if test="${EDIT eq 'FALSE' }">
      <tr><th colspan="6">SID</th>
      <td colspan="6">${ENQUIRYD.id }</td></tr>
      <tr> 
      <th colspan="6">NAME</th>
      <td colspan="6">${ENQUIRYD.name }</td></tr>
      <tr>
            <th colspan="6">DOB</th>
             <td colspan="6">${ENQUIRYD.dob}</td></tr>
             <tr>
      <th colspan="6">MBL</th>
      <td colspan="6">${ENQUIRYD.mblno}</td>
      </tr>
      <tr>
      <th colspan="6">GENDER</th>
      <td colspan="6">${ENQUIRYD.gender }</td>
      </tr>
      <tr>
      <th colspan="6">EMAIL</th>
      <td colspan="6">${ENQUIRYD.email }</td></tr>
      <tr>
      <th colspan="6">QUALI</th>
      <td colspan="6">${ENQUIRYD.quali }</td></tr>
      <tr>
      <th colspan="6">STATE</th>
      <td colspan="6">${ENQUIRYD.state }</td>
      </tr>
      <tr>
      <th colspan="6" >KNOW</th>
      <td>
            <q:forEach var="y" items="${sessionScope.KW }">
     ${y}
      <br/>
       </q:forEach>
       
       </td>
      </tr>
      <tr>
      <th colspan="6">COURSE</th>
        <q:forEach var="x" items="${sessionScope.CO }">
         
        <td colspan="6"> ${x} </td>
                            
       </q:forEach>
        
        </tr>
        <tr><th colspan="6">Date</th>
        <td colspan="6">${ENQUIRYD.date}</td></tr>
        
        
        <tr><th colspan="6">Address</th>
        <td colspan="6">${ENQUIRYD.address }</td></tr>
        
        <tr><th colspan="6">CollegeName</th>
        <td colspan="6">${ENQUIRYD.collegeName}</td></tr>
        
        <tr><th colspan="6">Semester</th>
        <td colspan="6">${ENQUIRYD.semester}</td></tr>
        
        
       
 <tr>
 <th>EDIT</th>
 
              
       <td><a href="editform.nr">EDIT</a></td> 
            
       
       </tr>
      </q:if>
        
        
 <q:if test="${EDIT eq 'TRUE' }">
           <c:form action="updateEnquiryForm.nr" commandName="EEF">
   <table border="4" background="yellow">
    <tr><th colspan="4">ID</th>
    <td colspan="4"><c:hidden path="id" value="${ENQUIRYD.id}"/>${ENQUIRYD.id}</td></tr>
    
    <tr>
      <th colspan="4">NAME</th>
   <td colspan="4">
   <c:input path="name" value="${ENQUIRYD.name}"/></td>   
      </tr>
      <tr>
      
      <th colspan="4">DOB</th>
      
   <td colspan="4"><c:input path="dob" value="${ENQUIRYD.dob}"/> </td>   
      </tr>
      <tr>
      <th colspan="4">MBL</th>
   <td colspan="4">
   <c:input path="mblno" value="${ENQUIRYD.mblno}"/></td>   
      </tr>
      <tr>
      <th colspan="6">GENDER</th>
      <td colspan="6">
   <c:hidden path="gender" value="${ENQUIRYD.gender}"/>${ENQUIRYD.gender}</td>   
      
      </tr>
      <tr>
      <th colspan="6">EMAIL</th>
   <td colspan="6"><c:input path="email" value="${ENQUIRYD.email}"/></td>   
      </tr>
      <tr>
      <th colspan="6">QUALI</th>
   <td colspan="6"><c:input path="quali" value="${ENQUIRYD.quali}"/></td>   
      </tr>
      <tr>
      <th colspan="6">STATE</th>
      <td colspan="6"><c:input path="state" value="${ENQUIRYD.state}"/></td>
      </tr>
      <tr>
      <th colspan="10">KNOW</th>
      <td colspan="10">
       
   <q:forEach var="y" items="${sessionScope.KW }">
   <c:hidden path="know" value="${y}"/>${y}  
      <br/>
       </q:forEach>
       </td>
       </tr>
       
      <tr>
      <th colspan="10">COURSE</th>
       <td colspan="10">
        <q:forEach var="x" items="${sessionScope.CO }">
   
   <td colspan="20"><c:hidden path="course" value="${x}"/>${x}</td>
       </q:forEach>
       </td>
    </tr>
   <tr>
    
      <tr><th colspan="6">Date</th>
        <td colspan="6">${ENQUIRYD.date}</td></tr>
    
    <tr>
    <th colspan="10">Address</th>
    <td colspan="10"><c:input path="address" value="${ENQUIRYD.address}"/></td></tr>
        
     <tr>
    <th colspan="10">College Name</th>
    <td colspan="10"><c:input path="collegeName" value="${ENQUIRYD.collegeName}"/></td></tr>
    
     <tr>
    <th colspan="10">semester</th>
    <td colspan="10"><c:input path="semester" value="${ENQUIRYD.semester}"/></td></tr>
    
    
   <tr>
   <td colspan="6"><input type="submit" value="update"/></td>
       
       <%-- <a href='<c:url value=" download.nr"/>'>download execl</a> --%>
       
       
       </tr>
   <%-- 
     <%
      Object oobj=session.getAttribute("${ENQUIRYD");
      EnquiryForm eqf=(EnquiryForm)oobj;
      String val[]=eqf.getKnow();
                       %>
                       
           
       <%
       Object obj="${ENQUIRYD}";
       EnquiryForm efq=(EnquiryForm)obj;
       String cou[]=eqf.getCourse();
        %>
        <q:forEach var="x" items="cou">
        <td colspan="6">
       <c:input path="course" value="${x}"/>
       </td> 
       </q:forEach>
       --%>
       
       
       </table>
       </c:form>
       
       
       </q:if>
  
       
      </table>
       
  </body>
</html>
