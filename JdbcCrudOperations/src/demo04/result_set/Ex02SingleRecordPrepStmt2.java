package demo04.result_set;

import java.sql.*;
import java.util.Scanner;

import db.util.DBkeys;

public class Ex02SingleRecordPrepStmt2 {

	public static void main(String[] args) {
		
		//DQL statement
		String singleRecord = "SELECT * FROM students WHERE student_id = ?";
		// made the connection
		try(
				Connection con = DriverManager.getConnection(DBkeys.URL, DBkeys.USERNAME, DBkeys.PASSWORD);
				PreparedStatement pStmt = con.prepareStatement(singleRecord);
				Scanner s = new Scanner(System.in);
				){
			System.out.println("the student id");
			int studentId = s.nextInt();
			
			pStmt.setInt(1, studentId);
			//pStmt.setInt(1,4); //qstn:1 4->get the data of 4th studentid
			
			// Execute DQL statement
			
			//Executed a DQL statement
			ResultSet rSet = pStmt.executeQuery();
			
			//'student_id','student_name',student_class','student_fees'
			
			//checking whether the data is in resultset
			if(rSet.next()) {
				int id = rSet.getInt(1);
				String name=rSet.getString(2);
				int studClass = rSet.getInt(3);
				double fees = rSet.getDouble(4);
				
				System.out.println("\n ID= "+ id +
						", name = "+name+
						", class ="+studClass+
						"' fees ="+fees);
			}
				else {
					System.out.println("no record found");
				}
				}
				
			
			
			// handling the exception if any
		catch(SQLException exception) {
			exception.printStackTrace();
		}
		}

	}


