package training.project;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Implementation {
    static ArrayList<Student> stu = new ArrayList<Student>();
    static ArrayList<Teacher> tea = new ArrayList<Teacher>();
	static {}
	static File file =new File("Somefile.ser");
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
         Admin a = new Admin();
	    a.addAdmin();
	    System.out.println("Enter Admin Username");
	    Scanner sc1 = new Scanner(System.in);
	    String un = sc1.next();
	    System.out.println("Enter admin password");
	    String pw =sc1.next();
	    Student s = new Student();
		Fees f =new Fees();
		Teacher t = new Teacher();
	    	while(!a.authenticate(un, pw))
	    	{
	    		System.out.println("Invalid username and password Try Again");
	    		 Admin a12 = new Admin();
	    		    a12.addAdmin();
	    		    System.out.println("Enter Admin Username");
	    		    Scanner sc12 = new Scanner(System.in);
	    		    String un12 = sc12.next();
	    		    System.out.println("Enter admin password");
	    		    String pw12 =sc12.next();
	    		    un=un12;
	    		    pw=pw12;
	    	}
	    	/*Student s1 = new Student();
	    	s1.createStudent(1, "name1", 156, "standard1", "division1", "mobileno", "address");*/
		while(true) {
			
			
			System.out.println("Choose the operation to be performed");
			System.out.println("-------------------------------------------");
			System.out.println("1. Add a Teacher ");
			System.out.println("2. Add a Student");
			System.out.println("3. Allocate Fees ");
			System.out.println("4. Add Fine");
			System.out.println("5. Update Amount Paid");
			System.out.println("6. Display Outstanding Amount");
			System.out.println("7. Display Fees to be paid");
			System.out.println("8. Display fine to be paid");
			System.out.println("9. Display Amount Paid");
			System.out.println("10. Display Teacher Details");
			System.out.println("11. Display Student Details");
			System.out.println("12. Exit");
			System.out.println("13. Save Teachers");
			System.out.println("14. Retrieve Teachers");
			Scanner sc =new Scanner(System.in);
			int option=sc.nextInt();
			
			switch(option) {
			case 1:
				addTeacher(t, sc);
				break;
			case 10:
				//printing teachers
				t.print();
				break;
			case 2:
				//System.out.println("Adding Student");
				addStudent(s, sc);
				
			    break;
			case 3:
				//System.out.println("Update Fees");
				updateFees(f, sc);
				break;
			case 4:
				//System.out.println("Update Fine");
				updateFine(f, sc);
				
				break;
			case 5:
				//System.out.println("Update Amount Paid");
				updateAmountPaid(f, sc);
				break;
			case 7:
				//System.out.println("Get Fees");
				displayFees(f, sc);
				break;
			case 8:
				///System.out.println("Get Fine");
				displayFine(f, sc);
					break;
				
			case 9:
				//System.out.println("Get Amount Paid");
				displayAmountPaid(f, sc);
					break;
			case 6:
				//System.out.println("Getting outstanding amount");
				displayOutstandingAmount(f, sc);
				
			case 11:
				//System.out.println("Display Students");
				displayStudents();
				//System.out.println(WriteObject.getStudent());
				
				
				break;
			case 12:
				System.out.println("Exit");
				exit(0);
			case 13:
				System.out.println("Save");
				for(int i =0;i<Teacher.counter; i++) {
					System.out.println(Teacher.teachers[i]);
					tea.add(Teacher.teachers[i]);
				}
				System.out.println(tea);
				WriteObject.storeTeacher(tea);
				
				break;
			case 14:
				
				System.out.println(WriteObject.getTeacher());
				break;
		    default:
		    	System.out.println("wrong option entered");
			
			}
			
		}
		
	    }










	private static void displayStudents() {
		for(int i=0;i<Student.counter;i++) {
			System.out.println(Student.s[i]);}
	}










	private static void displayOutstandingAmount(Fees f, Scanner sc) {
		System.out.println("Enter the id of student whose outStanding amount is to be printed");
		int id6 = sc.nextInt();
		System.out.println(f.getOutstanding(id6));
	}










	private static void displayAmountPaid(Fees f, Scanner sc) {
		System.out.println("Enter the id of student to get corresponding fees");
		int id5 = sc.nextInt();
		if(f.getFees(id5)!=null)
			System.out.println(f.getAmountPaid(id5));
			else
				System.out.println("No such Id Exists");
	}










	private static void displayFine(Fees f, Scanner sc) {
		System.out.println("Enter the id of student to get corresponding fees");
		int id4 = sc.nextInt();
		if(f.getFees(id4)!=null)
			System.out.println(f.getFine(id4));
			else
				System.out.println("No such Id Exists");
	}










	private static void displayFees(Fees f, Scanner sc) {
		System.out.println("Enter the id of student to get corresponding fees");
		int id3 = sc.nextInt();
		if(f.getFees(id3)!=null)
		System.out.println(f.getFees(id3));
		else
			System.out.println("No such Id Exists");
	}










	private static void updateAmountPaid(Fees f, Scanner sc) {
		System.out.println("Enter the id of the student");
		int id2 = sc.nextInt();
		System.out.println("Enter the fine to be updated");
		double amountPaid = sc.nextDouble();
		f.addAmountPaidByStudent(id2, amountPaid);
	}










	private static void updateFine(Fees f, Scanner sc) {
		System.out.println("Enter the id of the student");
		int id1 = sc.nextInt();
		System.out.println("Enter the fine to be updated");
		double fine = sc.nextDouble();
		f.addFineToStudent(id1, fine);
	}










	private static void updateFees(Fees f, Scanner sc) {
		System.out.println("Enter the id of the student");
		int id = sc.nextInt();
		System.out.println("Enter the fees to be updated");
		double fees = sc.nextDouble();
		f.addFeesToStudent(id, fees);
	}










	private static void addStudent(Student s, Scanner sc) throws FileNotFoundException, IOException {
		System.out.println("Enter Student Details");
		System.out.println("Enter Student Id");
		int sId=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("enter standard");
		String standard = sc.next();
		System.out.println("enter division");
		String division = sc.next();
		System.out.println("enter mobile");
		String mobilenumber = sc.next();
		System.out.println("enter address");
		String address = sc.next();
		
		s.createStudent(sId, name, age, standard, division, mobilenumber, address);
		//s.print();
	}










	private static void addTeacher(Teacher t, Scanner sc) {
		System.out.println("Enter the Teacher's Name:");
		String n = sc.next();
		System.out.println("Enter the Teacher's Age:");
		int ag = sc.nextInt();
		System.out.println("Enter the Teacher's Subject:");
		String sub = sc.next();
		System.out.println("Enter the Teacher's Mobile Number:");
		String num = sc.next();
		System.out.println("Enter the Teacher's EmailAdress:");
		String em = sc.next();
		System.out.println("Enter the Teacher's Address:");
		String ad = sc.next();
		t.addTeacher(n, ag, sub, num, em, ad);
	}
	
	    	
	    
		
		
		
		
		
		
		
		/*Student s = new Student();
		s.createStudent(1, "name1", 156, "standard1", "division1", "mobileno", "address");
		s.createStudent(2, "name1", 156, "standard2", "division2", "mobileno", "address");
		s.createStudent(3, "name1", 156, "standard3", "division3", "mobileno", "address");
		s.createStudent(4, "name1", 156, "standard4", "division4", "mobileno", "address");
		s.createStudent(5, "name1", 156, "standard5", "division5", "mobileno", "address");
		s.print();
		Fees f =new Fees();
		f.addFeesToStudent(1, 1000);
		double fees = f.getFees(1);
		System.out.println(fees);
		f.addFineToStudent(1, 100);
		double fine = f.getFine(1);
		System.out.println(fine);
		f.addAmountPaidByStudent(1, 1000);
		double amount_paid = f.getAmountPaid(1);
		System.out.println(amount_paid);
		double ans = fees+fine-amount_paid;
		System.out.println("Outstanding Amount is "+ans);*/
		
	
	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
