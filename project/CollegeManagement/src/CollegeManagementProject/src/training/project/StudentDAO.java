/**@author Sandeep*/
package CollegeManagementProject.src.training.project;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class StudentDAO implements StandardStudents{

	@Override
	public boolean insertStudent(Student Student) {
		// TODO Auto-generated method stub
		// ? called as positional params index starts with 1
		String sql = "insert into student values(?,?,?,?,?,?,?)";
		JdbcConnection gc = new JdbcConnection();
		
		try {
			gc.ps = JdbcConnection.getMySqlConnection().prepareStatement(sql);
			gc.ps.setInt(1, Student.getsId());
			gc.ps.setString(2, Student.getName());
			gc.ps.setInt(3, Student.getAge());
			gc.ps.setString(4, Student.getStandard());
			gc.ps.setString(5, Student.getDivision());
			gc.ps.setString(6, Student.getMobileno());
			gc.ps.setString(7, Student.getAddress());
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 return false;
	}

	

	
	@Override
	public Student getStudent(int sId) {
		// TODO Auto-generated method stub
		String sql = "select sId,name,age,standard,"
				+ "division,mobileno,address from student where sId=?";
		JdbcConnection gc = new JdbcConnection();
		 try {
				gc.ps=JdbcConnection.getMySqlConnection().prepareStatement(sql);
				//gc.ps.setDouble(1, newSalary);
				gc.ps.setInt(1, sId);
			    //System.out.println("deleted");
				gc.rs = gc.ps.executeQuery();
				if(gc.rs.next()) {
					Student e = new Student();
					e.setsId(gc.rs.getInt("sId"));
					e.setName(gc.rs.getString("name"));
					e.setAge(gc.rs.getInt("age"));
					e.setStandard(gc.rs.getString("standard"));
					e.setDivision(gc.rs.getString("division"));
					e.setDivision(gc.rs.getString("mobileno"));
					e.setDivision(gc.rs.getString("address"));

					 return e;
				}
			   
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String sql = "select sId,name,age,standard,"
				+ "division,mobileno,address from student";
		JdbcConnection gc = null;
		try {
			gc=new JdbcConnection();
			List<Student> listStudent = new ArrayList<Student> ();
			gc.ps=JdbcConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();
			while(gc.rs.next()) {
				Student e = new Student();
				e.setsId(gc.rs.getInt("sId"));
				e.setName(gc.rs.getString("name"));
				e.setAge(gc.rs.getInt("age"));
				e.setStandard(gc.rs.getString("standard"));
				e.setDivision(gc.rs.getString("division"));
				e.setDivision(gc.rs.getString("mobileno"));
				e.setDivision(gc.rs.getString("address"));
				listStudent.add(e);
				 
			}
			return listStudent;
		   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
