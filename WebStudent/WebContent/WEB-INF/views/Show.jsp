<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="_header.jsp"></jsp:include>
<h3>Student List</h3>

    <p style="color: red;">${errorString}</p>

    <table border="1" >
       <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Gender</th>
           <th>DOB</th>
          <th>Edit</th>
          <th>Delete</th>
       </tr>
       <c:forEach items="${listS}" var="s" >
          <tr>
             <td>${s.id}</td>
             <td>${s.name}</td>
             <td>
             <c:if test = "${s.gender == 1 }">
             Male
             </c:if>
              <c:if test = "${s.gender == 0 }">
              Female
             </c:if>
             </td>
             <td>${s.dob}</td>
             <td>
                <a href="update?sid=${s.id}">Edit</a>
             </td>
             <td>
                <a href="#" onClick = "showMessage(${s.id})">Delete</a>
             </td>
          </tr>
       </c:forEach>
    </table>

    <a href="add" >Create Student</a>
 <jsp:include page="_footer.jsp"></jsp:include>

</body>
<script>
	function showMessage(id) {
		var option = confirm('Bạn có chắc chắn muốn xóa sinh viên láo này không?')
		if(option === true) {
			window.location.href= 'delete?sid=' + id;
		}
	}
</script>
</html>