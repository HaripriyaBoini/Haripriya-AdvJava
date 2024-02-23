package demo04.result_set;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import db.util.*;
import pojo.Student;

public class Ex04MultipleRecordsList {

	public static void main(String[] args) {
		
		//fees>6000&fees<11000
       String records ="SELECT * FROM students WHERE student_fees > ? AND student_fees< ?"	;	
        try(
        		Connection con = DriverManager.getConnection(DBkeys.URL, DBkeys.USERNAME, DBkeys.PASSWORD);
				PreparedStatement pStmt = con.prepareStatement(records);
        		Scanner scanner = new Scanner(System.in)
        		){
        	
        	List<Student> studentList = new ArrayList<Student>();
        	System.out.println("enter the lower range: ");
        	double lowerRange = scanner.nextDouble();
        	
        	System.out.print("enter the upper range:");
        	double upperRange = scanner.nextDouble();
        	
        	
        	
        	pStmt.setDouble(1, 5000);
        	pStmt.setDouble(2, 11000);
        	
        	ResultSet rSet = pStmt.executeQuery();
        	
        	while(rSet.next()){
        		//fetchin data
        		int id = rSet.getInt(1);
				String name=rSet.getString(2);
				int studClass = rSet.getInt(3);
				double fees = rSet.getDouble(4);
				
				Student student = new Student(id,name,studClass,fees);
				
				studentList.add(student);
				System.out.println(student);
				
				
				System.out.println("\n ID= "+ id +
						", name = "+name+
						", class ="+studClass+
						"' fees ="+fees);
        		
        	}
        	
        	
        }catch(SQLException e) {
        	e.printStackTrace();
        	System.out.println("no records found");
        }
	}

}
