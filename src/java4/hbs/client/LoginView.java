package java4.hbs.client;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 931, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(507, 63, 349, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(507, 170, 349, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(349, 63, 147, 39);
		frame.getContentPane().add(lblUserName);

		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(349, 170, 132, 50);
		frame.getContentPane().add(lblNewLabel);

		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignupView sv=new SignupView();
				//sv.setVisible(true);
			}

		});
		btnSignup.setBounds(507, 274, 164, 41);
		frame.getContentPane().add(btnSignup);

		JButton btnSignin = new JButton("Login");
		btnSignin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerMainView cmv=new CustomerMainView();
				cmv.setVisible(true);
			}

		});
		Image img = new ImageIcon(this.getClass().getResource("/ok.png"))
				.getImage();
		btnSignin.setIcon(new ImageIcon(img));

		btnSignin.setBounds(692, 274, 164, 41);
		frame.getContentPane().add(btnSignin);

		JLabel label = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/login1.png"))
				.getImage();
		label.setIcon(new ImageIcon(img2));
		label.setBounds(15, 28, 320, 394);
		frame.getContentPane().add(label);
		frame.setVisible(true);
	}
}
