<%-- <%@page import="com.nr.stmarys.service.TeacherTO"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
 <%@ page language="java" import="com.nr.stmarys.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
   <table border="4">
   <tr>
   <th colspan="4">TID</th>
   <th colspan="4">FirstName</th>
   <th colspan="4">LastName</th>
   <th colspan="4">Gender</th>
   <th colspan="4">Quali</th>
   <th colspan="4">MBLNO</th>
   <th colspan="4">PermanetAddr</th>
   <th colspan="4">CurrentAddr</th>
   <th colspan="4">Experience</th>
   <th colspan="4">LastInstitute</th>
   </tr>
   <%
   Object o=request.getAttribute("TO");
    
   TeacherTO t=(TeacherTO)o;
    %>
    
    
    <tr><td colspan="4">   <%=t.getTid() %></td> 
     <td colspan="4"> <%=t.getTfname() %></td> 
     <td  colspan="4"> <%=t.getTlname() %></td> 
     <td colspan="4"> <%=t.getTgender()%></td> 
     <td colspan="4"> <%=t.getTquali()%></td> 
     <td colspan="4"> <%=t.getTmblno()%></td> 
     <td colspan="4">  <%=t.getTpaddress()%></td> 
     <td colspan="4"> <%=t.getTcaddress()%></td> 
     <td colspan="4"> <%=t.getTexperinece()%></td> 
     <td colspan="4"> <%=t.getTlastinstitute()%></td></tr>
    </table>
   
   <%  %>
  </body>
</html>
 --%>