/** @author Sandeep */
package CollegeManagementProject.src.training.project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FeesDAO implements StandardsFees{

	@Override
	public boolean addFeesDetails(Fees fees) {
		String sql = "insert into fees(sId,fees_to_be_paid,fine_to_be_paid,amount_paid) values(?,?,?,?)";
		
		JdbcConnection gc  = new JdbcConnection();
				
		try {
			gc.ps = JdbcConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setInt(1, fees.getsId());
			gc.ps.setDouble(2, fees.fees);
			gc.ps.setDouble(3, fees.fine_amount);
			gc.ps.setDouble(4, fees.fees_paid);

			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean addFine(int sId, double fine) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAmountPaid(int sId, double fine) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fees> getFeesDetails() {
		// TODO Auto-generated method stub
		String sql = "select sId,fees_to_be_paid,"
				+ "fine_to_be_paid,amount_paid from fees";
		JdbcConnection gc = null;
		try {
			gc=new JdbcConnection();
			List<Fees> listfees = new ArrayList<Fees> ();
			gc.ps=JdbcConnection.getMySqlConnection().prepareStatement(sql);
			gc.rs = gc.ps.executeQuery();
			while(gc.rs.next()) {
				Fees f =new Fees();
				f.setsId(gc.rs.getInt("sId"));
				f.fees=gc.rs.getDouble("fees_to_be_paid");
				f.fine_amount=gc.rs.getDouble("fine_to_be_paid");
				f.fees_paid=gc.rs.getDouble("amount_paid");
			
				
				listfees.add(f);
				 
			}
			return listfees;
		   
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

	@Override
	public boolean addFees(int sId, double fees) {
	
		return false;
	}

}
