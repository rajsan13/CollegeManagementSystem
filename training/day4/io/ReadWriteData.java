package training.day4.io;

import java.io.*;

public class ReadWriteData {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee id");
		int empId = Integer.parseInt(br.readLine());
		System.out.println("enter name");
		String empName = br.readLine();
		System.out.println("Enter Salary");
		double salary = Double.parseDouble(br.readLine());
		display(empId, empName, salary);
		// write the data to the file
		//writeData(empId, empName, salary);
		// Read Contents from file
		readFile();
		
		
	}

	private static void readFile() throws FileNotFoundException, IOException {
		BufferedReader brFile = new BufferedReader(new FileReader("Emp.txt"));
		String line  = null;
		while((line=brFile.readLine())!=null) {
			System.out.println(line);
		}
	}

	private static void writeData(int empId, String empName, double salary) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Emp.txt",true));
		try {
		
		bw.append("EmpId: "+empId);
		bw.newLine();
		bw.append("EmpName: "+empName);
		bw.newLine();
		bw.append("EmpSalary: "+salary);
		bw.newLine();
	
		
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}finally {
			bw.close();
		}
		System.out.println("Data Written ");
	}

	private static void display(int empId, String empName, double salary) {
		System.out.println("empId "+empId);
		System.out.println("empName "+empName);
		System.out.println("salary "+salary);
	}

}
