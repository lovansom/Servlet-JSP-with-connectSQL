<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="background: #666; height: 55px; padding: 5px;">
  <div style="float: left">
     <h1 style="color: white">My Site</h1>
  </div>

  <div style="float: right; padding: 10px; text-align: right; color: white; margin-bottom: 20px;positon: relative">

     <!-- User store in session with attribute: loginedUser -->
     Hello <b>${loginedUser.userName}</b>
   <br/>
     Search <input name="search">

  </div>

</div>
</body>
</html>