import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class CustomerView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable tableCustolist;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerView frame = new CustomerView();
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
	public CustomerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 396);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearchCust = new JButton("Search");
		btnSearchCust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchCust.setBounds(25, 93, 117, 29);
		contentPane.add(btnSearchCust);
		
		JLabel lblCustName = new JLabel("Customer_Name");
		lblCustName.setBackground(new Color(255, 255, 255));
		lblCustName.setFont(UIManager.getFont("Label.font"));
		lblCustName.setBounds(30, 30, 112, 16);
		contentPane.add(lblCustName);
		
		JLabel lblCustEmail = new JLabel("Email_Adress");
		lblCustEmail.setBounds(30, 60, 97, 16);
		contentPane.add(lblCustEmail);
		
		textField = new JTextField();
		textField.setBounds(140, 25, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 55, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCustAddr = new JLabel("Address");
		lblCustAddr.setBounds(297, 30, 61, 16);
		contentPane.add(lblCustAddr);
		
		JLabel lblCustPhN = new JLabel("Phone");
		lblCustPhN.setBounds(297, 60, 61, 16);
		contentPane.add(lblCustPhN);
		
		textField_2 = new JTextField();
		textField_2.setBounds(352, 25, 113, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRemark = new JLabel("Remark");
		lblRemark.setBounds(496, 60, 73, 16);
		contentPane.add(lblRemark);
		
		textField_3 = new JTextField();
		textField_3.setBounds(571, 55, 130, 55);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddCust = new JButton("Add Customer");
		btnAddCust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddCust.setBounds(140, 93, 117, 29);
		contentPane.add(btnAddCust);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 151, 672, 130);
		contentPane.add(scrollPane);
		
		tableCustolist = new JTable();
		tableCustolist.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(tableCustolist);
		
		tableCustolist.setModel(new DefaultTableModel(
				new Object[][] {
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},
					
				},
				new String[] {
						"Customer_ID","Customer_Name","Address","Phone","Email_Address","Purchased_Order","Remark"
				}
				));
		
		JLabel lblRevenue = new JLabel("Revenue");
		lblRevenue.setBounds(496, 30, 61, 16);
		contentPane.add(lblRevenue);
		
		textField_4 = new JTextField();
		textField_4.setBounds(571, 25, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(352, 55, 113, 26);
		contentPane.add(textField_5);
		
		JButton btnGoback = new JButton("Go back");
		btnGoback.setBounds(585, 318, 117, 29);
		contentPane.add(btnGoback);

		
	}
}
