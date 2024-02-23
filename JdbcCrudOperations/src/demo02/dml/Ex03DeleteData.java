package demo02.dml;

import java.sql.*;

public class Ex03DeleteData {

	public static void main(String[] args) {
		//IP no:127.0.01:3306/school";
		
		final String URL ="jdbc:mysql://localhost:3306/school";
		final String USERNAME = "root";
		final String PASSWORD ="Mysql1@*,.";
	
		try(
				Connection con =DriverManager.getConnection(URL,USERNAME,PASSWORD);
				Statement stmt = con.createStatement();
				){
			
			
			String deleteDataQuery ="DELETE from students WHERE student_id = 3";
					
					
			int result=stmt.executeUpdate(deleteDataQuery);
			System.out.println("result1= "+result);
			
			
		}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("updation failed");
			}
			
		}

	}


