package demo9.iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

	public static void main(String[] args) {
		ArrayList<Employee> emplist =new ArrayList<Employee>();
		
		Employee emp = new Employee("C",25000);
		
		emplist.add(new Employee("A",10000));
		emplist.add(emp);
		//emplist.add(new Employee("C",70000));
		emplist.add(new Employee("B",90000));
		
		System.out.println(emplist);
		
		Iterator<Employee> empItr = emplist.iterator();
		
		System.out.println(emplist);
		
		while(empItr.hasNext()) {
			Employee e = empItr.next();
			System.out.println(e);
			
			if(e.equals(emp)){
			//if(e.equals(new Employee("C",25000)));
			empItr.remove();
		}}
		System.out.println(emplist);
			
		}
	}
		
		
		

	


