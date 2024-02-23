package demo03.pstmt;

import java.sql.*;
import java.util.Scanner;

import db.util.DBkeys;

public class Ex02InsertDataUserInput {

	public static void main(String[] args) {
		
		//'student_id','student_name',student_class','student_fees'
		
		String insertData ="INSERT INTO "
				+"students "
				+"(student_name,student_class,student_fees )"
				+"VALUES(?,?,?)";
		
		try(		
			Connection con = DriverManager.getConnection(DBkeys.URL, DBkeys.USERNAME, DBkeys.PASSWORD);
		    PreparedStatement pStmt = con.prepareStatement(insertData);
				){
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter name of the student: ");
			String name = scanner.next();
			
			System.out.print("Enter class of the student: ");
			int studclass  = scanner.nextInt();
			
			System.out.print("Enter fees of the student: ");
			Double fees = scanner.nextDouble();
			
			
			
			pStmt.setString(1, name);
			pStmt.setInt(2, studclass);
			pStmt.setDouble(3,fees);
			
			int noOfRowsInserted = pStmt.executeUpdate();
			
			System.out.println("no. of rows inserted="+noOfRowsInserted);
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("insertion Failed");
		}

	}

}
