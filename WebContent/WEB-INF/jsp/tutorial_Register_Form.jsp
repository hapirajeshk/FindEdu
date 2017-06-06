<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register</title>
</head>
<body>
<form:errors path="tutorials.*"/>
<form action="${pageContext.request.contextPath}/tutorial/success" method="post">
   <table>
     <tr><td>TutorialName : </td>
     <td><input type="text" name="tutorialName"/></td>
     </tr>
     <tr><td>ConactNo : </td>
     <td><input type="text" name="tutoriaPhNo"/></td>
     </tr>
     <tr><td>Email : </td>
     <td><input type="text" name="tutorialEmail"/></td>
     </tr>
     <tr><td>Password : </td>
     <td><input type="text" name="tutorialPassword"/></td>
     </tr>
     <tr><td> StartDate : </td>
     <td><input type="text" name="startDate"/></td>
     </tr>
   </table>
    <b>Adress :</b> 
    <table>
     <tr><td>Country : </td><td><input type="text" name="tutorialAdress.country"/></td></tr>
     <tr><td>State : </td><td><input type="text" name="tutorialAdress.state"/></td></tr>
     <tr><td>Dist : </td><td><input type="text" name="tutorialAdress.dist"/></td></tr>
     <tr><td>City : </td><td><input type="text" name="tutorialAdress.city"/></td></tr>
     <tr><td>Pin : </td><td><input type="text" name="tutorialAdress.pin"/></td></tr>
     </table>
     <input type="submit" name="submit by clicking here"/>
   </form>
</body>
</html>