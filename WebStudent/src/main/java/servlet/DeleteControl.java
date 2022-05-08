package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Student;
import utils.StudentDAO;


@WebServlet(urlPatterns = "/delete")
public class DeleteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DeleteControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get sid form jsp
		String id = (String) request.getParameter("sid");
		
		//pass sid to dao
		StudentDAO dao = new StudentDAO();
		dao.deleteStudent(id);
		response.sendRedirect(request.getContextPath() + "/load");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
