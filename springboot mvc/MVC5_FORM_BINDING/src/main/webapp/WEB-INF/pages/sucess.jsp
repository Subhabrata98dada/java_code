<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Form submitted sucessfully</h1>
 ${id} <hr> 
 ${name} <hr>
 ${address}
 <form action="home" method="get">
 <input type="submit" value="Go to home page">
 </form>
</body>
</html>