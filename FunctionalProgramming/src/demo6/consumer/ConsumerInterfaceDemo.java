package demo6.consumer;

import java.util.function.Consumer;

import entity.Employee;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		Consumer<Employee> printEmpDetails = employee ->{
				double totalSalary = employee.getBasicsalary()-employee.getIncentives()-employee.getDeductions();
				System.out.println("total salary"+totalSalary);
		};
		printEmpDetails.accept(new Employee(20000,10000,1000));
	

	}

}
