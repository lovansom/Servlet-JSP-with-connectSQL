package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.StudentDAO;


@WebServlet(urlPatterns = "/add")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/AddStudent.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get name from jsp
		
		String id = request.getParameter("id");
		String sname = request.getParameter("name");
		String sgender = request.getParameter("gender");
		String sdob = request.getParameter("dob");
		
		StudentDAO dao = new StudentDAO();
		dao.insertStudent(sname, sgender, sdob);
		response.sendRedirect(request.getContextPath() + "/load");
		

	}

}
