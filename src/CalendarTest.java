import java.util.Date;
import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Calendar Object
		Calendar c = Calendar.getInstance();
		//Get year value
		int year = c.get(Calendar.YEAR);
		//Get Month value 0 stand January 
		int month = c.get(Calendar.MONTH);
		//Get Day value
		int day = c.get(Calendar.DAY_OF_MONTH);
		//Get Hour Value
		int hour = c.get(Calendar.HOUR_OF_DAY);
		//Get Minute value
		int minute = c.get(Calendar.MINUTE);
		//Get Seconds value
		int second = c.get(Calendar.SECOND);
		
		System.out.println("Recently Time: " + year + "-" + month + "-" + day + 
				" " + hour + ":" + minute + ":" + second);
		
		//Transfer Calendar-object to Date-object
		Date date = c.getTime();
		//Get Recently Time's millisecond 
		Long time = c.getTimeInMillis();
		System.out.println("Recently Time: " + date);
		System.out.println("Recantly Millisecoond: " + time);
	}

}
