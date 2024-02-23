package demo10.anon_lambda;

class Task extends Thread{
	
	public Task(String name ) {
		super(name);
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			Thread taskThread = Thread.currentThread();
			System.out.println("name:"+taskThread.getName());
			
		}
	}
}



	public class AnonymousThreadClass {
	
public static void main(String[] args) {
		Task t1 = new Task("Task 1");
		t1.start();
	
		//way 1 of defining anonymous class
		Thread th1 = new Thread() {
		@Override
		public void run() {
			Thread  t = Thread.currentThread();
			System.out.println("ID :"+t.getId()+", name :"+t.getName());
		}
		};
		 th1.start();
		
		
		//way-2
		
		new Thread() {
			@Override
			public void run() {
				Thread t =Thread.currentThread();
				System.out.println("Id :"+t.getId());
			}
		}.start();
	
	}
}




