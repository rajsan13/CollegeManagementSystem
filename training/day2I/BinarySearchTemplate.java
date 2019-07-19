package training.day2I;

import java.util.Arrays;

public class BinarySearchTemplate {
public static void binary(Student[] students,int val) {
	//System.out.println(students.length);
	int l=0;
	int h=students.length-1;
	int m=(l+h)/2;
	int flag=0;
	while(l<=h)
	{
		if(val<students[m].getsId())
		{
			h=m-1;
			m=(l+h)/2;
		}
		else if(val>students[m].getsId())
		{
			l=m+1;
			m=(l+h)/2;
		}
		else if(val==students[m].getsId())
		{
			System.out.println("value found");
			System.out.println("Index Value is "+m);
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println("value not found");
	
	

}
public static boolean isStudentFound(Student[] students,int id) {
	int arr[]=new int[students.length];
	for(int i=0;i<students.length;i++)
	{
		arr[i]=students[i].getsId();
	}
	return Arrays.binarySearch(arr, id)>-1;

	
}
}
