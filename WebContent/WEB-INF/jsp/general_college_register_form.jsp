<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<form action="${pageContext.request.contextPath}/general/success" method="post">
   <table>
     <tr><td>School Name : </td>
     <td><input type="text" name="generalName"/></td>
     </tr>
     <tr><td>School ConactNo : </td>
     <td><input type="text" name="schoolNo"/></td>
     </tr>
     <tr><td> School Email : </td>
     <td><input type="text" name="schoolEmail"/></td>
     </tr>
   </table>
   <input type="submit" name="submit"/>
   </form>
</body>
</html>