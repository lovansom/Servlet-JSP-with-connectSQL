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


@WebServlet(name = "/LoadControl",urlPatterns = "/load")
public class LoadControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoadControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get dữ liệu từ DAO
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.getAllStudents();
		//set dữ liệu tới jsp
		request.setAttribute("listS", list);
		request.getRequestDispatcher("/WEB-INF/views/Show.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
