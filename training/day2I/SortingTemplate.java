package training.day2I;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {
public static Student[] sortByNameAsc(Student[] students) {
	
Arrays.sort(students, new Comparator<Student>() {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg0.getsId()-(arg1.getsId());
	}

});



return students;
}
}
