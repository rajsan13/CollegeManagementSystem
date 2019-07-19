package training.basics;
class Employee
{
	private int empId;
	private String empname;
	private double empSalary;
	void display()
	{
		System.out.println(this.empId);
		System.out.println(this.empname);
		System.out.println(this.empSalary);
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpSalary(double empSalary) {
		if(empSalary<10000) {
			System.out.println("Entered salary is less");
			this.empSalary=10000;
		}
		else
		{
		this.empSalary = empSalary;
		}
	}
	public void setEmpname(String empname) {
		if(empname.length()<=2) {
			System.out.println("Entered name is less than 2 characters");
		    this.empname="Noname";	
		}
		else
		this.empname = empname;
		
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpname() {
		return empname;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empId+","+this.empname+","+this.empSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Iam from constructor");
	}
	
}