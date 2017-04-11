<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
   <h1><font color="red">TEACHER DATA FROM</font></h1>
   <form:form action="newTeacherForm.nr" commandName="teacher">
   <table>
   <tr><td>Teacher Id</td>
   <td><form:input path="tid"/></td>
   <td><font color=red><form:errors path="tid"/></font>
   </td></tr>
   
<tr><td>First Name</td>
   <td><form:input path="tfname"/></td>
   <td><font color=red><form:errors path="tfname"/></font>
   </td>
   <td></td>
   <td>Last Name</td>
   <td><form:input path="tlname"/></td>
   <td><font color=red><form:errors path="tlname"/></font></td>
   </tr>
   
    
   <tr><td>Gender</td>
   <td><form:radiobutton path="tgender" value="male"/>Male</td>
   <td><form:radiobutton path="tgender" value="female"/>FeMale</td>
   <td><font color=red><form:errors path="tgender"/></font>
   </td></tr>
   
   <tr><td>Qualificatio</td>
   <td><form:select path="tquali">
   <form:option value="B.A"/>B.A
    <form:option value="M.A"/>M.A
     <form:option value="MPHIL"/>MPHIL
      <form:option value="B.S.C"/>B.S.C
       <form:option value="M.S.C"/>M.S.C
       <form:option value="B.E"/>B.E
         </form:select></td></tr>
   
   <tr><td>MOBILE NO</td>
   <td><form:input path="tmblno"/></td>
   <td><font color=red><form:errors path="tmblno"/></font>
   </td></tr>
   
   <tr><td>Address</td>
   <td>Permanent Address</td>
   <td><form:textarea path="tpaddress"/></td>
   <td><font color=red><form:errors path="tpaddress"/></font>
   </td>
   <td></td>
   <td>Current Address</td>
   <td><form:textarea path="tcaddress"/></td>
   <td><font color=red><form:errors path="tcaddress"/></font>
   </td>
   </tr>
   
   
   <tr><td>Experience</td>
   <td><form:select path="texperinece">
   <form:option value="Fresher"/>Fresher
    <form:option value="1Year"/>1Year
     <form:option value="1+Year"/>1+Year
      <form:option value="2+Year"/>2+Year
       <form:option value="3+Year"/>3+Year
       <form:option value="3-6Year"/>3-6Year
      </form:select>
   </td></tr>
   
   <tr><td>Last Working Institution Name</td>
   <td><form:input path="tlastinstitute"/></td>
   <td><font color=red><form:errors path="tlastinstitute"/></font>
   </td></tr>
   
   <tr><center><td><input type="submit" value="Submit Form"></td></center></tr>
   
   
   </table>   
   </form:form>
  </body>
</html>
