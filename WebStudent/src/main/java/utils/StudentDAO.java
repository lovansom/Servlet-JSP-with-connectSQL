package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;
import connect.DBConnection;

public class StudentDAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Student> getAllStudents (){
		
		List<Student> list = new ArrayList<Student>();
		String sql = "SELECT * FROM sinhvien;";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			rs =ps.executeQuery();
			while(rs.next()) {
				Student s = new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4));
				list.add(s);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public void deleteStudent(String id) {
		String  sqlString = "DELETE FROM sinhvien WHERE ID = ?";
		try {
			conn = new DBConnection().getConnection();
			ps =conn.prepareStatement(sqlString);
			ps.setString(1,id);
			ps.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void insertStudent(String name, String gender,String dob) {
		String sql = "INSERT INTO sinhvien (Name, Gender, DOB)\n"
				+ "VALUES (?,?,?);";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, dob);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
 	}
	public Student getStudentByID(String id) {
		
		String sql = "SELECT * FROM sinhvien WHERE ID= ?";
		
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1,id);
			rs =ps.executeQuery();
			while(rs.next()) {
				Student s = new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4));
				return s;
			}
		} catch (Exception e) {
			// TODO: handle exception
			}
		return null;
		}
	
	public void updateStudent(String id, String name, String gender, String dob) {
		
		String sql = "UPDATE sinhvien SET Name = ?, Gender = ?, DOB=? WHERE ID = ?";
		try {
			conn = new DBConnection().getConnection();
			ps = conn.prepareStatement(sql);
		
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, dob);
			ps.setString(4,id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
 	}
}

 
