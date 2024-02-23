package demo01.ddl;

//step 1
import java.sql.*;

public class Example01CreateDatabase {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            // step 1.2. this is needed only once per project
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 1.3
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Mysql1@*,.");
            stmt = con.createStatement();
            
            
            String createDbQuery = "CREATE DATABASE IF NOT EXISTS school";

            //step:3 Execute the query
            stmt.executeUpdate(createDbQuery);
            System.out.println("\nDatabase created successfully");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database could not be created");

            e.printStackTrace();

        } finally {
            try {
            	 if (con != null) con.close();
                if (stmt != null) stmt.close();
               
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }

    }
}
