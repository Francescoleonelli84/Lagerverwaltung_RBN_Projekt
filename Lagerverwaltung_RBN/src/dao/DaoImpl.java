package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;

import Model.Order;
import ds.DsSingleton;

public class DaoImpl implements DAO {

	Connection con = DsSingleton.getConnection();

	@Override
	public void createOrderTable() throws SQLException {

		try (

				Statement stmt = con.createStatement();) {
			String sqlCreate = 
		    		 "CREATE TABLE IF NOT EXISTS `Order` (" +
		    		 " OrderId INT(64) NOT NULL AUTO_INCREMENT, " +
	                 " address VARCHAR(20), " + 
	                 " dt DATE, " + 
	                 " status VARCHAR(20), " + 
	                 " PRIMARY KEY(`OrderId`))"; 		 
			boolean check = stmt.execute(sqlCreate);
			if(check == true) {
				System.out.println("Created Order-table in given database...");	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int add(Order ord) throws SQLException {
		String query = "insert into `order` (address, " + "dt, " + "status " + ") VALUES (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, ord.getAddress());
		ps.setTimestamp(2, new java.sql.Timestamp(new java.util.Date().getTime()));
		ps.setString(3, ord.getStatus());
		int n = ps.executeUpdate();
		return n;
	}

	@Override
	public void delete(int id) throws SQLException {
		String query = "delete from `order` where OrderId = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	@Override
	public Order getOrder(int id) throws SQLException {
		String query = "select * from `order` where OrderId = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		Order ord = new Order();
		ResultSet rs = (ResultSet) ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			ord.setOrderID(rs.getInt("orderId"));
			ord.setAddress(rs.getString("address"));
			ord.setDate(rs.getTimestamp("dt"));
			ord.setStatus(rs.getString("status"));
		}

		if (check == true) {
			return ord;
		} else
			return null;
	}

	@Override
	public List<Order> getOrders() throws SQLException {
		String query = "select * from `order`";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = (ResultSet) ps.executeQuery();
		List<Order> ls = new ArrayList();

		while (rs.next()) {
			Order ord = new Order();
			ord.setOrderID(rs.getInt("orderid"));
			ord.setAddress(rs.getString("address"));
			ord.setDate(rs.getTimestamp("dt"));
			ord.setStatus(rs.getString("status"));
			ls.add(ord);
		}
		return ls;
	}

	@Override
	public void update(Order ord) throws SQLException {
		String query = "update `order` set address=?, " + " dt= ? " + " status= ?" + " where orderid = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, ord.getAddress());
		ps.setDate(2, java.sql.Date.valueOf(java.time.LocalDate.now()));
		ps.setString(3, ord.getStatus());
		ps.setInt(4, ord.getOrderID());
		ps.executeUpdate();

	}

}
