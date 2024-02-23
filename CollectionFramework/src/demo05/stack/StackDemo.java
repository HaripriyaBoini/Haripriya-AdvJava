package demo05.stack;

import java.util.Stack;

public class StackDemo {
	static void doSomething2() {
		System.out.println("method 3");
		int no = 10/0;
	}
	static void doSomething1() {
		System.out.println("method 2");
		doSomething2();
		
	}
	

	public static void main(String[] args) {
		StackDemo s =new StackDemo();
		s.doSomething1();
		Stack<Integer>age = new Stack<Integer>();
		age.push(11);
		age.push(17);
		age.push(18);
		age.push(44);
		
		System.out.println(age);
		
		Integer objectRemoved = age.pop();
		System.out.println(objectRemoved);
		System.out.println(age);
		
		
		objectRemoved = age.peek();
		System.out.println(objectRemoved);
		System.out.println(age);
		
		boolean result = age.contains(16);
		if(result) {
			System.out.println(result);
		}
		age.clear();
		System.out.println();
		
		

	}

}
