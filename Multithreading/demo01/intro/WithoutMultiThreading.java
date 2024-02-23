package demo01.intro;

public class WithoutMultiThreading {

	public static void main(String[] args) {
		System.out.println("----------1------------");
		
		Task task1 = new Task('a');
		task1.run();
		System.out.println("--------------2----------");
		
		Task task2 = new Task('A');
		task2.run();
		System.out.println("----------3----------");

	}

}
