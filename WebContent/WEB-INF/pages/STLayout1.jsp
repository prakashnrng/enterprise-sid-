<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
   <table width="99%" height="99%">
   <tr height="10%">
   <td   colspan="2" align="center">
   <tiles:insert attribute="HEADER"/>
     </td>
   </tr>
   <tr height="85%">
   <td  width="20%" valign="top">
    
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
