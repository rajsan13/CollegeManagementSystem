package training.day4.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		File f = new File("HelloWorld.txt");
		if(f.exists()) {
			System.out.println("File exists");
		}else {
			f.createNewFile();
			System.out.println("File Created");
		}
		System.out.println("Last modified "+new Date(f.lastModified()));
		System.out.println("Can Read "+f.canRead());
		System.out.println("Absolute Path "+f.getAbsolutePath());
		System.out.println("File name "+f.getName());
	}
}
