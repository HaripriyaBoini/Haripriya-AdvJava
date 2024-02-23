package demo16.static_sync_block;

public class Static_synchronizedBlock {
	
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
 