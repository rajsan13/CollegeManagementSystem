/** @author Sandeep */
package CollegeManagementProject.src.training.project;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {
	static Connection connection;
	public ResultSet rs,rs1,rs2;
	public PreparedStatement ps,ps1,ps2;
	
	
	public static Connection getMySqlConnection() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/udit", "root", "mysql");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("gi");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
				
	}
}
