package demo12.synch_method;

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

