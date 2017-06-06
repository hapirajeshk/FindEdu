<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body>
<h1>Register Successfully...</h1>

<table>
     <tr><td>TutorialName : </td>
     <td>${tutorials.tutorialName}</td>
     </tr>
     <tr><td>ConactNo : </td>
     <td>${tutorials.tutoriaPhNo}</td>
     </tr>
     <tr><td>Email : </td>
     <td>${tutorials.tutorialEmail}</td>
     </tr>
     <tr><td> StartDate : </td>
     <td>${tutorials.startDate}</td>
     </tr>
   </table>
    <b>Adress :</b> 
    <table>
     <tr><td>Country : </td><td>${tutorials.tutorialAdress.country}</td></tr>
     <tr><td>State : </td><td>${tutorials.tutorialAdress.state}</td></tr>
     <tr><td>Dist : </td><td>${tutorials.tutorialAdress.dist}</td></tr>
     <tr><td>City : </td><td>${tutorials.tutorialAdress.city}</td></tr>
     <tr><td>Pin : </td><td>${tutorials.tutorialAdress.pin}</td></tr>
     </table>
</body>
</html>