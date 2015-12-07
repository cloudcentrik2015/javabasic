package java4.hbs.client;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class DataBaseShow {

	private JFrame frame;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataBaseShow window = new DataBaseShow();
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
	private DataBaseShow() {
		
		connection=ConnectionDatabase.DatabaseConnector();
		frame = new JFrame();
		frame.setBounds(100, 100, 1183, 812);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ButtonForLoadTable = new JButton("LoadTable");
		ButtonForLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String query="select sex from information";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}
					
				 catch (Exception e) {
					e.printStackTrace();
					 
				}
			}
		});
		ButtonForLoadTable.setBounds(440, 28, 285, 51);
		frame.getContentPane().add(ButtonForLoadTable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(126, 188, 988, 481);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

	
}
