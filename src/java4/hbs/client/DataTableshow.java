package java4.hbs.client;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.*;
import javax.swing.*;

//import net.proteanit.sql.DbUtils;

public class DataTableshow {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataTableshow window = new DataTableshow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	
	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	private DataTableshow() {
		
		//connection=ConnectionDatabase.DatabaseConnector();
		frame = new JFrame();
		frame.setBounds(100, 100, 1081, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ButtonForLoadTable = new JButton("LoadTable");
		ButtonForLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					/*String query="select sex from information";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));*/
					
					DataTable ab= new DataTable();
					ab.DataTable();
				}
					
				 catch (Exception e) {
					e.printStackTrace();
					 
				}
			}
		});
		ButtonForLoadTable.setBounds(141, 100, 726, 77);
		frame.getContentPane().add(ButtonForLoadTable);
	}
	
	 


	
}
