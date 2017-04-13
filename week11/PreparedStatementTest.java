package week11;
import java.sql.*;
import javax.swing.JFrame;

public class PreparedStatementTest {
	private PreparedStatement pst;
	private Connection conn;
	// JDBC driver name and database URL for Oracle                             
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";             
	private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;";
	//
	public PreparedStatementTest()
	{
		try {
			// load the driver class
		      Class.forName( DRIVER );

		      // establish connection to database                              
		      conn = DriverManager.getConnection( DATABASE_URL, "wbalaniuc", "abcdef" );

			pst = conn.prepareStatement("Insert into [dbo].[Product] (Product_ID, Product_Name, Product_Desc) VALUES(?,?,?)");
			//populate the fields
			pst.setInt(1, 4); 
			pst.setString(2, "Sam"); 
			pst.setString(3, "Malone");
			
			//Execute the prepared statement using executeUpdate method:  
			int val = pst.executeUpdate(); //returns the row count


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally{
			System.out.println("Done!");
		}
	}
	//
	public static void main(String[] args) {
		PreparedStatementTest tc=new PreparedStatementTest();
		
		
	}
	
}
