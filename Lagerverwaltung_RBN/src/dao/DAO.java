package dao;

import java.sql.SQLException;
import java.util.List;

import Model.Order;

public interface DAO {
	
	public void createOrderTable() throws SQLException;
	public int add (Order ord)throws SQLException;
    public void delete(int id) throws SQLException;
    public Order getOrder(int id) throws SQLException;
    public List<Order> getOrders() throws SQLException;
    public void update(Order ord) throws SQLException;
	
	
}
