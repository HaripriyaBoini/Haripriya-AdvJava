package demo05.current_thread;

public class Task implements Runnable {
	
	char ch;
	Task(char ch){
		this.ch = ch;
	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("ch = "+ch++);
			Thread task = Thread.currentThread();
			System.out.println("Task MyThread :"+task);
		}
		
		
	}

}
