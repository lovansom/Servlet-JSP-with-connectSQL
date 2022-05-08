<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Edit Product</h3>

      <p style="color: red;">${errorString}</p>
      
      <form action="update" method="post">
            <table>
                <tr>
                    <td>ID</td>
                    <td>
                        <input style="color:red;"value="${st.id}" type="text" name="id" readonly>
                    </td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td>
                        <input value="${st.name}"type="text" name="name">
                    </td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <input type="radio" name="gender" value="1" ${st.gender ==1?"checked":""}>Male
                        <input type="radio" name="gender" value="0" ${st.gender ==0?"checked":""}>Female
                    </td>
                </tr>
                <tr>
                    <td>Dob</td>
                    <td><input value="${st.dob}" type="text" name="dob"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">Update</button></td>
                </tr>
            </table>
        </form>
</body>
</html>