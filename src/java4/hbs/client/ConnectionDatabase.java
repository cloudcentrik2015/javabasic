package java4.hbs.client;
import java.sql.*;
import javax.swing.*;
public class ConnectionDatabase {
	Connection Connection=null;
	public static Connection DatabaseConnector(){
		try{
			Class.forName("org.sqlite.JDBC");
			Connection Connection=DriverManager.getConnection("jdbc:sqlite:‪E:\\eclips extract\\Database\\Customerinformation.sqlite");
			//JOptionPane.showMessageDialog(null, "Connection succesfull");
			return Connection;
			
		}catch(Exception e)
		{
			//JOptionPane.showInternalMessageDialog(null, e);
			return null;
		}
	}

}
