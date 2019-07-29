/**@author is sandeep*/
package CollegeManagementProject.src.training.project;



import java.util.List;

public interface StandardStudents {
	public boolean insertStudent(Student t);
	public Student getStudent(int id);
	public List<Student> getAllStudents();
}
