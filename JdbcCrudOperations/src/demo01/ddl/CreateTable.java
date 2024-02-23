package demo01.ddl;
import java.sql.*;

public class CreateTable {

	public static void main(String[] args) {
		try( 
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Mysql1@*,.");
		        Statement stmt = con.createStatement();
		){
			String createTableQuery ="CREATE TABLE"
					+ " students"
					+"(student_id int NOT NULL,student_nm VARCHAR(255) NOT NULL,"
					+"student_class int NOT NULL,student_fees DOUBLE NOT NULL,"
					+"PRIMARY KEY (student_id),UNIQUE KEY student_id_UNIQUE(student_id) )";
		
			stmt.executeUpdate(createTableQuery);
			System.out.println("table creates succesfully");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Table could not be created");
		}
		
	
	
}
}
	
		