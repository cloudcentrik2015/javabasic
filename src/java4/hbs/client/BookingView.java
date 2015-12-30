package java4.hbs.client;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.qt.datapicker.DatePicker;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;

public class BookingView extends JFrame {
	
	

	private JPanel contentPane;
	private ObservingTextField textField;
	private JTextField txtName;
	private JTextField txtMobileNo;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingView frame = new BookingView();
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
	public BookingView() {
		super("BookingView");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new ObservingTextField();
		textField.setBounds(42, 66, 204, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Datepick");
		btnNewButton.setBounds(258, 66, 115, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lang= null;
	               final Locale locale=getLocale(lang);
	               DatePicker dp= new DatePicker(textField,locale);
	               Date selectedDate = dp.parseDate(textField.getText());
	               dp.setSelectedDate(selectedDate);
	               dp.start(textField);
			}

			private Locale getLocale(String loc) {
				// TODO Auto-generated method stub
				
				
				if (loc != null && loc.length()>0)
	                 return new Locale(loc);
	 else
				return Locale.US;
			}

		
				// TODO Auto-generated method stub

			
			
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(43, 199, 91, 16);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(135, 196, 265, 22);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mobile No");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(43, 238, 91, 16);
		contentPane.add(lblNewLabel_1);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setBackground(Color.WHITE);
		txtMobileNo.setText("Mobile No");
		txtMobileNo.setBounds(135, 231, 265, 22);
		contentPane.add(txtMobileNo);
		txtMobileNo.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(42, 267, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(135, 266, 265, 23);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(162, 302, 80, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(245, 302, 71, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Book");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(320, 302, 80, 25);
		contentPane.add(btnNewButton_3);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Jahirul");
		comboBox.addItem("Ismail");
		comboBox.addItem("Shohidul");
		comboBox.addItem("Babu");
		comboBox.addItem("Polash");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setBounds(99, 23, 147, 30);
		contentPane.add(comboBox);
		
	
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setToolTipText("SelectTime");
		comboBox_1.addItem("Select Time");
		comboBox_1.addItem("09.00-09.30");
		comboBox_1.addItem("09.30-10.00");
		comboBox_1.addItem("10.00-10.30");
		comboBox_1.addItem("10.30-11.00");
		comboBox_1.addItem("11.00-11.30");
		comboBox_1.addItem("11.30-12.00");
		comboBox_1.addItem("Lunch Break");
		comboBox_1.addItem("13.00-13.30");
		comboBox_1.addItem("13.30-14.00");
		comboBox_1.addItem("14.00-14.30");
		comboBox_1.addItem("14.30-15.00");
		comboBox_1.addItem("15.00-15.30");
		comboBox_1.addItem("15.30-16.00");
		comboBox_1.addItem("16.00-16.30");
		comboBox_1.addItem("16.30-17.00");
		comboBox_1.addItem("17.00-17.30");
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_1.setBounds(415, 66, 101, 30);
		contentPane.add(comboBox_1);
		
		JLabel lblBarber = new JLabel("Barber");
		lblBarber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBarber.setBounds(42, 23, 92, 30);
		contentPane.add(lblBarber);
		
		JLabel lblTimeSlot = new JLabel("Time Slot");
		lblTimeSlot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTimeSlot.setBounds(415, 38, 80, 22);
		contentPane.add(lblTimeSlot);
		 
	}
}
