
package demo08.sleep.join.isAlive;

public class Task implements Runnable {
	
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			
			
			Thread task = Thread.currentThread();
			System.out.println("id :"+task.getId()+", name :"+task.getName());
			
		}
		
		
	}

}
