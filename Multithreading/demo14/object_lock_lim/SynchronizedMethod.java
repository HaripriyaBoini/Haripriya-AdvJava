package demo14.object_lock_lim;

public class SynchronizedMethod {
	public static void main(String[] args) {
		//only one object
		Table table1 = new Table();
		Table table2= new Table();
		
		
		//two object is shared by 2 threads
		MyThread t1 = new MyThread(table1,5);
		MyThread t2 = new MyThread(table2,100);
		
		t1.start();
		t2.start();
		
	
	}

}
 