package w3resource;

import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("input number between 1 and 7: ");
		int day = input.nextInt();
		
		System.out.println(getDayName(day));
		System.out.println(Math.ceil(3.51));
		
		input.close();
	}
	
	public static String getDayName(int day) {
		String dayName = "";
		switch (day) {
		case 1: dayName = "Monday"; break;
		case 2: dayName = "Tuesday"; break;
		case 3: dayName = "Wednesday"; break;
		case 4: dayName = "Thursday"; break;
		case 5: dayName = "Friday"; break;
		case 6: dayName = "Saturday"; break;
		case 7: dayName = "Sunday"; break;
		default: dayName = "Invalid day range";
		}
		return dayName;
		
	}

}
