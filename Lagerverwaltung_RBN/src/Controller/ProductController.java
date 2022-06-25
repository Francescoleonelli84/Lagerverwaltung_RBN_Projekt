package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Order;
import View.ProductView;

public class ProductController {
	
	
	private ProductView view;
	private Order order;


	public ProductController( ProductView view, Order order) {
		this.view = view;
		this.order = order;
		addListener();
	}
	
	private void addListener() {
		//this.view.setProductListener(new CreateOrderListener());
		this.view.setBackToHome(new BackToHome());
	}

//	public class CreateOrderListener implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
	
	
	public class BackToHome implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Go back");
		}
	}
	}
	
