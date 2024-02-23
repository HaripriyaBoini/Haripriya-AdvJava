package demo03.implement_runnable;

import demo02.extend_threadclass.Task;

public class ImplementsRunnable {

	public static void main(String[] args) {
		
		System.out.println("------------1----------");
		Task task1 = new Task('a');
		
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		System.out.println("------------2---------");
		//thread2.start();
		
		Task task2 = new Task('A');
		Thread thread2 = new Thread(task2);
		thread2.start();
		
		System.out.println("-----------3----------");
	}

}
