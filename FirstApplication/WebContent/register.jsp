<%@ include file="header.jsp" %>
<h2 align="center"> Register Page </h2>
<form action="registerServlet" method="post">
	<table align="center">
	<tr>
	<td>First Name </td>
	<td> <input Type="text" name="fname"></td>
	</tr>
	<tr>
	<td>Last Name </td>
	<td> <input Type="text" name="lname"></td>
	</tr>
	<tr>
	<td>Email Id   </td> 
	<td><input Type="email" name="email"></td>
	</tr>
	<tr>
	<td>Gender    </td> 
	<td><input Type="radio" name="gender" value="male">Male <input Type="radio" name="gender" value="male">Female</td>
	</tr>
	<tr>
	<td>password  </td>
	<td> <input Type="password" name="password"></td>
	</tr>
	<tr>
	<td colspan="2" align="center"><input type="submit" value="Register"></td>
	</tr>
	</table>
</form>