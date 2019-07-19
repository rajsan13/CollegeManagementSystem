package training.day3;

public class ExceptionEx01 {
public static void main(String[] args) {
	try {
		System.out.println("open connection");
	
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);

	try {
	int[] arr=new int[-2];
	//arr[-1]=0;
	}catch(NegativeArraySizeException nase) {
		nase.printStackTrace();
	
	
	}
	System.out.println("Result of division is "+(a/b));
	}
	catch(ArithmeticException ae) {
		//System.out.println(ae);
		ae.printStackTrace();
	}catch(NumberFormatException nfe) {
		nfe.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();;
	}finally {
		System.out.println("close connection");
	}
	System.out.println("Business Logic");

	
}
}
