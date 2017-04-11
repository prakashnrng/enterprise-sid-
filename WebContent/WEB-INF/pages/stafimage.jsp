<%@page import="java.io.OutputStream"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.sql.Blob,com.nr.staff.*" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   
   <%-- <%
Object st=session.getAttribute("SIDSEA");
Staff stt=(Staff)st;
OutputStream out1=response.getOutputStream();
		response.setContentType(stt.getContenttype());
		IOUtils.copy(stt.getImage().getBinaryStream(), out);
		out.flush();
		out.close();


 %>
    
 --%>  <body>
     <table><tr>
    <td>
         <%-- <img src="${pageContext.request.contextPath}" alt="no image"/>   </td> --%>
 <%-- <%
Object st=session.getAttribute("SIDSEA");
Staff stt=(Staff)st;
OutputStream out1=response.getOutputStream();
		response.setContentType(stt.getContenttype());
		IOUtils.copy(stt.getImage().getBinaryStream(), out);
		out.flush();
		out.close();


 %>
 --%> 
    </tr>
    </table>
  </body>
</html>
