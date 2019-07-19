package training.day3;

class MyBusinessLogic implements Runnable{
	Thread t;
	public MyBusinessLogic(String name,int priority) {
		t=new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		t.start();
	}
	@Override
	public void run() {
		System.out.println("The thread name is " +Thread.currentThread().getName());
		
		for(int i=0;i<1000;i++) {
			System.out.println("Value of i is "+i+" in thread " +Thread.currentThread().getName());
		}
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting: "+Thread.currentThread().getName());
	}
	}

public class ThreadEx02 {
public static void main(String[] args) {
	MyBusinessLogic mbl = new MyBusinessLogic("Desktop",6);
	MyBusinessLogic mbl1 = new MyBusinessLogic("Laptop",8);
	//mbl.start();
	//mbl1.run();
	Thread tt1 = new Thread(mbl);
	tt1.start();
	Thread tt2 = new Thread(mbl);
	tt2.start();
	Thread tt3 = new Thread(mbl);
	tt3.start();
	try {
		tt1.join();
		tt2.join();
		tt3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("hello");
	
	
}
}
