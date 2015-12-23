package java4.hbs.client;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import com.qt.datapicker.DatePicker;

public class ObservingTextField extends JTextField implements Observer {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void update(Observable o, Object arg) {
        Calendar calendar = (Calendar) arg;
        DatePicker dp = (DatePicker) o;
     //   System.out.println("picked=" + dp.formatDate(calendar));
        setText(dp.formatDate(calendar));
    }
}
