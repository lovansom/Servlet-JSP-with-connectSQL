<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h3>Create Student</h3>
      
      <p style="color: red;">${errorString}</p>
      
      <form action="add" method="post">
            <table>
            <tr>
           <!--   <td>Id</td>
                    <td>
                        <input type="text" name="id">
                    </td>
                    -->
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="name">
                    </td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <input type="radio" name="gender" value="1">Male
                        <input type="radio" name="gender" value="0">Female
                    </td>
                </tr>
                <tr>
                    <td>Dob</td>
                    <td><input type="text" name="dob"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">THÊM SINH VIÊN</button></td>
                </tr>
            </table>
        </form>
</body>
</html>