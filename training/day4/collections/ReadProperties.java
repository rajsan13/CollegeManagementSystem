package training.day4.collections;

import java.io.*;
import java.util.*;

public class ReadProperties {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties prop = new Properties();
	prop.load(new FileReader("db.properties"));
	System.out.println("Username "+prop.getProperty("username"));
	System.out.println("Password "+prop.getProperty("password"));
	System.out.println("db "+prop.getProperty("db"));
	
	
}
}
