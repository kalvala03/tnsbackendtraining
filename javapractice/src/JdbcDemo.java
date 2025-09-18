import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//private static final String  DRIVERNAME="org.postgresql.Driver";
		final String USERNAME="postgres";
		final String PASSWORD="kalyani@2003";
		final String URL="jdbc:postgresql://localhost:5432/KPRIT";
		
		//1. load the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver is loaded");
		
		//2. Get the connection
		Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		System.out.println("Connection established");
		
		//3. create the statement
		String query="select * from student";
		Statement stmt=con.createStatement();
		
		//4.Execute Query
		
		
		//5.Retrieving the data
		ResultSet rs =stmt.executeQuery(query);;
		while(rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			//System.out.print(rs.getString(3));
			System.out.println();
		}
		
		//6.close the resources
		stmt.close();
		con.close();	
		
	}

}
