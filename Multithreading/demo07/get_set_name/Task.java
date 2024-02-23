
package demo07.get_set_name;

public class Task implements Runnable {
	
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			
			
			Thread task = Thread.currentThread();
			
			System.out.println("Task JoinDemo :"+task.getName());
			
			String name = task.getName();
			
			if(name.equals("Task 1")) {
				task.setName("1st name");
			}else if(name.equals("Task 2")) {
				task.setName("2nd task");
			}
			
		}
		
		
	}

}
