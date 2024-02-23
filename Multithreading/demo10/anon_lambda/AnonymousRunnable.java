/*package demo10.anon_lambda;

class Task implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			Thread t = Thread.currentThread();
			System.out.println("\n id:"+t.getId());
		}
	}
}

public class AnonymousRunnable {

	public static void main(String[] args) {
	
		
		
		//Way - 1
				Runnable r1 = new Runnable() {
					@Override
					public void run() {
						for(int i=0;i<3;i++) {
							Thread t =Thread.currentThread();
							System.out.println("name:"+t.getName());
						}
					}
				};
				
				Thread th1 = new Thread(r1,"Task1");
				th1.start();
		
		//way-2
				Thread th2 = new Thread(new Runnable() {
					@Override
					public void run() {
						for(int i=0;i<3;i++) {
							Thread t =Thread.currentThread();
							System.out.println("name:"+t.getName());
						}
					}
				},"Task2");
				th2.start();
				
				//way - 3
				new Thread( new Runnable() {
					@Override
					public void run() {
						for(int i=0;i<3;i++) {
							Thread t =Thread.currentThread();
							System.out.println("id :"+t);
						}
					}
				} ,"Task 3");
				th2.start();
				
				

						
			}
		
	}
	*/

 
