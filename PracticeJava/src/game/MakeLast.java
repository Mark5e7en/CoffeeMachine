package game;

public class MakeLast {

	public static void main(String[] args) {
		int minute = 59;
		int hour = 12;
		
		minute++;
		
		if (minute > 59 && hour >= 12) {
			minute = 0;
			hour = 1;
		}
		
		String stringOutput = String.format("%02d:%02d", hour, minute);
		
		System.out.println("time is " + stringOutput);

	}

}
