package demo03.pstmt;

import java.sql.*;
import java.util.Scanner;

import db.util.DBkeys;

public class Ex03UpdateData {

	public static void main(String[] args) {
		
		String UpdateQuery ="UPDATE students "
				+"SET student_class =?, student_fees=? "
				+ "WHERE student_name = ?";
		
		//openin the resources : connection with database ,connecting with console
		//try with resources will automatically close these connections
		try(
				Connection con = DriverManager
				.getConnection(DBkeys.URL,DBkeys.USERNAME,DBkeys.PASSWORD);
				PreparedStatement pStmt =con.prepareStatement( UpdateQuery);
				Scanner scanner = new Scanner(System.in);
				){
			
			//gettin data from console
			
			System.out.println("Enter the new class");
			int studClass = scanner.nextInt();
			
			System.out.println("Enter the fees");
			double fees = scanner.nextInt();
			
			System.out.println("Enter the new name");
			String name = scanner.next();
			
			//data is binded to enquiry
			pStmt.setInt(1, studClass);
			pStmt.setDouble(2,fees);
			pStmt.setString(3,name);
			
			int result = pStmt.executeUpdate();
			System.out.println("Result="+result);
			
		}
		catch(SQLException exception) {
			exception.printStackTrace();
			System.out.println("updation failed");
		}

	}

}
