package entity;

public class Employee {
	private double basicsalary;
	private double incentives;
	private double deductions;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(double basicsalary, double incentives, double deductions) {
		super();
		this.basicsalary = basicsalary;
		this.incentives = incentives;
		this.deductions = deductions;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public double getIncentives() {
		return incentives;
	}
	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	@Override
	public String toString() {
		return "employee [basicsalary=" + basicsalary + ", incentives=" + incentives + ", deductions=" + deductions
				+ "]";
	}
	

}
