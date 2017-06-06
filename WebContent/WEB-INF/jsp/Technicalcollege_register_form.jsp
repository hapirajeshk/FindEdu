<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register for college</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/technical/success" method="post">
   <table>
     <tr><td>College Name : </td>
     <td><input type="text" name="collegeName"/></td>
     </tr>
     <tr><td>College ConactNo : </td>
     <td><input type="text" name="collegeNo"/></td>
     </tr>
     <tr><td>College Email : </td>
     <td><input type="text" name="collegeEmail"/></td>
     </tr>
   </table>
   <input type="submit" name="submit"/>
   </form>
</body>
</html>