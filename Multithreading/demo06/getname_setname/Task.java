
package demo06.getname_setname;

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
			System.out.println("Task JoinDemo :"+task.getId());
			
		}
		
		
	}

}
