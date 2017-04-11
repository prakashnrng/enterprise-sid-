<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
     
  <body>
    <form:form action="studentreg.nr" commandName="fee">
   <table>
   <tr><td>Student ID</td>
   <td><form:input path="sid"/></td>
   <td><form:errors path="sid"/></td>
   </tr>
   
   <tr><td>Student Name</td>
   <td>
   <form:input path="sname"/></td>
   
   <td><form:errors path="sname"/></td>
   </tr>
   
   <tr><td>Student Section</td>
   <td>
   <form:select path="section">
   <form:option value="----seletion section------"/>
   <form:option value="a"/>
   <form:option value="b"/>
   <form:option value="c"/>
   <form:option value="d"/>
   <form:option value="e"/>
   <form:option value="f"/>
   <form:option value="g"/>
   <form:option value="h"/>
   <form:option value="i"/>
   <form:option value="j"/>
   </form:select>
    </td>
   <td><form:errors path="section"/></td>
   </tr>
   
   <tr><td>Select ur class no</td>
   <td>
   <form:input path="classno"/></td>
   <td><form:errors path="classno"/></td>
   </tr>
   
   
   <tr><td>Father Name</td>
   <td>
   <form:input path="fname"/></td>
   <td><form:errors path="fname"/></td>
   </tr>
   
   <tr><td>Mothers Name</td>
   <td>
   <form:input path="mname"/></td>
   <td><form:errors path="mname"/></td>
   </tr>
   
   <tr><td>Student Cast</td>
   <td>   
   <form:select path="cast">
   <form:option value="----select caste-----"/>
   <form:option value="SC"/> 
   <form:option value="ST"/> 
   <form:option value="OBC"/> 
   <form:option value="GM"/>
    <form:option value="IIA"/>
    <form:option value="IIB"/>
    <form:option value="IIIA"/>
    <form:option value="IIIB"/>
   </form:select>
</td>
   <td><form:errors path="cast"/></td>
   </tr>
   
   <tr><td>Contact NO:</td>
   <td>
   <form:input path="mblno"/></td>
   <td><form:errors path="mblno"/></td>
   </tr>
   
   <tr><td>Select the Gender:</td>
   <td>
   <form:radiobutton path="gender" value="Male"/>Male
   <form:radiobutton path="gender" value="Female"/>Female
   </td>
   <td><form:errors path="gender"/></td>
   </tr>
   
   
   <tr><td>Permanent Addres</td>
   <td><form:textarea path="address"/>
   </td>
   <td><form:errors path="address"/>
   </td></tr>
   
   <tr><td>  Fee Receipt:</td>
   <td>
   <form:input path="fReceipt"/></td>
   <td><form:errors path="fReceipt"/></td>
   </tr>
   
   
   <tr><td>Admission Fee:</td>
   <td>
   <form:input path="adminfee"/></td>
   <td><form:errors path="adminfee"/></td>
   </tr>
   
   <tr><td>Van Fee:</td>
   <td>
   <form:input path="vanfee"/></td>
   <td><form:errors path="vanfee"/></td>
   </tr>
   
   <tr><td>Select ur fee Installation</td>
   <td> 
   <form:select path="feeInst">
   <form:option value="first"/> 
   <form:option value="second"/> 
   <form:option value="third"/> 
   <td><form:errors path="feeInst"/></td>
   </form:select>
   </tr>
   <tr><td>Fee paid by u</td>
   <td><form:input path="feePaid"/>
   </td>
   <td><form:errors path="feePaid"/>
   </td></tr>
   <%-- <tr><td>Fee Status:</td>
   <td>
   <form:hidden path="feestatus"/>
   <form:input path="feestatus"/></td>
   <td> 
   </tr>
    --%>
   <tr><td><input type="submit" value="Submit"/></td></tr>
   
   
    </table>
    </form:form>
  </body>
</html>
