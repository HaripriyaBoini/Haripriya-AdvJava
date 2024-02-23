package demo02.function_interface;

import java.util.function.Function;

import entity.Employee;

public class FunctionalInterfaceImp1 {

	public static void main(String[] args) {
		    
		Function<String,Integer> strLength = new LengthCalculator();
		System.out.println(strLength.apply("unocareer"));
		
		Function<String,Integer> strLength2 = str ->str.length();
		System.out.println(strLength2.apply("raj"));
		
		Function<Integer,Integer> cube = number -> number*number*number;
		System.out.println(cube.apply(100));
		
		Function<Employee,Double> totalSalary = employee ->  employee.getBasicsalary()+employee.getIncentives()-employee.getDeductions();
		
		Employee employee1 = new Employee(20000,10000,1000);
		System.out.println(totalSalary.apply(employee1));
		 
		System.out.println(totalSalary.apply(new Employee(25000,5000,2000)));
		 

	}
 
}
