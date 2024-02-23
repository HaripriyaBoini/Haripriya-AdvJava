package demo11.thread_unsafety;

public class Table {
	public void printTable(int number) {
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


