<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
 
 
<!DOCTYPE html>
<html lang="en">
    
<head>
     
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link href="css/base/jquery-ui-1.9.2.custom.css" rel="stylesheet">
	<script src="js/jquery-1.8.3.js"></script>
	<script src="js/jquery-ui-1.9.2.custom.js"></script>
   
  <!--  <script type="text/javascript">
   $(document).ready(function() {
    $("#datepicker").datepicker({dateFormat:"yy-mm-dd"});
    });
   
   </script> -->
   
  <!-- <script>
	$(function() {	

		
		$( "#datepicker" ).datepicker({
			inline: true
		});	

		// Hover states on the static widgets
		$( "#dialog-link, #icons li" ).hover(
			function() {
				$( this ).addClass( "ui-state-hover" );
			},
			function() {
				$( this ).removeClass( "ui-state-hover" );
			}
		);
	});
	</script> -->
  
  
  
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 

  
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <script  type="text/javascript" src="/pages/ui.js"></script>
  <script  type="text/javascript" src="/pages/style.css"></script>
  
<!-- Extra JavaScript/CSS added manually in "Settings" tab -->
<!-- Include jQuery -->
<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>

<!-- Include Date Range Picker -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>

<!-- <script>
	$(document).ready(function(){
		var date_input=$('input[name="date"]'); //our date input has the name "date"
		var container=$('.bootstrap-iso form').length>0 ? $('.bootstrap-iso form').parent() : "body";
		date_input.datepicker({
			format: 'mm/dd/yyyy',
			container: container,
			todayHighlight: true,
			autoclose: true,
		});
	});
