package java4.hbs.client;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignupView {

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_10;
	public JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public SignupView() {
		super();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 200, 700, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("Id");
		lblFirstName.setBounds(80, 25, 83, 25);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(221, 21, 321, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("User name");
		lblLastName.setBounds(80, 73, 144, 33);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(221, 73, 321, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAdress = new JLabel("Password");
		lblAdress.setBounds(80, 128, 144, 33);
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblAdress);
		
		textField_2 = new JTextField();
		textField_2.setBounds(221, 128, 321, 33);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("Email");
		lblPhoneNo.setBounds(80, 174, 125, 33);
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblPhoneNo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(221, 174, 321, 39);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("First name");
		lblEmail.setBounds(80, 225, 136, 33);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(221, 226, 321, 39);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblConfirmEmail = new JLabel("Last name");
		lblConfirmEmail.setBounds(80, 275, 125, 33);
		lblConfirmEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblConfirmEmail);
		
		textField_5 = new JTextField();
		textField_5.setBounds(221, 278, 321, 39);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(80, 325, 115, 33);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblAge);
		
		textField_6 = new JTextField();
		textField_6.setBounds(221, 330, 321, 39);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setBounds(80, 388, 83, 33);
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblSex);
		
		textField_7 = new JTextField();
		textField_7.setBounds(221, 382, 321, 39);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhone.setBounds(80, 434, 83, 33);
		//lblSex.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(lblPhone);
		
		textField_8 = new JTextField();
		textField_8.setBounds(221, 434, 321, 39);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddress.setBounds(80, 483, 91, 39);
		//lblSex.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(lblAddress);
		
		textField_9 = new JTextField();
		textField_9.setBounds(221, 486, 321, 39);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCity.setBounds(80, 590, 110, 34);
		//lblSex.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(lblCity);
		
		textField_10 = new JTextField();
		textField_10.setBounds(221, 538, 321, 39);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblPostCode = new JLabel("PostCode");
		lblPostCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPostCode.setBounds(80, 538, 110, 39);
		//lblSex.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(lblPostCode);
		
		textField_11 = new JTextField();
		textField_11.setBounds(393, 601, 321, -34);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		textField_13 = new JTextField();
		textField_13.setBounds(221, 590, 321, 33);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		frame.setVisible(true);
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.setBounds(221, 667, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setBounds(330, 667, 103, 25);
		frame.getContentPane().add(btnClear);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignup.setBounds(445, 667, 97, 25);
		frame.getContentPane().add(btnSignup);
		
		
	}
}
