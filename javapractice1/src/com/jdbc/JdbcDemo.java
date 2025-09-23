package com.jdbc;
import java.sql.*;   // Gives access to JDBC API: interfaces (Connection, Statement, ResultSet)& Classes (like DriverManage)

public class JdbcDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // DB connection details
        String url = "jdbc:postgresql://localhost:5432/KPRIT";   // DB URL → jdbc:subprotocol://host:port/dbname
        String user_name = "postgres";                          // DB username
        String pass_word = "kalyani@2003";                       // DB password
        
        // 1. Load and Register the Driver
        //Tells JVM which database driver to use.(PostgreSQL driver in this case).
        // Driver class is inside the JAR file (postgresql-xx.jar) that must be added to classpath.
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver is loaded");
        
        // 2. Get Connection (Connection = interface, cannot create with new)
        // DriverManager (class) → provides getConnection() to return implementation object
        Connection con = DriverManager.getConnection(url, user_name, pass_word);
        System.out.println("Connection established");
        
        // 3. Create Statement (interface; object given by Connection)
        String sql_query = "select * from student";   // SQL query to fetch all records
        Statement st = con.createStatement();
        
        // 4. Execute the Query
        // executeQuery() → Used for SELECT queries (returns a ResultSet)
        // executeUpdate() → Used for INSERT/UPDATE/DELETE queries (returns int)
        ResultSet rs = st.executeQuery(sql_query);
        
        // 5. Process results (ResultSet = interface, acts like cursor)
        while(rs.next()) {
            // Access columns by index (1-based) or by column name
            System.out.println(rs.getInt(1) + " | " + rs.getString(2));
            // Here → getInt(1) = first column (student id), getString(2) = second column (student name)
        }
        
        // 6. Close the connection (important to avoid memory leaks)
        st.close();
        con.close();
    }
}
