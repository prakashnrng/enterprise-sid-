<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="u" %>
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   
  <h1>Registration Form</h1>
  <body>
   <f:form action="regfrm.nr" commandName="RF">
   <table>
   <tr><td>Associate Name</td>
   <td><f:input path="rasname"/><td>
   <f:errors path="rasname"/>
   </tr>
   <tr><td>Date Of Birth</td>
   <td><f:input path="rdob"/></td>
   <td><f:errors path="rdob"/></td>
   </tr>
   
   <tr><td>Gender</td>
   <td><f:radiobutton path="rgender" value="male"/>Male
    <f:radiobutton path="rgender" value="female"/>Female
       </td>
       <td><f:errors path="rgender"/></td>
       </tr>
   
   <tr><td>Blood Group</td>
   <td><f:select path="rbg">
   <f:option  value="A"/>A
   <f:option  value="A+"/>A+
   <f:option  value="A-"/>A-
   <f:option  value="B"/>B
   <f:option  value="B+"/>B+
   <f:option  value="B-"/>B-
   <f:option  value="AB"/>AB
   <f:option  value="AB+"/>AB+
   <f:option  value="AB-"/>AB-
    <f:option  value="O+"/>O+
    <f:option  value="O-"/>O-
    </f:select>
   </td>
   <td><f:errors path="rbg"/></td>
   </tr>
   
   <tr><td>Moblie No</td>
   <td><f:input path="rmbl"/> </td>
   <td><f:errors path="rmbl"/></td>
   </tr>
   
   <tr><td>Email</td>
   <td><f:input path="remial"/></td>
   <td><f:errors path="remial"/></td>
   </tr>
   
   <tr><td>Quali</td>
   <td><f:input path="rquali"/></td>
   <td><f:errors path="rquali"/></td>
   </tr>
   
   <tr><td>State</td>
   <td><f:input path="rstate"/></td>
  <td><f:errors path="rstate"/></td> 
   </tr>
   
   <tr><td>Father's Name</td>
   <td><f:input path="rfname"/></td>
   <td><f:errors path="rfname"/></td>
   </tr>
   
   <tr><td>Father's Occupation</td>
   <td><f:input path="rfoc"/></td>
   <td><f:errors path="rfoc"/></td>
   </tr>
   
   <tr><td>Mother's Name</td>
   <td><f:input path="rmname"/></td>
   <td><f:errors path="rmname"/></td>
   </tr>
   
    <tr><td>Mother's Occupation</td>
   <td><f:input path="rmoc"/></td>
   <td><f:errors path="rmoc"/></td>
   </tr>
   
    <tr><td>Permanent Address</td>
   <td><f:textarea path="rpmad"/></td>
   <td><f:errors path="rpmad"/></td>
   </tr>
   
   <tr><td>Parents Contact No</td>
   <td><f:input path="rpcnno"/></td>
   <td><f:errors path="rpcnno"/></td>
   </tr>
   
     <tr><td>Education Details</td>
   </tr>
   <!-- <table><tr><td>
   <td><th>Education</th>
   <td>SSLC</td><td>PUC</td><td>UG</td><td>PG</td>
   </td><th>School</th><th>Year Of Passed out</th><th>Percentate</th>
    </tr>
      </table>
    -->
    <tr><td>
    Grade</td>
    <td><f:input path="redu.grade"/></td>
    <td><f:errors path="redu.grade"/></td>
    </tr>
    
    <tr>
    <td>School And College Name</td>
    <td><f:input path="redu.clgnme"/></td>
     <td><f:errors path="redu.clgnme"/></td>
     </tr>
     
     <tr><td>Year of passing</td>
     <td><f:input path="redu.yop"/></td>
     <td><f:errors path="redu.yop"/></td>
   </tr>
   
   <tr><td>Percentage</td>
   <td><f:input path="redu.pc"/>
   </td>
   <td><f:errors path="redu.pc"/>
   </td>
   </tr>  
   
   <tr><td>Present Address</td>
   <td><f:input path="rpaddr"/></td>
   <td><f:errors path="rpaddr"/></td>
   </tr>
   
  <%--  <tr><td>Guardian's Name</td>
   <td><f:input path="rgnm"/></td></tr>
   
   <tr><td>Guardian's Contact No</td>
   <td><f:input path="rgcno"/></td></tr> --%>
   
   <tr><td>Date</td>
   <td><f:input path="rdate"/></td>
   <td><f:errors path="rdate"/></td>
   </tr>
   
   <tr><td><h1>Office use only</h1>
   </td></tr>
   
      <tr><td>Name of the councillor</td>
   <td><f:input path="orf.ocouncil"/></td>
   <td><f:errors path="orf.ocouncil"/></td>
   
   </tr>
   
   <tr><td>Number of installments</td>
   <td><f:input path="orf.oinstal"/></td>
   <td><f:errors path="orf.oinstal"/></td>
   </tr>
   
   <tr><td>special offer</td>
   <td><f:input path="orf.ospoffr"/></td>
   <td><f:errors path="orf.ospoffr"/></td>
   </tr>
   
   <tr><td>Batch No</td>
   <td><f:input path="orf.oBatcno"/></td>
   <td><f:errors path="orf.oBatcno"/></td>
   </tr>
   
   <tr><td>Join Date</td>
   <td><f:input path="orf.ostarDate"/></td>
   <td><f:errors path="orf.ostarDate"/></td>
   </tr>
   
   <tr><td>Timings</td>
   <td><f:input path="orf.otiming"/></td>
   <td><f:errors path="orf.otiming"/></td>
   </tr>
   
   <tr><td><h1>Course Detials</h1>
   </td></tr>
   
   <tr><td>Course Name</td>
   <td><f:input path="curs.cnm"/></td>
   <td><f:errors path="curs.cnm"/></td>
   </tr>
   
   <tr><td>Fee</td>
   <td><f:input path="curs.cfee"/></td>
   <td><f:errors path="curs.cfee"/></td>
   </tr>
   
   <tr><td>Total</td>
   <td><f:input path="curs.ctotal"/></td>
   <td><f:errors path="curs.ctotal"/></td>
   </tr>
   </table>
     
     
     <tr><td><input type="submit" value="submit"></td></tr>
</f:form>   
  </body>
</html>
