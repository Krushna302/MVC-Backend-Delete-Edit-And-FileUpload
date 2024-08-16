<%@page import="Com.Exponent.Model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function deleteFunc() {
		alert("This is Delete Function");
		document.mymvcpage.action="del";
		document.mymvcpage.submit();

	}

	function editFunc() {
		alert("This Is Edit Function")
		document.mymvcpage.action="edit";
		document.mymvcpage.submit();

	}
</script>








</head>
<body>

	<h1>!!..Welcome To Exponent Success Page..!!</h1>

	<h2>!!..Employee Data..!!</h2>


	<form name="mymvcpage">

		<%
			List<Employee> employee = (List<Employee>) request.getAttribute("listEmployee");
		%>

		<table border="2" style="color: skyblue">

			<thead>

				<tr>

					<th>Select</th>
					<th>eid</th>
					<th>ename</th>
					<th>edepart</th>
					<th>emobno</th>
					<th>eaddress</th>
					<th>eusername</th>
					<th>epassword</th>
					<th>Edit</th>
					<th>Delete</th>

				</tr>

			</thead>




			<tbody>

				<tr>


					<%
						for (Employee emp : employee) {
					%>


					<td><input type="radio" name="eid" value="<%=emp.getEid()%>"></td>

					<td><%=emp.getEid()%></td>

					<td><%=emp.getEname()%></td>

					<td><%=emp.getEdepart()%></td>

					<td><%=emp.getEmobno()%></td>

					<td><%=emp.getEaddress()%>
					<td><%=emp.getEusername()%></td>

					<td><%=emp.getEpassword()%></td>

					<td><button value="submit" onclick="editFunc()">Edit</button></td>

					<td><button value="submit" onclick="deleteFunc()">Delete</button></td>


				</tr>

				<%
					}
				%>




			</tbody>
			
		</table>

	</form>

</body>
</html>