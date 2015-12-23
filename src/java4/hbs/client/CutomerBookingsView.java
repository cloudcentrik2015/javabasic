package java4.hbs.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

public class CutomerBookingsView {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public CutomerBookingsView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 739, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMyBookings = new JLabel("My Bookings");
		lblMyBookings.setBounds(266, 13, 234, 33);
		frame.getContentPane().add(lblMyBookings);
		
		//table = new JTable();
		String[] columnas = {"HairDresser", "ADDRESS","Time","Date"};
		Object[][] datos= {
				
				 {"Jahirul","giraldo","20","Time"},
				 {"Ismail","giraldo2","21","Time"},
				 {"Shohidul","giraldo3","22","Time"},
				 {"Babu","giraldo4","23","Time"}
		 };
		table = new JTable(datos,columnas);
		
		table.setBounds(68, 124, 600, 212);
		frame.getContentPane().add(table);
		frame.setVisible(true);
	}
}
