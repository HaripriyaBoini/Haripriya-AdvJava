package demo04.predicate;

import java.util.function.Predicate;
import entity.Employee;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		Predicate<String> strNullCheck = new IsNull();
		System.out.println(strNullCheck.test("kaustubh"));
		
		String name =null;
		System.out.println(strNullCheck.test(name));
		
		Predicate<Integer> numberNullCheck = number -> number==null;
		
		Integer num1 = 100;
		System.out.println(numberNullCheck.test(num1));
		
		num1=null;
		System.out.println(numberNullCheck.test(num1));
		
		Predicate<Employee>  empstatus = employee -> {
			double totalSalary = employee.getBasicsalary()+employee.getIncentives()-employee.getDeductions();
			return totalSalary<=20000;
		};
		Employee e = new Employee(28000,5000,10000);
		System.out.println(empstatus.test(e));
		 
				
			};
		
		
		

	}


