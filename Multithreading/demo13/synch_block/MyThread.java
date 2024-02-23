package demo13.synch_block;

public class MyThread extends Thread{
	Table table;
	int number;
	public MyThread(Table table, int number) {
		super();
		this.table = table;
		this.number = number;
	}
	@Override
	public void run() {
		table.printTable(number); 
		
	}
	 
	
}

