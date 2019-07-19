package training.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import training.day2I.Account;

public class WriteObject {
	public static void storeStudent(Student st) throws FileNotFoundException, IOException {
		File file = new File("student.ser");
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(file));	
		oos.writeObject(st);
		oos.close();
		System.out.println("Data written succesfully");
		}
	public static Student getStudent() throws ClassNotFoundException, IOException {
		File file =new File("student.ser");
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
		Student st = (Student) ois.readObject();
		//System.out.println(ois.readInt());
		return st;
	}
	public static void storeTeacher(ArrayList<Teacher> tea) throws FileNotFoundException, IOException {
		File file = new File("Teacher.ser");
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(file));	
		oos.writeObject(tea);
		oos.close();
		System.out.println("Data written succesfully");
		}
	public static ArrayList<Teacher> getTeacher() throws ClassNotFoundException, IOException {
		File file =new File("Teacher.ser");
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(file));
		ArrayList<Teacher> arr= new ArrayList<>();
		 arr = (ArrayList<Teacher>) ois.readObject();
		//System.out.println(ois.readInt());
		return arr;
	}
}
