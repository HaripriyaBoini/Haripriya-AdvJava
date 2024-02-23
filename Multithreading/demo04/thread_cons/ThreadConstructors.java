package demo04.thread_cons;

public class ThreadConstructors {

	public static void main(String[] args) {
		Task t1 = new Task('a'); 
System.out.println(t1 instanceof Task);
System.out.println(t1 instanceof Runnable);

Thread thread1 = new Thread(t1,"task1");
thread1.start();

	}

}
