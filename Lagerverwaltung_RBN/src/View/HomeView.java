
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class HomeView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeView frame = new HomeView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to Warehouse A");
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 22));
		lblWelcome.setBounds(130, 80, 285, 22);
		contentPane.add(lblWelcome);
		
		JButton btnProdMg = new JButton("Product Management");
		btnProdMg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProdMg.setBounds(65, 140, 175, 40);
		contentPane.add(btnProdMg);
		
		JButton btnCusMg = new JButton("Customer Management");
		btnCusMg.setBounds(295, 140, 175, 40);
		contentPane.add(btnCusMg);
		
		JButton btnCrOrd = new JButton("Create Order");
		btnCrOrd.setBounds(65, 210, 175, 40);
		contentPane.add(btnCrOrd);
		
		JButton btnInventory = new JButton("Create Inventory");
		btnInventory.setBounds(295, 210, 175, 40);
		contentPane.add(btnInventory);
	}
}

