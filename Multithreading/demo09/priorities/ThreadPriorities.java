 package demo09.priorities;

public class ThreadPriorities {

	public static void main(String[] args) {
		Task t1 = new Task();
		Thread thread1 =new Thread(t1,"Task 1");
		
		Task t2 = new Task();
		Thread thread2 =new Thread(t2,"Task 2");
		
		Task t3 = new Task();
		Thread thread3 =new Thread(t3,"Task 3");
		
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());
        
        thread1.setPriority(Thread.MIN_PRIORITY); //id=14
        thread1.setPriority(3);  //id =15
        thread1.setPriority(Thread.MAX_PRIORITY);  //id =16
        
        thread1.start();
        thread2.start();
        thread3.start();
        
	}

}
