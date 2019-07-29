package CollegeManagementProject.src.training.project;



public class TempFrontEnd {
	public static void main(String[] args) {
		StandardsTeachers st = new TeacherDao();
		StandardStudents str = new StudentDAO();
		Teacher t =new Teacher("Udit",10,"dsa","afsd","asdf","sdgf");
		Student s= new Student(1,"das",23,"asd","asdf","fsfg","gf");
		str.insertStudent(s);
		st.insertTeacher(t);
	}
}
