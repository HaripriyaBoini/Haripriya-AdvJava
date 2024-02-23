package demo13.synch_block;

public class Thread_safety {
	public static void main(String[] args) {
		//only one object
		Table table = new Table();
		
		//one object is shared by 2 threads
		MyThread t1 = new MyThread(table,5);
		MyThread t2 = new MyThread(table,100);
		MyThread t3 = new MyThread(table,11);
		MyThread t4 = new MyThread(table,13);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	}

}
 