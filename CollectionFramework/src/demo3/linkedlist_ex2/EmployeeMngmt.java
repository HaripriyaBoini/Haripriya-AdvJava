package demo3.linkedlist_ex2;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;

public class EmployeeMngmt {

	public static void main(String[] args) {
		 LinkedList<Employee> empList = new LinkedList<Employee>();

	        empList.add(new Employee(101, "harsh", "development", 20000, LocalDate.of(2018, 10, 5)));
	        empList.add(new Employee(102, "ankit", "quality", 35000, LocalDate.of(2015, 10, 11)));
	        empList.add(new Employee(103, "kiran", "deployment", 60000, LocalDate.of(2020, 12, 3)));
	        empList.add(new Employee(104, "pallu", "quality", 670000, LocalDate.of(2022, 8, 3)));
	        empList.add(new Employee(105, "manas", "deployment", 80000, LocalDate.of(2005, 10, 18)));

	        // shuffling "manas" from development to deployment
	        System.out.println(empList);

	        Employee empToShuffle = empList.get(4);
	        empToShuffle.setEmpdept("Deployment");
	        empToShuffle.setSalary(32000);

	        System.out.println(empList);
	        
	        //Employee removing
	        empList.remove(3);
	        System.out.println(empList);
	        
	        empList.add(new Employee(106,"karan","quality",26000,LocalDate.now()));
	        
	        //10000,5,newsalary 15000
	        //10000,2,newsalary,12500
	        
	        for(Employee emp:empList) {
	        	double originalSalary = emp.getSalary();
	        	int incentivePercentage = 25;
	        	
	        	//LocalDate and period classes to calculate years of service
	        	
	        	Period period = Period.between(emp.getdateOfJoining(), LocalDate.now());
	        	int noOfYears = period.getYears();
	        	System.out.println("no. of years="+ noOfYears);
	        	if(noOfYears>=3) {
	        		incentivePercentage = 50;
	        		
	        	}
	        	double newSalary = originalSalary + (originalSalary*incentivePercentage)/100;
	        	emp.setSalary(newSalary);
	        	
	        	System.out.println(empList);
	        	
	        }
	}

}
