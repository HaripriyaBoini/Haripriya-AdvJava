package demo9.iteration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class IterableDemo {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("jay",10000));
		empList.add(new Employee("raj",20000));
		empList.add(new Employee("ajay",70000));
		
		empList.forEach(employee->System.out.println(employee.getName()+","+employee.getSalary()));
		
		HashSet<String> names = new HashSet<String>();
		names.add("abhi");
		names.add("ashu");
		names.add("dev");
		
		names.forEach(name->System.out.println("hi"+name));
		
		PriorityQueue<Integer> rollNos = new PriorityQueue<Integer>();
		rollNos.add(101);
		rollNos.add(121);
		rollNos.add(166);
		
		
		rollNos.forEach(rollNo->System.out.println("Roll No:"+rollNo));
		
		
		
		
		

	}

}
