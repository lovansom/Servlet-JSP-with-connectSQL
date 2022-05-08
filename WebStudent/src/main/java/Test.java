

import java.util.List;

import bean.Student;
import utils.StudentDAO;

public class Test {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.getAllStudents();
		// dao.insertStudent( "Lan Anh", "Female", "2003-6-7");
		System.out.println("Xuất dữ liệu thành công");
		for(Student o: list) {
			System.out.println(o);
			
		}
	/*	dao.deleteStudent("11");
		for(Student o: list) {
			System.out.println(o);
			
		}*/
		//Student student = dao.getStudentByID("2");
		//System.out.println(student);
	}
}
