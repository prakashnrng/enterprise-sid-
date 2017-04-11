<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
     
  <body>
 
  <h1>Enquiry Form</h1>
   
   <table border="4" background="blue">
   <tr><th colspan="4">SID</th>
      <th colspan="4">NAME</th>
      <th colspan="4">DOB</th>
      <th colspan="4">MBL</th>
      <th colspan="6">GENDER</th>
      <th colspan="6">EMAIL</th>
      <th colspan="6">QUALI</th>
      <th colspan="6">STATE</th>
      <th colspan="6">KNOW</th>
      <th colspan="6">COURSE</th></tr>
    <tr>
   <td colspan="4">${ENQUIRYD.id }</td> 
       <td colspan="4">${ENQUIRYD.name }</td> 
       <td colspan="4">${ENQUIRYD.dob}</td> 
       <td colspan="4">${ENQUIRYD.mblno}</td> 
       <td colspan="6">${ENQUIRYD.gender }</td> 
       <td colspan="6">${ENQUIRYD.email }</td> 
       <td colspan="6">${ENQUIRYD.quali }</td> 
        <td colspan="6">${ENQUIRYD.state }</td> 
       <td colspan="6">${ENQUIRYD.know }</td> 
       <td colspan="6">${ENQUIRYD.course }</td>
      </tr>
      
    
  </body>
</html>
 
    
  </body>
</html>
