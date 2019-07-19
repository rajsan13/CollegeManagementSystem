package training.basics;

public class EmployeeManagement {
public static void main(String[] args) {
	Employee e = new Employee();
	e.setEmpId(101);
	e.setEmpname("sa");
	e.setEmpSalary(2233.45);
	System.out.println("EmpID-> "+e.getEmpId()+"EmpName->"+e.getEmpname()+"EmpSalary-> "+e.getEmpSalary());
	e.display();
   System.out.println("Emp "+ e.toString());
}
}
