package Model;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalTime;

import dao.DAO;
import dao.DaoImpl;

public class Order {
	
	private int orderID;
	private String address;
	private Timestamp date;
	private String status;
	
	
	public Order(String address, Timestamp date, String status) {
		this.address = address;
		this.date = date;
		this.status = status;
	}
	
	public Order()  {
		
//		DAO myDAO = new DaoImpl();		
//		myDAO.createOrderTable();
		
	}

	
//	private void processOrder(){
//		
//	}
//	
//	private void updateOrder() {
//	
//	}
//	
//	private void deleteOrder() {
//			
//	}

	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Timestamp getDate() {
		return date;
	}


	public void setDate(Timestamp timestamp) {
		this.date = timestamp;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", address=" + address + ", date=" + date + ", status=" + status + "]";
	}
	
}
