<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"  %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="t" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    

  </head>
  <%
   
   %>
  <body>   
   <%-- <f:if test="${requestScope}"> 
   
  <c:form action="logcheck.nr" commandName="USR">
  
  <table>
  <tr>                        
  <td>Name</td>
  <td>  
  <c:input path="uname" />
  </td></tr>
  <tr><td><input type="submit" value="submit"></td></tr>
 
  </table>
   </c:form>
   </f:if>     --%>
 
  
 <f:if test="${USRN ne null}"> 
   
   <h6><f:if test="${not empty USRN}">${message}${USRN}</f:if></h6>
   <h6><f:if test="${not empty RL}"> ur role${RL}</f:if></h6>
   
   <c:form action="userform.nr" commandName="USR">
  
  <table>
  <tr><td>
  <tr>
  
    
  
  <td>Name</td>
  <td>${USRN }</td>
  <td>  
  <c:hidden path="uname"  value="${USRN }"/>
  </td>
  
  </tr>
  <tr><td>
  pwd</td>
  <td><c:password path="pwd"/></td>
  <td><c:errors path="pwd"/></td>
  
  </tr>
  <tr><td>
  <c:select path="role">
  <c:option value="manager">manager</c:option>
  <c:option value="admin">admin</c:option>
  </c:select>
  
  
  <tr><td><input type="submit" value="submit"></td></tr>
 
  </table>
     </c:form>
     
         </f:if>  
  
  <table>
  <tr><td>
  
  <a href='<t:url value="forgotpass.nr"/>'>forgot password</a>
  </td></tr>
  
  </table>
  </body>
</html>
