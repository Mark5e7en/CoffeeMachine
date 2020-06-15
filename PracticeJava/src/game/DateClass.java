package game;

import java.util.Calendar;

public class DateClass {
	public static void main(String[] args) {
		
		 int year = 2020;
	     int month = 2; // January
	     int date = 18;

	     Calendar cal = Calendar.getInstance();
	     // Sets the given calendar field value and the time value
	     // (millisecond offset from the Epoch) of this Calendar undefined.
	     cal.clear();
	     System.out.println();
	     cal.set(Calendar.YEAR, year);
	     cal.set(Calendar.MONTH, month);
	     cal.set(Calendar.DATE, date);

	     System.out.println(cal.getTime());
	     System.out.println();
	     
	     for (int i = 0; i < 3; i++) {
	    	 System.out.print("ha");
	     }
	}
	
	

}
