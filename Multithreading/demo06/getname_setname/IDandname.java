package demo06.getname_setname;

public class IDandname {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("mainThread:"+mainThread.toString());
		System.out.println("mainID:"+mainThread.getId());
		System.out.println("Main thread old name:"+mainThread.getName());
		mainThread.setName("new name");
		
		System.out.println("main thread old name"+mainThread.getName());
		
		
		Task t1 = new Task('a'); 
		Thread thread1 = new Thread(t1,"Task 1");
		thread1.start();
		
		Task t2 = new Task('A');
		Thread thread2 = new Thread(t2,"Task 2");
		thread2.start();
		
		//System.out.println(t1 instanceof Task);
//System.out.println(t1 instanceof Runnable);

             // MyThread threadt2 = new MyThread(t1,"task1");
               //    thread1.start();

	}

}
