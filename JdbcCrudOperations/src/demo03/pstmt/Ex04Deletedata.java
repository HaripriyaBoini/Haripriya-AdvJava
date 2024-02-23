package demo03.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import db.util.DBkeys;

public class Ex04Deletedata {

	public static void main(String[] args) {
		String deleteQuery = "DELETE FROM students WHERE student_name = ?";
		
		try(
				Connection con = DriverManager
				.getConnection(DBkeys.URL,DBkeys.USERNAME,DBkeys.PASSWORD);
				PreparedStatement pStmt =con.prepareStatement(deleteQuery);
				Scanner scanner = new Scanner(System.in);
				){
			System.out.println("Enter name of the student whom you want to delete: ");
			      String name = scanner.next();
			      
			      pStmt.setString(1, name);
			      
			      int result = pStmt.executeUpdate();
			      System.out.println("result "+result);
		}
			catch(SQLException exception) {
				exception.printStackTrace();
				System.out.println("Deletion failed");
			}
		}
		
		
	}


