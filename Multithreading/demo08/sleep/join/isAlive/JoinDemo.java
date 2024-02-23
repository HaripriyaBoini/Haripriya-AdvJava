package demo08.sleep.join.isAlive;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Task t1 = new Task(); 
		Thread thread1 = new Thread(t1,"Task 1");
		
		Task t2 = new Task();
		Thread thread2 = new Thread(t2,"Task 2");
		
		
		Task t3 = new Task();
		Thread thread3 = new Thread(t3,"Task 3");
		
		thread1.start();
		//System.out.println("thread alive:"+thread1.isAlive());
		thread1.join();
		//System.out.println("thread alive:"+thread1.isAlive());
		
		thread2.start();
		thread3.start();
		

	}

}
