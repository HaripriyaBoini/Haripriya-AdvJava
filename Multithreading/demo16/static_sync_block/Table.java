package demo16.static_sync_block;

public class Table {
	public void printTable(int number) {
		System.out.println("number"+number);
		
		synchronized(Table.class) {
		for(int i=1;i<=5;i++) {
			System.out.println("\n"+number+"X"+i+"="+(number*i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	}
}

