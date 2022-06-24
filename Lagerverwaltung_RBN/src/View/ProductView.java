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

public class ProductView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable tableItemlist;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductView frame = new ProductView();
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
	public ProductView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 396);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(25, 93, 117, 29);
		contentPane.add(btnSearch);
		
		JLabel lblProdName = new JLabel("Product_Name");
		lblProdName.setBounds(30, 30, 97, 16);
		contentPane.add(lblProdName);
		
		JLabel lblPurchasePri = new JLabel("Purchase_Price");
		lblPurchasePri.setBounds(30, 60, 97, 16);
		contentPane.add(lblPurchasePri);
		
		textField = new JTextField();
		textField.setBounds(124, 26, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 55, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProductPic = new JLabel("Product_Picture");
		lblProductPic.setBounds(277, 30, 103, 16);
		contentPane.add(lblProductPic);
		
		JLabel lblSellingPri = new JLabel("Selling_Price");
		lblSellingPri.setBounds(277, 60, 86, 16);
		contentPane.add(lblSellingPri);
		
		JComboBox comboBoxPic = new JComboBox();
		comboBoxPic.setBounds(380, 26, 97, 27);
		contentPane.add(comboBoxPic);
		
		comboBoxPic.setModel(new DefaultComboBoxModel(
				new Object[] {
						new ImageIcon(""),
						new ImageIcon("src/chair_gray1.jpg"),
						new ImageIcon("src/printer_white1.jpg"),
						new ImageIcon("src/sofa_darkblue.jpg")		
				}				
				));	
		
		textField_2 = new JTextField();
		textField_2.setBounds(364, 55, 113, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(495, 60, 73, 16);
		contentPane.add(lblDescription);
		
		textField_3 = new JTextField();
		textField_3.setBounds(570, 55, 130, 55);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddProduct = new JButton("Add Item");
		btnAddProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddProduct.setBounds(140, 93, 117, 29);
		contentPane.add(btnAddProduct);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 151, 672, 130);
		contentPane.add(scrollPane);
		
		tableItemlist = new JTable();
		tableItemlist.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(tableItemlist);
		
		tableItemlist.setModel(new DefaultTableModel(
				new Object[][] {
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},
					{null,null,null,null,null,null},
					
				},
				new String[] {
						"Product_ID","Product_Name","Product_Picture","Description","Quantity","Purchase_Price","Selling_Price"
				}
				));
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(495, 30, 61, 16);
		contentPane.add(lblQuantity);
		
		textField_4 = new JTextField();
		textField_4.setBounds(570, 26, 130, 26);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnGoback = new JButton("Go Back");
		btnGoback.setBounds(588, 314, 117, 29);
		contentPane.add(btnGoback);

		
	}
}
