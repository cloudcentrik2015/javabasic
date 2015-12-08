package java4.hbs.client;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
 
public class DataTable extends JFrame
{
    public DataTable()
    {
        //headers for the table
        String[] columns = new String[] {
            "Id", "Name", "Password", "Sex"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {1, "John", 40.0, "Male" },
            {2, "Rambo", 70.0, "Male" },
            {3, "Zorro", 60.0, "Female" },
        };
 
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Information of Users");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }

	public void DataTable() {
		// TODO Auto-generated method stub
		
	}
     
  /*  public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DataTable();
            }
        });
    }*/

	  
}
