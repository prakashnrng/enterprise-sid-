<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 
  
  <body>
  
   <c:if test="${EDIT eq 'false' }">
    <table border="4" background="orange">
     <tr>
     <th colspan="4">Registration id</th><td colspan="4">${RFORM.id }</td></tr>     
     <tr><th colspan="4">Associate name</th><td colspan="4">${RFORM.rasname }</td></tr>
     <tr>
     <th colspan="4">Date Of Birth</th><td colspan="4">${RFORM.rdob }</td></tr>
     <tr><th colspan="4">Gender</th><td colspan="4">${RFORM.rgender }</td></tr>
     <tr><th colspan="4">Blood Group</th><td colspan="4">${RFORM.rbg }</td></tr>
     <tr><th colspan="4">Mobile No</th><td colspan="4"> ${RFORM.rmbl }</td></tr>
<tr>     <th colspan="4">Email Id</th><td colspan="4">${RFORM.remial }</td></tr>
    <tr> <th colspan="4">Qualification</th><td colspan="4">${RFORM.rquali }</td></tr>
     <tr><th colspan="4">state</th><td colspan="4">${RFORM.rstate }</td></tr>
     <tr><th colspan="4">FatherName</th><td colspan="4">${RFORM.rfname }</td></tr>
     <tr><th colspan="4">Father Occupation</th><td colspan="4">${RFORM.rfoc }</td></tr>
     <tr><th colspan="4">Mother Name</th><td colspan="4">${RFORM.rmname }</td></tr>
     <tr><th colspan="4">Mother Occupation</th><td colspan="4">${RFORM.rmoc }</td></tr>
     <tr><th colspan="4">Permanent Address</th><td colspan="4">${RFORM.rpmad }</td></tr>
     <tr><th colspan="4">Permanent contact no</th><td colspan="4">${RFORM.rpcnno }</td></tr>
     <%-- <tr><td>Education Details</td></tr>
     <c:forEach var="x" items="${sessionScope.GRADE}">
     <tr><th colspan="4">Grade</th><td colspan="4">x</td></tr>
      --%>
     <tr><th colspan="4">Grade</th><td colspan="4">${EDUCATION.grade }</td></tr>  
    
     <tr><th colspan="4">College Name</th><td colspan="4">${EDUCATION.clgnme }</td></tr>
     <tr><th colspan="4">Year of passing</th><td colspan="4">${EDUCATION.yop }</td></tr>
     <tr><th colspan="4">Percentage</th><td colspan="4">${EDUCATION.pc }</td></tr>
     <tr><th colspan="4">Present Address</th><td colspan="4">${RFORM.rpaddr }</td></tr>
     <tr><th colspan="4">Date</th><td colspan="4">${RFORM.rdate }</td></tr>
     <tr><td>Office Detials</td></tr>
     <tr><th colspan="4">Office Id</th><td colspan="4">${OFFICE.ofid }</td></tr>
     <tr><th colspan="4">Name of the Councillor</th><td colspan="4">${OFFICE.ocouncil }</td></tr>
     <tr><th colspan="4">Name of the Installments</th><td colspan="4">${OFFICE.oinstal }</td></tr>
     <tr><th colspan="4">spotoffer</th><td colspan="4">${OFFICE.ospoffr}</td></tr>
     <tr><th colspan="4">BatchNO</th><td colspan="4">${OFFICE.oBatcno }</td></tr>
     <tr><th colspan="4">StartDate</th><td colspan="4">${OFFICE.ostarDate }</td></tr>
     <tr><th colspan="4">Timings</th><td colspan="4">${OFFICE.otiming }</td></tr>
      <tr><td> Course Detials</td></tr>
     <tr><th colspan="4">course ID</th><td colspan="4">${RCOURSE.couid }</td></tr>
     <tr><th colspan="4">course Name</th><td colspan="4">${RCOURSE.cnm }</td></tr>
     <tr><th colspan="4">Fees</th><td colspan="4">${RCOURSE.cfee }</td></tr>
     <tr><th colspan="4">Total</th><td colspan="4">${RCOURSE.ctotal }</td></tr>
     
          <!-- <th>image</th> -->
       
     </table>
     
     <table>
     <tr><td>
     
     <form:form action="registeredit.nr" commandName="RFORM">
     <tr><td>
     <input type="submit" value="edit"/>
     </td></tr>
     
     </form:form>
     
         </table>    
     
     
     </c:if>
     
         
         <c:if test="${EDIT eq 'true' }">
         <form:form action="registerformedit.nr" commandName="REGF">
         <table border="4" background="orange">
     <tr>
     <th colspan="4">Registration id</th><td colspan="4"><form:hidden path="id" value="${RFORM.id }"/>${RFORM.id }</td></tr>     
     <tr><th colspan="4">Associate name</th><td colspan="4"><form:input path="rasname" value="${RFORM.rasname }"/></td></tr>
     <tr>
     <th colspan="4">Date Of Birth</th><td colspan="4"><form:input path="rdob" value="${RFORM.rdob }"/></td></tr>
     <tr><th colspan="4">Gender</th><td colspan="4"><form:input path="rgender" value="${RFORM.rgender }"/></td></tr> 
     <tr><th colspan="4">Blood Group</th><td colspan="4"><form:input path="rbg" value="${RFORM.rbg }"/></td></tr>
     <tr><th colspan="4">Mobile No</th><td colspan="4"><form:input path="rmbl" value="${RFORM.rmbl }"/></td></tr>
