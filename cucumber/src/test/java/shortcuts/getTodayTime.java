package shortcuts;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class getTodayTime {

	
	public static void main(String[] args) {
	
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
	
	}

}
