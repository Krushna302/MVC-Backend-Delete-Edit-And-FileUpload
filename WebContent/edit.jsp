<%@page import="Com.Exponent.Model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>!!..Welcome To Update Employee..!!</h1>






<form action="update">
<%
	
	Employee  emp = (Employee)	request.getAttribute("listEmployee");
		
%>

<pre>

Employee Id :<input type="text" name="eid" value="<%=emp.getEid()%>">

Employee Name :<input type="text" name="ename" value="<%=emp.getEname()%>">

Employee Department :<input type="text" name="edepart" value="<%=emp.getEdepart()%>">

Employee Mobile No :<input type="text" name="emobno" value="<%=emp.getEmobno()%>">

Employee Address :<input type="text" name="eaddress" value="<%=emp.getEaddress()%>">

Employee UserName :<input type="text" name="eusername" value="<%=emp.getEusername()%>">

Employee Password :<input type="text" name="epassword" value="<%=emp.getEpassword()%>">



<button value="submit">Update</button>

</form>


</body>
</html>