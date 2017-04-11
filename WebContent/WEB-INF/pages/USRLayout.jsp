  <%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     
  </head>
  
  <body>
   
  
   
   <table width="99%" height="99%">
   <tr height="40%">
   <td   colspan="2" align="center">
   <tiles:insert attribute="HEADER"/>
     </td>
      </tr>
      <tr>
 <%--   <td   colspan="2" align="center">
   <tiles:insert attribute="TOPMENU"/>
     </td> --%>
   </tr>
   
  <%--  <tr height="20%">
   <td>
      <tiles:insert attribute="MENU"></tiles:insert>
   </td> --%>
   <tr height="85%">
   
   <%-- <td width="10%" align="center">
   <tiles:insert attribute="MENU"></tiles:insert>
   </td> --%>
        <td  width="20%" valign="top">
     <tiles:insert attribute="LMENU"/>
     </td>  
     <td  width="80%" valign="top">
     <tiles:insert attribute="BODY"/></td>
     
     <%-- <td  width="80%" valign="top">
     <tiles:insert attribute="RMENU"/></td> --%>
     
     </tr>
     
     
     <tr height="5%">
        <td align="center" colspan="2"><tiles:insert attribute="FOOTER"/>
      </table>
   
  </body>
</html>
     
  