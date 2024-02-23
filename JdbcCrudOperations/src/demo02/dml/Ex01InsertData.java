package demo02.dml;

import java.sql.*;

public class Ex01InsertData {

	public static void main(String[] args) {
		//IP no:127.0.01:3306/school";
		
		final String URL ="jdbc:mysql://127.0.0.1:3306/school";
		final String USERNAME = "root";
		final String PASSWORD ="Mysql1@*,.";
	
		try(
				Connection con =DriverManager.getConnection(URL,USERNAME,PASSWORD);
				Statement stmt = con.createStatement();
				){
			
			//`student_id`, `student_name`, `student_class`, `student_fees`
			String insertDataQuery1 ="INSERT INTO "
					+"students "
					+"(student_name,student_class,student_fees) "
					+"VALUES('Kinjal',1,5000)";
			
			int result=stmt.executeUpdate(insertDataQuery1);
			System.out.println("result1= "+result);
			
			String insertDataQuery2 ="INSERT INTO "
					+"students "
					+"(student_name,student_class,student_fees) "
					+"VALUES('Kaashvi',2,5500)";
			
			 int result2=stmt.executeUpdate(insertDataQuery2);
			System.out.println("result2= "+result2);
			
		}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}

	}


