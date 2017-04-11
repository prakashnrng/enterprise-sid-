 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
       <body>
      <c:form action="searchBySid.nr" commandName="EF">
      <table>
      <tr>
      <td>Enter sid</td> 
      <td>
      <c:input path="id"/></td>
      </tr>
      <tr><td><input type="submit" value="SUBMIT">
      </table>
     
     </c:form>
     
<c:form action="searcyByDate.nr" commandName="EF">
<table>
<tr>
<td>Search By Date</td>
</tr>
<tr><td>
<c:input type="date" path="date"/>
</td></tr>
<tr><td>
 <input type="submit" value="submit"/>
</td></tr>
</table>

</c:form>

  </body>
</html>
