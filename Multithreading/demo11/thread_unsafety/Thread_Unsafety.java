package demo11.thread_unsafety;

public class Thread_Unsafety {
	public static void main(String[] args) {
		Table table = new Table();
		
		MyThread t1 = new MyThread(table,5);
		MyThread t2 = new MyThread(table,100);
		
		t1.start();
		t2.start();
	
	}

}
 