package demo01.ddl;
import java.sql.*;

public class Ex3AlterTable {
	
	
	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/school";
	    final String USERNAME ="root";
	    final String PASSWORD ="Mysql1@*,.";
		
		try( 
				Connection con =DriverManager.getConnection(URL,USERNAME,PASSWORD);
		        Statement stmt = con.createStatement();
		){
			String alterTableQuery = "ALTER TABLE "
					+"students " 
                    +"CHANGE COLUMN student_id student_id INT NOT NULL AUTO_INCREMENT, " +
                    "CHANGE COLUMN student_nm student_name VARCHAR(45) NOT NULL";
                    
					
		
			stmt.executeUpdate(alterTableQuery);
			System.out.println("table altered succesfully");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Table could not be altered");
		}
		
	
	
}
}
	
		