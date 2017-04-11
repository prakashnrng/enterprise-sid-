<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
<h1>Fee Deatails</h1>
<table>
   <tr><th colspan="4">SID</th><th colspan="8">FeeRECEIPT</th><th colspan="6">ADMINFEE</th><th colspan="6">VANFEE</th><th colspan="6">FEEPAID</th><th colspan="10">BALFEE</th> 
   </tr>
   <tr><td colspan="4">${FEE.sid}</td><td colspan="8">${FEE.fReceipt}</td><td colspan="6">${FEE.adminfee}</td><td colspan="6">${FEE.vanfee}</td><td colspan="6">${STO.feePaid}</td><td colspan="10">${STO.balfee}</td></tr>
   
   
   
   </table>
      
  </body>
</html>
  