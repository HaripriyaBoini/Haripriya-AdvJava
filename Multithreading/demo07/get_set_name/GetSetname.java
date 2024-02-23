package demo07.get_set_name;

public class GetSetname {

	public static void main(String[] args) {
		
		
		
		Task t1 = new Task(); 
		Thread thread1 = new Thread(t1,"Task 1");
		thread1.setName("1st task");
		thread1.start();
		
		Task t2 = new Task();
		Thread thread2 = new Thread(t2,"Task 2");
		thread2.setName("2nd task");
		thread2.start();
		

	}

}
