<%@page import="java.io.OutputStream"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.sql.Blob,com.nr.staff.*" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
 


<html>
  <head>
     
    
    <title>siddhrans techonology</title>
     
  </head>
   
  <body>
  
 <s:if test="${EDIT eq 'false' }">
     <table border="4" background="orange">
     <tr>
     <th colspan="4">stafid</th>     <td colspan="4">${STAFF.stafid}</td><td></td><td></td><td></td> <td></td><td></td><td></td><td></td><td></td><td></td>  <td colspan="4" align="right"><img src="getImage" alt="no image"/></td>&nbsp;</tr>
     
     <tr><th colspan="4">Firstname</th><td colspan="4">${STAFF.sfname }</td></tr>
     <tr>
     <th colspan="4">LastName</th><td colspan="4">${STAFF.slname }</td></tr>
     <tr><th colspan="4">MBL</th><td colspan="4">${STAFF.smbl }</td></tr>
     <tr><th colspan="4">Quali</th><td colspan="4">${STAFF.squali }</td></tr>
     <tr><th colspan="4">Email</th><td colspan="4"> ${STAFF.semail }</td></tr>
<tr>     <th colspan="4">AddrID</th><td colspan="4">${ADD.siad }</td></tr>
    <tr> <th colspan="4">city</th><td colspan="4">${ADD.city }</td></tr>
     <tr><th colspan="4">stat</th><td colspan="4">${ADD.state }</td></tr>
     <tr><th colspan="4">town</th><td colspan="4">${ADD.town }</td></tr>
     <tr><th colspan="4">doorno</th><td colspan="4">${ADD.doorno }</td></tr>
     <tr><th colspan="4">pincod</th><td colspan="4">${ADD.pincode }</td></tr>
     <tr><th colspan="4">saloc</th><td colspan="4">${ADD.saloc }</td></tr>
     <tr><th colspan="4">Last work</th><td colspan="4">${STAFF.slastworkd }</td></tr>
     
          
      </table>
       <table>
     <tr><td>
     
     <c:form action="staffedit.nr" commandName="staff">
     <tr><td>
     <input type="submit" value="edit"/>
     </td></tr>
     
     </c:form>
     
         </table>   
      
      </s:if>
     
     
     <s:if test="${EDIT eq 'true'}">
     
     <c:form action="staffeditdetails.nr"  commandName="staff" enctype="multipart/form-data">
      <table border="4" background="orange">
     <tr>
     <th colspan="4">stafid</th>     <td colspan="4"><c:hidden path="stafid" value="${STAFF.stafid}"/>${STAFF.stafid}</td><td></td><td></td><td></td> <td></td><td></td><td></td><td></td><td></td><td></td>  <td colspan="4" align="right"> <img src="getImage" alt="no image"/><input type="file" name="file"/>"/></td>&nbsp;</tr>
     
     <tr><th colspan="4">Firstname</th><td colspan="4"><c:input path="sfname" value="${STAFF.sfname }"/></td></tr>
     <tr>
     <th colspan="4">LastName</th><td colspan="4"><c:input path="slname" value="${STAFF.slname }"/></td></tr>
     <tr><th colspan="4">MBL</th><td colspan="4"><c:input path="smbl"  value="${STAFF.smbl }"/></td></tr>
     <tr><th colspan="4">Quali</th><td colspan="4"><c:input path="squali" value="${STAFF.squali }"/></td></tr>
     <tr><th colspan="4">Email</th><td colspan="4"><c:input path="semail" value="${STAFF.semail }"/> </td></tr>
