package training.project;

import java.io.*;

public class Student implements Serializable{
	int sId;
	String name;
	int age;
	String standard;
	String division;
	String mobileno;
	String address;
public Student() {}	
public Student(int sId, String name, int age, String standard, String division, String mobileno, String address) {
	super();
	this.sId = sId;
	this.name = name;
	this.age = age;
	this.standard = standard;
	this.division = division;
	this.mobileno = mobileno;
	this.address = address;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getStandard() {
	return standard;
}
public void setStandard(String standard) {
	this.standard = standard;
}
public String getDivision() {
	return division;
}
public void setDivision(String division) {
	this.division = division;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public static Student s[]=new Student[100];
static int counter=0;

public void createStudent(int sId, String name, int age, String standard, String division, String mobileno, String address) throws FileNotFoundException, IOException {
	s[counter]=new Student(sId,name,age,standard,division,mobileno,address);
	WriteObject.storeStudent(s[counter]);
	//System.out.println(s[counter].sId);
	counter++;

}
public void print()
{
for(int i=0;i<counter;i++) {
	System.out.println(s[i]);
}

	}
@Override
public String toString() {
	return "Student [sId=" + sId + ", name=" + name + ", age=" + age + ", standard=" + standard + ", division="
			+ division + ", mobileno=" + mobileno + ", address=" + address + "]";
}

}
