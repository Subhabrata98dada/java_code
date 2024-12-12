<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h1>Register form</h1>
     <form action="register2?id=1&name=subhabrata" method="POST">
     Enter id <input type="text" name="aid"><br>
     Enter name<input type="text" name="name"><br>
     Enter address<input type="text" name="address" value="${address}"><br>
     Enter fees<input type="text" name="fees"><br>
     Enter catagory<input type="text" name="catagory"><br>
     <input type="submit">
     </form>
</body>
</html>