<tr>  <th colspan="4">AddrID</th><td colspan="4"><c:hidden path="sadd.siad" value="${ADD.siad }"/></td></tr>
    <tr> <th colspan="4">city</th><td colspan="4"><c:input path="sadd.city" value="${ADD.city }"/></td></tr>
     <tr><th colspan="4">stat</th><td colspan="4"><c:input path="sadd.state" value="${ADD.state }"/></td></tr>
     <tr><th colspan="4">town</th><td colspan="4"><c:input path="sadd.town" value="${ADD.town }"/></td></tr>
     <tr><th colspan="4">doorno</th><td colspan="4"><c:input path="sadd.doorno" value="${ADD.doorno }"/></td></tr>
     <tr><th colspan="4">pincod</th><td colspan="4"><c:input path="sadd.pincode" value="${ADD.pincode }"/></td></tr>
     <tr><th colspan="4">saloc</th><td colspan="4"><c:input path="sadd.saloc" value="${ADD.saloc }"/></td></tr>
     <tr><th colspan="4">Last work</th><td colspan="4"><c:input path="slastworkd" value="${STAFF.slastworkd }"/></td></tr>
     
          <tr><td><input type="submit" value="submit"/></td></tr>
      </table>
     
      </c:form>
     
   <%--   <tr><td>staff ID</td>  <td colspan="4"><c:hidden path="stafid" value="${staff.stafid}"/>${staff.stafid}</td></tr>
     <tr><td>
     First Name</td> <td><c:input path="sfname" value="${staff.sfname}"/>
     <font color="red">
      
      <c:errors path="sfname"/></font>
     </td></tr>
     <td></td><td></td><td></td><td></td>
     
      <td>
      
     <tr>
     <td>
     
     <br/>upload image
     
     <input type="file" name="file" value="<img src="getImage" alt="no image"/>"/>
     
     </td></tr>
      
      </td>
      
     
     <tr>
     <td>Last Name</td>
     <td>
     <font color="red">
     <c:input path="slname" value="${staff.slname}"/>
     <font color="red">
     <c:errors path="slname"/></font>
     </font>
     </td>
     
     </tr>
     
     <tr><td>Enter email</td>
     <td><c:input path="semail" value="${staff.semail}"/>
     <font color="red">
     <c:errors path="semail"/></font>
     <td>
     <tr>
     <td>Mobl</td>
     <td><c:input path="smbl" value="${staff.smbl}"/>
      
     <font color="red">
    <c:errors path="smbl"/></font>
   
    </td>
     </tr>
     <tr><td>
     Quali</td>
     <td><c:select path="squali" value="${staff.squali}">
          <c:option value="be">BE</c:option>
     <c:option value="msc">msc</c:option>
     <c:option value="mtech">MTECH</c:option>
     <c:option value="mba">MBA</c:option>
     <c:option value="sslc">SSLC</c:option>
     <c:option value="puc">PUC</c:option>
     <c:option value="bsc">BSC</c:option>
     </c:select>
     </td>
     <td>
     <font color="red">
     <c:errors path="squali"/>
     </font>
     </td>
     </tr>
     <tr><td>Last insitute</td>
     <td><c:input path="slastworkd" value="${staff.slastworkd}"/></td>
     <td>
     <font color="red">
     <c:errors path="slastworkd"/>
     </font>
     </td>
     </tr>
     
     <tr>
     <td>  Address</td>
       <th colspan="4">AddrID</th><td colspan="4"><c:hidden path="sadd.city" value="${ADD.siad }"/>${ADD.siad }</td> 
     <td>city<c:input path="sadd.city" value="${ADD.city}"/></td>
     <td>
     <font color="red">
     <c:errors path="sadd.city"/></font></td>  
     <td>town<c:input path="sadd.town" value="${ADD.town}"/></td>
      <td>
      <font color="red">
      <c:errors path="sadd.town"/>
       </font>
      </td>
     <td>doorno<c:input path="sadd.doorno" value="${ADD.doorno}"/></td>
      <td>
      <font color="red">
      <c:errors path="sadd.doorno"/>
      </font>
      </td>
     <td>pincode<c:input path="sadd.pincode" value="${ADD.pincode}"/></td>
     <td><font color="red">
     <c:errors path="sadd.pincode"/></font></td>
          
         
         <td>adddress<c:textarea path="sadd.saloc" value="${ADD.saloc}"/></td>     
         
           <td colspan="4">Last work<c:input path="sadd.slastworkd" value="${staff.slastworkd }"/></td>
           
           </tr>
         
         <td>
         <font color="red">
         <c:errors path="sadd.saloc"/></font> 
     <tr><td><input type="submit" value="Regiser"></td></tr>
     </table>
     
     
     
     </c:form> --%>
     
     </s:if>
     
     
     
  </body>
</html>
