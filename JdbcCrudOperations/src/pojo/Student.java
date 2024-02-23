package pojo;


// 'student_id','student_name',student_class',student_fees'
public class Student {
private int studentId;
private String studentName;
private int studentClass;
private double studentFees;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int studentId, String studentName, int studentClass, double studentFees) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentClass = studentClass;
	this.studentFees = studentFees;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
			+ ", studentFees=" + studentFees + "]";
}

}