<tr> <th colspan="4">Email Id</th><td colspan="4"><form:input path="remial" value="${RFORM.remial}"/></td></tr> 
    <tr> <th colspan="4">Qualification</th><td colspan="4"><form:input path="rquali" value="${RFORM.rquali}"/></td></tr> 
     <tr><th colspan="4">state</th><td colspan="4"><form:input path="rstate" value="${RFORM.rstate}"/></td></tr>
     <tr><th colspan="4">FatherName</th><td colspan="4"><form:input path="rfname" value="${RFORM.rfname}"/></td></tr>
     <tr><th colspan="4">Father Occupation</th><td colspan="4"><form:input path="rfoc" value="${RFORM.rfoc}"/></td></tr>
     <tr><th colspan="4">Mother Name</th><td colspan="4"><form:input path="rmname" value="${RFORM.rmname}"/></td></tr>
     <tr><th colspan="4">Mother Occupation</th><td colspan="4"><form:input path="rmoc" value="${RFORM.rmoc}"/></td></tr>
     <tr><th colspan="4">Permanent Address</th><td colspan="4"><form:input path="rpmad" value="${RFORM.rpmad}"/></td></tr>
     <tr><th colspan="4">Permanent contact No</th><td colspan="4"><form:input path="rpcnno" value="${RFORM.rpcnno}"/></td></tr>
     <tr><th colspan="4">Date</th><td colspan="4"><form:input path="rdate" value="${RFORM.rdate}"/></td></tr>
     <%-- <tr><td>Education Details</td></tr>
     <c:forEach var="x" items="${sessionScope.GRADE}">
     <tr><th colspan="4">Grade</th><td colspan="4">x</td></tr>
      --%>
      <tr><th colspan="4">Education id</th><td colspan="4"><td colspan="4"><form:hidden path="redu.eduid" value="${EDUCATION.eduid }"/>${EDUCATION.eduid }</td></tr>
     <tr><th colspan="4">Grade</th><td colspan="4"><td colspan="4"><form:input path="redu.grade" value="${EDUCATION.grade }"/></td></tr>  
    
     <tr><th colspan="4">College Name</th><td colspan="4"><form:input path="redu.clgnme" value="${EDUCATION.clgnme }"/></td></tr>
     <tr><th colspan="4">Year of passing</th><td colspan="4"><form:input path="redu.yop" value="${EDUCATION.yop }"/></td></tr>
     <tr><th colspan="4">Percentage</th><td colspan="4"><form:input path="redu.pc" value="${EDUCATION.pc }"/></td></tr>
     <tr><th colspan="4">Present Address</th><td colspan="4"><form:input path="rpaddr" value="${RFORM.rpaddr }"/></td></tr> 
     <tr><td>Office Detials</td></tr>
     <tr><th colspan="4">Office Id</th><td colspan="4"><form:hidden path="orf.ofid" value="${OFFICE.ofid }"/>${OFFICE.ofid }</td></tr>
     <tr><th colspan="4">Name of the Councillor</th><td colspan="4"><form:input path="orf.ocouncil" value="${OFFICE.ocouncil }"/></td></tr>
     <tr><th colspan="4">Name of the Installments</th><td colspan="4"><form:input path="orf.oinstal" value="${OFFICE.oinstal }"/></td></tr>
     <tr><th colspan="4">spotoffer</th><td colspan="4"><form:input path="orf.ospoffr" value="${OFFICE.ospoffr}"/></td></tr>
     <tr><th colspan="4">BatchNO</th><td colspan="4"><form:input path="orf.oBatcno" value="${OFFICE.oBatcno }"/></td></tr> 
     <tr><th colspan="4">StartDate</th><td colspan="4"><form:input path="orf.ostarDate" value="${OFFICE.ostarDate }"/></td></tr>  
     <tr><th colspan="4">Timings</th><td colspan="4"><form:input path="orf.otiming" value="${OFFICE.otiming }"/></td></tr>   
      <tr><td> Course Detials</td></tr>
     <tr><th colspan="4">course ID</th><td colspan="4"><form:hidden path="curs.couid" value="${RCOURSE.couid }"/>${RCOURSE.couid }</td></tr>    
     <tr><th colspan="4">course Name</th><td colspan="4"><form:input path="curs.cnm" value="${RCOURSE.cnm }"/></td></tr> 
     <tr><th colspan="4">Fees</th><td colspan="4"><form:input path="curs.cfee" value="${RCOURSE.cfee }"/></td></tr> 
     <tr><th colspan="4">Total</th><td colspan="4"><form:input path="curs.ctotal" value="${RCOURSE.ctotal }"/></td></tr>  
     <tr><td><input type="submit"></td></tr>
     
          <!-- <th>image</th> -->
       
     </table>
         </form:form>
         
         </c:if>

  </body>
</html>
