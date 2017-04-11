<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
 
   <s:form action="adminform.nr" commandName="adm">
   <table>
   <tr>
   <td>Student</td>
 <td>
     <s:select path="sec">
     <s:option  value="1">Class1</s:option> 
    <s:option value="2">Class2</s:option> 
    <s:option value="3">Class3</s:option> 
    <s:option value="4">Class4</s:option> 
   </s:select>
   </td> 
   </tr>
   
   <tr><td><input type="submit" value="Submit"></td></tr>
   
   </table>
   
   </s:form>
  </body>
</html>
