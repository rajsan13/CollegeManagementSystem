package training.day2I;

public class StaticEx01 {
	public static void addNum(int num1,int num2) {
		System.out.println("Addition "+(num1+num2));
	}
	static {
		System.out.println("kdjafhk");
	}
public static void main(String[] args) {
	addNum(10,20);
}
}
