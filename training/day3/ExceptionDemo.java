package training.day3;

public class ExceptionDemo {
public static void main(String[] args) {
	try {
	int a=10;
	int b=0;
	System.out.println(a/b);
	}
	catch(ArithmeticException ae) {
		System.out.println("arithmetic error");
	}
	catch(Exception e) {
		System.out.println("Error");
	}
	System.out.println("Some more Logic");
	}
}
