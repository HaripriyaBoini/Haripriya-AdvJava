package demo04.result_set;

import java.sql.*;


import db.util.DBkeys;

public class Ex01SingleRecordStmt {

	public static void main(String[] args) {
		// made the connection
		try(
				Connection con = DriverManager.getConnection(DBkeys.URL, DBkeys.USERNAME, DBkeys.PASSWORD);
				Statement stmt = con.createStatement();
				
				){
			
			// DQL statement
			String singleRecord = "SELECT * FROM students WHERE student_id = 1";
			
			//Executed a DQL statement
			ResultSet rSet = stmt.executeQuery(singleRecord);
			
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
			
			// handling the exception if an
		}catch(SQLException exception) {
			exception.printStackTrace();
		}

	}

}
