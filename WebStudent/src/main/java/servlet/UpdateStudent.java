package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.RequestGroupInfo;

import bean.Student;
import utils.StudentDAO;


@WebServlet("/update")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("sid");
		StudentDAO dao = new StudentDAO();
		Student student = dao.getStudentByID(id);
		request.setAttribute("st", student);
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/Update.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sid = request.getParameter("id");
		String sname = request.getParameter("name");
		String sgender = request.getParameter("gender");
		String sdob = request.getParameter("dob");
		StudentDAO dao = new StudentDAO();
		dao.updateStudent(sid, sname, sgender, sdob);
		response.sendRedirect(request.getContextPath() + "/load");
	}

}
