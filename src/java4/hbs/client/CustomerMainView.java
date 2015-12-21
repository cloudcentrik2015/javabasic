package java4.hbs.client;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class CustomerMainView extends JFrame implements ActionListener{

	public JButton btnRegistrar;
	public JTable table;
	public JScrollPane scrollPane;
	public Container c;
	static CustomerMainView v;
	private JTextField textField;
	private JButton btnBook;
	private JButton btnMyBookings;
	
	public CustomerMainView(){
		
		super("CustomerMainView");
		c= getContentPane();
		
		//tabla
		String[] columnas = {"NAME", "ADDRESS","MOBILE"};
		Object[][] datos= {
				
				 {"Jahirul","giraldo","20"},
				 {"Ismail","giraldo2","21"},
				 {"Shohidul","giraldo3","22"},
				 {"Babu","giraldo4","23"}
		 };
		
		table = new JTable(datos,columnas);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(78, 116, 841, 337);
		scrollPane.setVisible(false);
		getContentPane().setLayout(null);
		
		btnRegistrar = new JButton("Search");
		getContentPane().add(btnRegistrar);
		btnRegistrar.setBounds(696, 28, 245, 70);
		btnRegistrar.addActionListener(this);
		table.setPreferredScrollableViewportSize(new Dimension(500,500));
		c.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(78, 28, 504, 70);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnBook = new JButton("BOOK");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingView bv=new BookingView();
				bv.setVisible(true);
			}

		});
		btnBook.setBounds(770, 458, 171, 64);
		getContentPane().add(btnBook);
		
		btnMyBookings = new JButton("My Bookings");
		btnMyBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CutomerBookingsView cbv= new CutomerBookingsView();
				//cbv.setVisible(true);
			}
		});
		btnMyBookings.setBounds(88, 458, 217, 64);
		getContentPane().add(btnMyBookings);
		
		setSize(999,624);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
	}//constructor
	
	
	public static void main(String[] args) {
		v = new CustomerMainView();
		v.setVisible(true);

	}

	
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource().equals(btnRegistrar)){
			
			scrollPane.setVisible(true);
			v.validate();
			
			
		}
		
	}

}
