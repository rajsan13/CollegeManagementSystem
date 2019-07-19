package training.basics;

public class InheImpl {
public static void main(String[] args) {
	//ver1();
	Animal a=new Tiger();
	
}
public static void display(Animal a)
{
	a.talk();
}
private static void ver1() {
	Tiger t = new Tiger();
	t.sleep();
	t.talk();
	t.walk();
	System.out.println("----------------------");
	Human h = new Human();
	h.sleep();
	h.talk();
	h.walk();
}



}
