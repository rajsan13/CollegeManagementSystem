package training.day2I;

public class Student implements Comparable<Student>{
private int sId;
private String sName;
private Double sMarks;
@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks + "]";
}
public Student(int sId, String sName, Double sMarks) {
	super();
	this.sId = sId;
	this.sName = sName;
	this.sMarks = sMarks;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public Double getsMarks() {
	return sMarks;
}
public void setsMarks(Double sMarks) {
	this.sMarks = sMarks;
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.sName.compareTo(o.sName);
}

}
