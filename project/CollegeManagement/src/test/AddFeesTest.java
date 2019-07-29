/** @author Sandeep */

package test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ListIterator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import CollegeManagementProject.src.training.project.Fees;
import CollegeManagementProject.src.training.project.FeesDAO;
import CollegeManagementProject.src.training.project.StandardsFees;
import CollegeManagementProject.src.training.project.TempFrontEnd;

public class AddFeesTest {
	double delta = 0.001;
	Fees f =new Fees();
	Fees f2 =new Fees();
	ListIterator<Fees> listIterator= null;
    @Before
    public void setUp(){
    	StandardsFees f1= new FeesDAO();
		List<Fees> temp = f1.getFeesDetails();
		listIterator = f1.getFeesDetails().listIterator();
		f = listIterator.next();
		f2=listIterator.next();
	
		
    }
	@Test
    public void testFindDetails()
    {
		
	   
        assertEquals(1, f.getsId(),delta);
        assertEquals(6565, f.fees,delta);
        assertEquals(1500, f.fees_paid,delta);
        assertEquals(450, f.fine_amount,delta);
      
   
		
        return;
    }



}