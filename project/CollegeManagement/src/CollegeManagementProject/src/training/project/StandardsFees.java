/** @author Sandeep */
package CollegeManagementProject.src.training.project;

import java.util.List;

public interface StandardsFees {
	public boolean addFees(int sId,double fees);
	public boolean addFeesDetails(Fees fees);
	public boolean addFine(int sId,double fine);
	public boolean addAmountPaid(int sId,double fine);
	public List<Fees> getFeesDetails();
}
