package week10;

//A TableModel that supplies ResultSet data to a JTable.
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

//ResultSet rows and columns are counted from 1 and JTable 
//rows and columns are counted from 0. When processing 
//ResultSet rows or columns for use in a JTable, it is 
//necessary to add 1 to the row or column number to manipulate
//the appropriate ResultSet column (i.e., JTable column 0 is 
//ResultSet column 1 and JTable row 0 is ResultSet row 1).
public class ResultSetTableModel extends AbstractTableModel {
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private ResultSetMetaData metaData;
	private int numberOfRows;

	// keep track of database connection status
	private boolean connectedToDatabase = false;

	// constructor initializes resultSet and obtains its meta data object;
	// determines number of rows
	public ResultSetTableModel(String driver, String url, String username, String password, String query)
			throws SQLException, ClassNotFoundException {
		// connect to database
		Class.forName(driver);
		// connection = DriverManager.getConnection( url, username, password );
		connection = DriverManager.getConnection(
				"jdbc:sqlserver://localhost:1433;" + "databaseName=AdventureWorks2014;user=wbalaniuc;password=abcdef");

		// create Statement to query database
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		// update database connection status
		connectedToDatabase = true;

		// set query and execute it
		setQuery(query);
	}

	public Class getColumnClass(int column) throws IllegalStateException {
		if (!connectedToDatabase) {
			throw new IllegalStateException("Not connected to Internet");
		}

		try {
			String className = metaData.getColumnName(column + 1);

			return Class.forName(className);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Object.class;
	}

	@Override
	public int getColumnCount() throws IllegalStateException {
		// TODO Auto-generated method stub
		if (!connectedToDatabase) {
			throw new IllegalStateException("Not connected to Database");
		}
			try {
				return metaData.getColumnCount();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			return 0;
		}

	public String getColumnName(int column)throws IllegalStateException {
		if(!connectedToDatabase){
			throw new IllegalStateException("Not connected to Database");
		}
		try{
			return metaData.getColumnName(column + 1);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public int getRowCount() throws IllegalStateException
	{
		// TODO Auto-generated method stub
		if(!connectedToDatabase){
			throw new IllegalStateException("Not connected to Database");
		}
		return numberOfRows;
	}

	@Override
	public Object getValueAt(int row, int column) throws IllegalStateException {
		// TODO Auto-generated method stub
		if(!connectedToDatabase){
			throw new IllegalStateException("Not connected to Database");
		}
		try{
		resultSet.absolute(row + 1);
		return resultSet.getObject(column +1);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return "";
	}
	
	public void setQuery(String query)
		throws SQLException, IllegalStateException
		{
		if(!connectedToDatabase){
			throw new IllegalStateException("Not connected to Database");
		}
		resultSet = statement.executeQuery(query);
		
		metaData = resultSet.getMetaData();
		
		//Obtain number of rows in resultSet
		resultSet.last();
		numberOfRows = resultSet.getRow();
		
		//Refresh
		fireTableDataChanged();
	}
	
	public void disconnectFromDatabase(){
		if(connectedToDatabase)
		{
			try{
				resultSet.close();
				statement.close();
				connection.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			
		}
	}
}// end constructor ResultSetTableModel



























































