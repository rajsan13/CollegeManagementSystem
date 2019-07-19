package training.day3;
class BusinessLogic extends Thread{
	public void run() {
		System.out.println("The thread name is " +Thread.currentThread().getName());
	
		for(int i=0;i<1000;i++) {
			System.out.println("Value of i is "+i+" in thread " +Thread.currentThread().getName());
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting: "+Thread.currentThread().getName());
	}
}
public class ThreadEx01 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	//invoke run ->single thread
	BusinessLogic businesslogic = new BusinessLogic();
	businesslogic.setName("Desktop");
	businesslogic.start();
	BusinessLogic businesslogic2=new BusinessLogic();
	businesslogic2.setPriority(Thread.NORM_PRIORITY+1);
	businesslogic2.setPriority(businesslogic.getPriority()+1);
	businesslogic2.setName("laptop");
	businesslogic2.start();
	for(int i=0;i<1000;i++) {
		System.out.println("Value of i is "+i+" in thread " +Thread.currentThread().getName());
	}
	try {
		businesslogic.join();
		businesslogic2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Hello");
}
}
