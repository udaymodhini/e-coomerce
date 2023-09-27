package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

private static Connection conn=null;

public static Connection getDbConnection() {
	try {
		Class.forName("com.mysql.jdbcdriver");
		try {
			conn=DriverManager.getConnection("jdbc.mysql:localhost//:3306/ecart","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
}

}
