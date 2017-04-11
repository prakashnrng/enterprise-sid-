<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
   <h1>STUDENT INFORMATION</h1>
   <c:if test="${EDIT eq 'FALSE' }">
   <table border="4" background="blue">
   <tr><th colspan="4">SID</th><th colspan="8">SNAME</th><th colspan="6">SECTION</th><th colspan="6">CLASSNO</th><th colspan="6">GENDER</th><th colspan="10">FATHERNAME</th><th colspan="10">MOTHERNAME</th><th colspan="20">ADDRESS</th><th colspan="16">MOBLNO</th><th colspan="6">CAST</th>
   </tr>
   <tr><td colspan="4">${STO.sid}</td><td colspan="8">${STO.sname}</td><td colspan="6">${STO.section}</td><td colspan="6">${STO.classno}</td><td colspan="6">${STO.gender}</td><td colspan="10">${STO.fname}</td><td colspan="10">${STO.mname}</td><td colspan="20">${STO.address}</td><td colspan="16">${STO.mblno}</td><td colspan="6">${STO.cast}</td>
   <td><form:form action="editStudent.nr" commandName="student"><input type="submit" value="EDIT"/></form:form></td>
      </tr>
      </table>
    </c:if>
    <c:if test="${EDIT eq 'TRUE'}">
    <form:form action="updateStudentForm.nr" commandName="student">
   <table border="4" background="yellow">
      <tr><th colspan="4">SID</th><th colspan="8">SNAME</th><th colspan="6">SECTION</th><th colspan="6">CLASSNO</th><th colspan="6">GENDER</th><th colspan="10">FATHERNAME</th><th colspan="10">MOTHERNAME</th><th colspan="20">ADDRESS</th><th colspan="16">MOBLNO</th><th colspan="6">CAST</th>
   </tr>
   <tr><td colspan="4"><form:hidden path="sid" value="${STO.sid}"/></td><td colspan="8"><form:input path="sname" value="${STO.sname}"/></td><td colspan="6"><form:input path="section" value="${STO.section}"/></td><td colspan="6"><form:input path="classno" value="${STO.classno}"/></td><td colspan="6"><form:input path="gender" value="${STO.gender}"/></td><td colspan="10"> <form:input path="fname" value="${STO.fname}"/></td><td colspan="10"><form:input path="mname" value="${STO.mname}"/></td><td colspan="20"><form:input path="address" value="${STO.address}"/></td><td colspan="16"><form:input path="mblno" value="${STO.mblno}"/></td><td colspan="6"><form:input path="cast" value="${STO.cast}"/></td>
   <td><form:form action="updateStudent.nr" commandName="student"><input type="submit" value="UPDATE"/></form:form></td>
   <td><form:form action="updateStudent.nr" commandName="student"><input type="submit" value="DELETE"/></form:form></td>
      </tr>
      </table>
    </form:form>
    
    </c:if>
  </body>
</html>
