package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Model.Order;
import dao.DaoImpl;





public class main {

	public static void main(String[] args) throws SQLException {

		Order ord = new Order();
        ord.setAddress("Becker Straﬂe 2");
        ord.setStatus("Deleted");
        DaoImpl ordDao = new DaoImpl();
        
        //create table
        ordDao.createOrderTable();
  
         //add
        ordDao.add(ord);
  
         //read
//        Order o = ordDao.getOrder(11);
//        System.out.println(   o.getOrderID() + " "
//        					+ o.getAddress() + " "		   
//        					+ o.getDate()  + " "
//                            + o.getStatus());
//  
         //read All
        List<Order> ls = ordDao.getOrders();
        for (Order allords : ls) {
            System.out.println(allords);
        }
  
        // update
//        Order tempOrder = ordDao.getOrder(1);
//        tempOrder.setAddress("via Circonvallazione");
//        ordDao.update(tempOrder);
//  
//        // delete
//        ordDao.delete(1);
		
		
		
		
		
		
		
		
		
		
		
//		Connection conn = null;
//		Statement stmt = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		    // db parameters
//		    String url       = "jdbc:mysql://127.0.0.1:3307/lagerverwaltung";
//		    String user      = "root";
//		    String password  = "root";
//		    // create a connection to the database  )
//		    conn = DriverManager.getConnection(url, user, password);
//		    System.out.println("Connected!");
//		    //here should be imported by java.sql.statement, not from mysql!
//		    stmt =  conn.createStatement();
//		    String sqlCreate = 
//		    		 "CREATE TABLE IF NOT EXISTS `Order` (" +
//		    		 " OrderId INT(64) NOT NULL AUTO_INCREMENT, " +
//	                 " address VARCHAR(20), " + 
//	                 " dt DATE, " + 
//	                 " status VARCHAR(20), " + 
//	                 " PRIMARY KEY(`OrderId`))"; 
//
//		    stmt.execute(sqlCreate);
//		    System.out.println("Created Order-table in given database..."); 
//		    
//		} catch(SQLException e) {
//		   System.out.println(e.getMessage());
//		} finally {
//			try{
//		           if(conn != null)
//		           {
//		             conn.close();
//		           }
//			}catch(SQLException ex){
//		           System.out.println(ex.getMessage());
//			}
//		}
//		
	}
}



