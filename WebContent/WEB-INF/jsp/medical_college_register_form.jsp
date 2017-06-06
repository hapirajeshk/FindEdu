<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register your Medical college</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/medical/success" method="post">
   <table>
     <tr><td>medical college Name:</td>
     <td><input type="text" name="collegeName"/></td>
     </tr>
     <tr><td>mdical ConactNo : </td>
     <td><input type="text" name="collegeNo"/></td>
     </tr>
     <tr><td> medical Email : </td>
     <td><input type="text" name="collegeEmail"/></td>
     </tr>
   </table>
   <input type="submit" name="submit"/>
   </form>
</body>
</html>