package demo06.getid;

public class Id {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println("mainThread:"+mainThread);
		System.out.println("mainID:"+mainThread.getId());
		
		
		Task t1 = new Task('a'); 
		Thread thread1 = new Thread(t1,"Task 1");
		thread1.start();
		
		Task t2 = new Task('A');
		Thread thread2 = new Thread(t2,"Task 2");
		thread2.start();
		
	}

}
