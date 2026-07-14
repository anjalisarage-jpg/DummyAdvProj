package GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtility {
	
	public void togetFutureDate()
	{
		Date date= new Date();
		SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyy");
		sim.format(date);
		
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 30);
		sim.format(cal.getTime());
	}

}
