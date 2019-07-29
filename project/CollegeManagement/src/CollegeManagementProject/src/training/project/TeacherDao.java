package CollegeManagementProject.src.training.project;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDao implements StandardsTeachers{
	
	public boolean insertTeacher(Teacher t) {

		String sql = "insert into teacher(teacher_name,teacher_age,teacher_subject,teacher_mobile,teacher_email,teacher_adress) values(?,?,?,?,?,?)";
				
		JdbcConnection gc  = new JdbcConnection();
				
		try {
			gc.ps = JdbcConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setString(1, t.getTeacherName());
			gc.ps.setInt(2, t.getTeacherAge());
			gc.ps.setString(3, t.getTeacherSubject());
			gc.ps.setString(4, t.getTeacherMobNo());
			gc.ps.setString(5,t.getTeacherEmail());
			gc.ps.setString(6, t.getTeacherAddress());
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return false;
	}
	
	
	public Teacher getTeacher(int id) {
		String sql = "select teacher_id,teacher_name,teacher_age,teacher_subject,teacher_mobile,teacher_email,teacher_address from teacher where teacher_id = ?";
		JdbcConnection gc  = new JdbcConnection();
		try {
			gc.ps = JdbcConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, id);
			gc.rs = gc.ps.executeQuery();
			
			if(gc.rs.next()) {
				Teacher t =new Teacher();
				t.setTeacherId(gc.rs.getInt("teacher_id"));
				t.setTeacherName(gc.rs.getString("teacher_name"));
				t.setTeacherAge(gc.rs.getInt("teacher_age"));
				t.setTeacherSubject(gc.rs.getString("teacher_subject"));
				t.setTeacherMobNo(gc.rs.getString("teacher_mobile"));
				t.setTeacherEmail(gc.rs.getString("teacher_email"));
				t.setTeacherAddress(gc.rs.getString("teacher_address"));
				
				return t;
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
		
	}
	
	public List<Teacher> getAllTeachers(){
		
		
		List<Teacher> ts = new ArrayList<>();
		String sql = "select teacher_id,teacher_name,teacher_age,teacher_subject,teacher_mobile,teacher_email,teacher_adress from teacher";
		JdbcConnection gc  = new JdbcConnection();
		
		try {
			gc.ps = JdbcConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();
			
			while(gc.rs.next()) {
				Teacher t =new Teacher();
				t.setTeacherId(gc.rs.getInt("teacher_id"));
				t.setTeacherName(gc.rs.getString("teacher_name"));
				t.setTeacherAge(gc.rs.getInt("teacher_age"));
				t.setTeacherSubject(gc.rs.getString("teacher_subject"));
				t.setTeacherMobNo(gc.rs.getString("teacher_mobile"));
				t.setTeacherEmail(gc.rs.getString("teacher_email"));
				t.setTeacherAddress(gc.rs.getString("teacher_adress"));
				
				ts.add(t);
				
			}
			
			return ts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
				gc.rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return null;
		
		
	}


	


	

}
