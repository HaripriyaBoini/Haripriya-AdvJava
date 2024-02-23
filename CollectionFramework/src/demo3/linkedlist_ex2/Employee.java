package demo3.linkedlist_ex2;

import java.time.LocalDate;

public class Employee {
        private int empId;
        private String empName;
        private String empdept;
        private double salary;
        private LocalDate dateOfJoining;
        
		public Employee() {
			super();
			
		}
		public Employee(int empId, String empName, String empdept, double salary,LocalDate dateOfJoining) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empdept = empdept;
			this.salary = salary;
			this.dateOfJoining =dateOfJoining;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpdept() {
			return empdept;
		}
		public void setEmpdept(String empdept) {
			this.empdept = empdept;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public LocalDate getdateOfJoining(){
			return dateOfJoining;
		}
		public void setdateOfJoining()
		{
			this.dateOfJoining = dateOfJoining;
		}
		
		@Override
		public String toString() {
			return "\n Employee [empId=" + empId + ", empName=" + empName + ", empdept=" + empdept + ", salary=" + salary
					+ ", dateOfJoining=" + dateOfJoining + "]";
		}
		
       
        
       
	
		
	}


