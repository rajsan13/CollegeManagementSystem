/** @author Sandeep */
package CollegeManagementProject.src.training.project;



import java.util.HashMap;
import java.util.Map;

public class Fees extends Student{
//private int sId;
public double fees=0.0;
public double fees_paid=0.0;
public double fine_amount=0.0;
public double outstandingAmount=0.0;
public static Map< Integer,Double> hm =  
new HashMap< Integer,Double>();
public static Map< Integer,Double> hm1 =  
new HashMap< Integer,Double>();
public static Map< Integer,Double> hm2 =  
new HashMap< Integer,Double>();
public static Map< Integer,Double> hm3 =  
new HashMap< Integer,Double>();

public void addFeesToStudent(int sId,double fees) {

	 hm.put(sId, fees);
	 
	
}
public void addFineToStudent(int sId,double fine) {

	 hm1.put(sId,fine);
	
	
}
public void addAmountPaidByStudent(int sId,double amount) {

	 hm2.put(sId,amount);
	
	hm3.put(sId,hm.get(sId)+hm1.get(sId)-hm2.get(sId));
	
}
public Double getOutstanding(int sId) {
	return hm3.get(sId);
}
public Double  getFees(int sId){
	return hm.get(sId);
}
public Double  getFine(int sId){
	return hm1.get(sId);
}
public Double  getAmountPaid(int sId){
	return hm2.get(sId);
}
public Double getOutstandingAmount(int sId) {
	return this.outstandingAmount;
}
public Fees(){
	
}
public Fees(int sId, double fees,double fine_amount,double fees_paid) {
	super();
	this.sId = sId;
	this.fees = fees;
	this.fine_amount = fine_amount;
	this.fees_paid=fees_paid;
	this.outstandingAmount=fees+fine_amount-fees_paid;
}
}
