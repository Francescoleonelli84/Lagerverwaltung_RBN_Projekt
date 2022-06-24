package ds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class DsSingleton {

	private static Connection con = null;
	private static DsSingleton dss = null;
	  
    static
    {
        String url = "jdbc:mysql://127.0.0.1:3307/lagerverwaltung";
        String user = "root";
        String pass = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static DsSingleton getInstance() {
		if (dss == null)
			dss = new DsSingleton();
		return dss;
	}
    
    
    public static Connection getConnection()
    {
        return con;
    }
	
}
