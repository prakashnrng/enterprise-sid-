<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page import="com.nr.stmarys.*" language="java" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
   <%
   Object obj=session.getAttribute("ST");
   Student st=(Student)obj;
   
    %>
    <form:form action="">
      <table>
      <tr><td>Student ID:</td><td>${st.sid}</td></tr>
      
      
      </table>
    
    </form:form>
  </body>
</html>
 --%>