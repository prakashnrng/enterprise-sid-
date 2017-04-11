 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%-- <%@ taglib uri="http://www.springframework.org/security/tags" prefix="c" %> --%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="cc" %>
<%-- <%@ taglib uri="/WEB-INF/sid.tld"  prefix="siddt" %> --%>
<%@ page import="com.nr.user.*" %>
<%-- <siddt:invalidateSession info="UNAME"/> --%> 



 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
  <body>
<%--   onload="document.f.j_username.focus();" 
  <h1>Siddhrans Technology</h1>
  <cc:if test="${not empty param.login_error }">
  <font color="red">
    your login attempt was not successfull,try agin<br/><br/>
  Reason:
  
  <cc:out value="${SPRING_SECURITY_LAST_EXCEPTION.message }">
  
  </cc:out>
  </font>
    
  </cc:if>
  
   <form name="f" action="<cc:url value='j_spring_security_check'/>" method="POST">
    <table>
    <tr><td>User:</td><td><input type='text' name='j_username' value='<cc:if test="${not empty param.login_error }">
    <cc:out value="${SPRING_SECURITY_LAST_USERNAME }"/></cc:if>'/>
    </td></tr>
    <tr><td>Password:</td>
    <td><input type='password' name='j_password'></td></tr>
    <tr><td colspan="2" align="center">
    <input value="Login" type="submit"></td></tr>
    
    </table> 
    </form>
    --%>
   
   
   <form:form action="logcheck.nr" commandName="USR">
  
  <table>
  <tr>                        
  <td>Name</td>
  <td>  
  <form:input path="uname" />
  </td>
  <td>
  <font color="red">
  <form:errors path="uname"/></font>
  </tr>
  <tr><td><input type="submit" value="submit"></td></tr>
 
  </table>
     </form:form>
     
     <a href='<cc:url value="newuser.nr"/>'>new user</a>
    
   <br/>
   <a href='<t:url value="forgotpass.nr"/>'>forgot password</a>
   
   <%-- <form:form action="userform.nr"                   commandName="USR">
   
   <table>
   <tr>
   
   <td> Name</td>
   <td>
   <form:input path="uname"/>
   </td></tr>
   
   <tr>
   <td>  password</td>
   <td>
   <form:password path="pwd"/>
   </td></tr>
   
   <tr><td>Role
   </td>
   <td><form:select path="role">
   <form:option value="manager">Manager</form:option>
   <form:option value="amdin">Admin</form:option>
   </form:select>
   </td></tr>
   
   <tr><td><input type="submit" value="Submit">
   </td></tr>
   
   <tr><td><a href='newuser.nr'>new user</a>
   </table>
   </form:form> --%>
   
   
   
  </body>
</html>
   
  
  
   
  
 <%--  
    <%
    Object to=session.getAttribute("LOGSESU");
    UserTO uto=(UserTO)to;
    out.write(uto.getUname());
     %>
      <% out.write("successfully login in"); %>
  
  
     --%>   
