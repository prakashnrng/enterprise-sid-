<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
     
    <title>sidd Tech</title>
     
  </head>
  
  <body>
  <h1>Staff Details</h1>
      
    
     <c:form action="sdetails.nr"  commandName="STAF" enctype="multipart/form-data">
     <table>
     <tr><td>
     First Name</td> <td><c:input path="sfname"/>
     <font color="red">
      
      <c:errors path="sfname"/></font>
     </td></tr>
     <td></td><td></td><td></td><td></td>
     
      <td>
      
     <tr>
     <td>
     
     <br/>upload image
     
     <input type="file" name="file"/>
     
     </td></tr>
      
      </td>
      
     
     <tr>
     <td>Last Name</td>
     <td>
     <font color="red">
     <c:input path="slname"/>
     <font color="red">
     <c:errors path="slname"/></font>
     </font>
     </td>
     
     </tr>
     
     <tr><td>Enter email</td>
     <td><c:input path="semail"/>
     <font color="red">
     <c:errors path="semail"/></font>
     <td>
     <tr>
     <td>Mobl</td>
     <td><c:input path="smbl"/>
     <font color="red">
     <font color="red">
    <c:errors path="smbl"/></font>
    </font>
    </td>
     </tr>
     <tr><td>
     Quali</td>
     <td><c:select path="squali">
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
     <td><c:input path="slastworkd"/></td>
     <td>
     <font color="red">
     <c:errors path="slastworkd"/>
     </font>
     </td>
     </tr>
     
     <tr>
     <td>  Address</td>
      
     <td>city<c:input path="sadd.city"/></td>
     <td>
     <font color="red">
     <c:errors path="sadd.city"/></font></td>  
     
      <td>state<c:input path="sadd.state"/></td>
     <td><font color="red">
     <c:errors path="sadd.state"/></font></td>
     
     <td>town<c:input path="sadd.town"/></td>
      <td>
      <font color="red">
      <c:errors path="sadd.town"/>
       </font>
      </td>
     <td>doorno<c:input path="sadd.doorno"/></td>
      <td>
      <font color="red">
      <c:errors path="sadd.doorno"/>
      </font>
      </td>
     <td>pincode<c:input path="sadd.pincode"/></td>
     <td><font color="red">
     <c:errors path="sadd.pincode"/></font></td>
     
     <td>adddress<c:textarea path="sadd.saloc"/></td>     
         <td>
         <font color="red">
         <c:errors path="sadd.saloc"/></font> </td>
    
    
   
     
          </tr>
          <tr><td>
         <input type="submit" value="Regiser"></td></tr>
     </table>
     
     
     
     </c:form>
     
  </body>
</html>
