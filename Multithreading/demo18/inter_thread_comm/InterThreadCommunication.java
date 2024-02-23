package demo18.inter_thread_comm;

public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		Customer customer = new Customer(10000);
		
		new Thread() {
			public void run() {
				customer.deposit(15000);
			}
		}.start();  
		
		Thread.sleep(500);
		
		new Thread() {
			public void run() {
				customer.withdraw(25000);
				 
			}
		}.start();
		
		//customer.withdraw(15000);
		//customer.deposit(10000);
		

	}

}
