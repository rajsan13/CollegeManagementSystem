package CollegeManagementProject.src.training.project;

import java.sql.SQLException;

public class AdminDAO {

	public static boolean authenticateAdmin(String n,String p) throws SQLException {
		String sql = "select * from admin where admin_name = ? and admin_password = ?";
		
		JdbcConnection gc  = new JdbcConnection();
			gc.ps = JdbcConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setString(1, n);
			gc.ps.setString(2, p);
			gc.rs = gc.ps.executeQuery();
			
			if(gc.rs.next()) {
				return true;
			}
			return false;
	}
}
