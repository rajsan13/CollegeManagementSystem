package training.day2I;

import java.util.Arrays;

public class StudentSortImpl {
public static void main(String[] args) {
	Student[] students = {new Student(101,"abc",34.0),new Student(102,"zcd",89.0),new Student(100,"def",54.2)};
	//Arrays.sort(students);
	
	Student[] s=SortingTemplate.sortByNameAsc(students);
	for(Student temp: s)
	{
		System.out.println(temp);
	}
	BinarySearchTemplate.binary(s, 101);
	
}
}
