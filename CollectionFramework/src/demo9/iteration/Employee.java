package demo9.iteration;

public class Employee {
         private String name;
         private double salary;
		public Employee() {
			super();
			
		}
		@Override
		public String toString() {
			return "\n Employee [name=" + name + ", salary=" + salary + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Employee(String name, double salary) {
			super();
			this.name = name;
			this.salary = salary;
		}
         
         
         
}
