package demo09.priorities;

public class Task implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int i=0;i<=3;i++) {
			System.out.println("id :"+t.getId()+"name: "+t.getName());
		}
		
	}

}
