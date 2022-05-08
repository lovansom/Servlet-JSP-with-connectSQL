package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	 
	private final String hostName = "localhost";
	private final String dbName = "sinhvienquanly";
	private final String portNumber = ":3306/";
	private final String userName = "root";
	private final String className = "com.mysql.jdbc.Driver";
	private final String password = "@Som892000@@";
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String url =  "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Class.forName(className);		
		Connection  conn =  DriverManager.getConnection(url,userName,password);
		     return conn;
	}

}
