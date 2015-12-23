package java4.hbs.client;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class SignupView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1287, 836);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFirstName.setBounds(91, 100, 213, 33);
		frame.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(393, 97, 321, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLastName.setBounds(91, 178, 213, 33);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(393, 175, 321, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAdress.setBounds(91, 264, 135, 33);
		frame.getContentPane().add(lblAdress);
		
		textField_2 = new JTextField();
		textField_2.setBounds(393, 242, 321, 39);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("Phone No");
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPhoneNo.setBounds(91, 336, 125, 33);
		frame.getContentPane().add(lblPhoneNo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(393, 330, 321, 39);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEmail.setBounds(91, 397, 115, 39);
		frame.getContentPane().add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(393, 397, 321, 39);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblConfirmEmail = new JLabel("Confirm Email");
		lblConfirmEmail.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblConfirmEmail.setBounds(91, 464, 231, 33);
		frame.getContentPane().add(lblConfirmEmail);
		
		textField_5 = new JTextField();
		textField_5.setBounds(393, 461, 321, 39);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSex.setBounds(91, 535, 115, 33);
		frame.getContentPane().add(lblSex);
		
		textField_6 = new JTextField();
		textField_6.setBounds(393, 528, 321, 39);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancel?");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(543, 610, 171, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OK!!");
		btnNewButton_1.setForeground(new Color(0, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setToolTipText("");
		btnNewButton_1.setBounds(387, 611, 115, 41);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
}
