package demo03.pstmt;

import java.sql.*;


import db.util.DBkeys;

public class Ex01InsertData {

	

	//private static final String URL = null;

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		//'student_id','student_name',student_class','student_fees'
		
		String insertData ="INSERT INTO "
				+"students "
				+"(student_name,student_class,student_fees )"
				+"VALUES(?,?,?)";
		Class.forName(DBkeys.DRIVER);
		try(		
			Connection con = DriverManager.getConnection(DBkeys.URL, DBkeys.USERNAME, DBkeys.PASSWORD);
		    PreparedStatement pStmt = con.prepareStatement(insertData);
				){
			
			pStmt.setString(1, "Raj");
			pStmt.setInt(2, 5);
			pStmt.setDouble(3,6500);
			
			int noOfRowsInserted = pStmt.executeUpdate();
			
			System.out.println("no. of rows inserted="+noOfRowsInserted);
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("insertion Failed");
		}

	}

}
