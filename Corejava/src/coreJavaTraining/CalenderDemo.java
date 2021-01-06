package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("M//dd//yyyy hh:mm:ss");
		System.out.println(dateFormat.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.MINUTE));
		


	}

}
