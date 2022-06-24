package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Order;
import View.OrderView;

public class OrderController {
	
	
	private OrderView view;
	private Order order;


	public OrderController( OrderView view, Order order) {
		this.view = view;
		this.order = order;
		addListener();
	}
	
	private void addListener() {
//		this.view.setOrderEventListener(new CreateOrderListener());
//		this.view.setBackToHome(new BackToHome());
	}

	class CreateOrdertListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class BackToHome implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	
	
}
