package demo9.iteration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Employee> employees = new Vector<Employee>();
		employees.add(new Employee("kinjal",50000));
		employees.add(new Employee("kirthi",45000));
		employees.add(new Employee("pavan",44000));
		employees.add(new Employee("hari",89000));
		employees.add(new Employee("pankaj",90000));
		
		Enumeration<Employee> enumEmp =employees.elements();
		while(enumEmp.hasMoreElements()) {
			Employee e = enumEmp.nextElement();
			
			System.out.println(e.getName()+"receives"+e.getSalary()+"per month ");
		}
		Stack<String> cards = new Stack<String>();
		cards.add("ace");
		cards.add("queen");
		cards.add("ten");
		cards.add("one");
		Enumeration<String> eachCard=cards.elements();
		while(eachCard.hasMoreElements()) {
			System.out.println(eachCard.nextElement());
			
		}
		Hashtable<Integer,String> students =new Hashtable<Integer,String>();
		students.put(101, "harsh");
		students.put(101, "jayanth");
		students.put(101, "manish");
		students.put(101, "kiran");
		students.put(101, "vinod");
		
		Enumeration<String> studEnum= students.elements();
		while(studEnum.hasMoreElements()) {
			String name = studEnum.nextElement();
			System.out.println(name);
		}
		
		
		
		
		

	}

}
