package demo02.dml;

import java.sql.*;

public class Ex02UpdateData {

	public static void main(String[] args) {
		//IP no:127.0.01:3306/school";
		
		final String URL ="jdbc:mysql://127.0.0.1:3306/school";
		final String USERNAME = "root";
		final String PASSWORD ="Mysql1@*,.";
	
		try(
				Connection con =DriverManager.getConnection(URL,USERNAME,PASSWORD);
				Statement stmt = con.createStatement();
				){
			
			
			String UpdateDataQuery ="UPDATE students "
					+"SET student_class= 2, "
					+"student_fees = 5500 "
					+ "WHERE student_id =1";
					
			int result=stmt.executeUpdate(UpdateDataQuery);
			System.out.println("result1= "+result);
			
			
		}catch(SQLException e) {
				e.printStackTrace();
				System.out.println("updation failed");
			}
			
		}

	}