</script> -->

     
     
     </head> 
  <body>
    
    <h1>Enquiry Form</h1>
    <c:form action="efp.nr" commandName="EQF" >
    
    <table>
    
    <tr><td bgcolor="orange">Enter Student Name</td>
    <td>
    <c:input path="name"/>
    <font color="red"> <c:errors path="name"/></font>
    </td></tr>
    
    <tr><td bgcolor="yellow">Enter DOB</td>
    <td>
    <c:input path="dob"/>
    <font color="red"><c:errors path="dob"/></font>
    </td></tr>
    
    <tr><td bgcolor="orange">Enter Gender</td>
    <td>
    <c:radiobutton path="gender" value="male"/>Male 
    <c:radiobutton path="gender" value="female"/>Female 
     <font color="gender"> <c:errors path="gender"/></font>
    
     </td></tr>
    <tr><td>Select Date</td></tr>
    
	    <tr>
		    <td>
		  
		 
		<%-- <p>Date: <c:input id="date"  class="datepic" path=""/></p> --%>
		 	<c:input type="date"  path="date" />
		      <!--
		      datepicker
		        -->
		      
		 
		     </td>
     </tr>
    <!-- <td><input type="text" id="datepicker"/>
    <a href="#" onclick="return getCalendar(document.foo.bar);">
    <img src="calendar.png" border="0"/></a>
     -->
   <!--  </td></tr> -->
    <tr>
    <td bgcolor="yellow">Enter Mobile No</td>
    <td>
    <c:input path="mblno"/>
     <font color="red"> <c:errors path="mblno"/></font>
    </td>
  
    </tr>
    
    <tr>
    <td bgcolor="orange">Enter Email</td>
    <td>
    <c:input path="email"/>
     <font color="red"> <c:errors path="email"/></font>
    </td>
    </tr>
    
    
    <tr>
    <td bgcolor="blue">Enter Qualification</td>
    <td>
    <c:input path="quali"/>
     <font color="red"> <c:errors path="quali"/></font>
    </td>
    </tr>
    
     
    
    <tr>
    <td bgcolor="yellow">Enter State</td>
    <td>
    <c:select path="state">
     <c:option value="---select state---"></c:option>
    <c:option value="a.p">Andhrapradesh</c:option>
    <c:option value="arunachal">Arunachal Pradesh</c:option>
    <c:option value="assam">Assam</c:option>
    <c:option value="bihar">bihar</c:option>
    <c:option value="chhattisgarh">Chhattisgarh</c:option>
    <c:option value="goa">Goa</c:option>
    <c:option value="gujarath">Gujarath</c:option>
    <c:option value="haryana">Haryana</c:option>
    <c:option value="himachalpradesh">Himachal pradesh</c:option>
    <c:option value="j&k">J&K</c:option>
    <c:option value="jharkhand">Jharkhand</c:option>
    <c:option value="karnataka">Karnataka</c:option>
    <c:option value="kerala">Kerala</c:option>
    <c:option value="mp">M.P</c:option>
    <c:option value="maharashtra">maharashtra</c:option>
    <c:option value="manipur">Manipur</c:option>
    <c:option value="meghalaya">Meghalaya</c:option>
    <c:option value="mizoram">Mizoram</c:option>
    <c:option value="nagaland">Nagaland</c:option>
    <c:option value="odisha">Odisha</c:option>
    <c:option value="punjab">Punjab</c:option>
    <c:option value="rajasthan">Rajasthan</c:option>
    <c:option value="sikkim">Sikkim</c:option>
    <c:option value="tn">TamilNadu</c:option>
    <c:option value="telagana">Telagana</c:option>
    <c:option value="tripura">Tripura</c:option>
    <c:option value="u.p">U.P</c:option>
    <c:option value="uttharkhand">Uttharkhand</c:option>
    <c:option value="wb">WestBengal</c:option>
    </c:select>
     <font color="red"> <c:errors path="state"/></font>
    </td>
    </tr>
    
    <tr><td bgcolor="yellow">How did you konw about us?</td>
     <td> 
    <c:checkbox path="know" value="website"/>Website 
    <c:checkbox path="know" value="friends"/>Friends 
    <c:checkbox path="know" value="walkin"/>Walkin 
    <c:checkbox path="know" value="pamphlet"/>Pamphlet 
    <c:checkbox path="know" value="others"/>Others 
     
      <font color="red"> <c:errors path="know"/></font>
    </td>
        
    </tr>
    
    <tr><td bgcolor="orange">Courses Offered:</td>
    <td><c:checkbox path="course" value="cwithds"/>C WithData Structure 
    <c:checkbox path="course" value="corejava"/>Core Java 
    <c:checkbox path="course" value="advancejava"/>AdvanceJava 
    <c:checkbox path="course" value="spring"/>Spring 
    <c:checkbox path="course" value="hibernate"/>Hibernate 
    <c:checkbox path="course" value="ocjp"/>OCJP Classes
    <c:checkbox path="course" value="projects"/>Projects
    <c:checkbox path="course" value="complete java"/>Complete java
    <c:checkbox path="course" value="others "/>Others
     
    </td>
    <td><font color="red"> <c:errors path="course"/></font></td>
    </tr>
    
    <tr><td>Address</td>
    <td><c:textarea  path="address"/>
    </td></tr>
    
    <tr>
    <td>CollegeName</td>
    <td><c:input path="collegeName"/></td></tr>
    
    <tr><td>enter semester</td><td><c:select path="semester">
    <c:option  value="1st"/>1st sem 
    <c:option  value="2nd"/>2nd sem 
    <c:option  value="3rd"/>3rd sem  
    <c:option  value="4th"/>4th sem 
    <c:option  value="5th"/>5th sem 
    <c:option  value="6th"/>6th sem 
    <c:option  value="7th"/>7th sem 
    <c:option  value="8th"/>8th sem 
        </c:select>
       
    <tr><td><input type="submit" value="Submit"></td></tr>
           
    </table>
    </c:form>
  <!--    <script type="text/javascript">
     
		$( "#date" ).datepicker();
		
		
  
    

  </script>
 --> 
  </body>
</html>
