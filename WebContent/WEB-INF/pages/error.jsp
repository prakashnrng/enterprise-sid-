 <%@ taglib uri="http://www.springframework.org/tags" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f" %>
 
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
   <h1>this is an error page</h1>
   
   
   <f:if test="${EMPTY eq no records }">
   <font color="red">no records found</font>
   
   </f:if>
   
   
   <h1></h1>
  </body>
</html>
