package game;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int previousNumber = number;
        boolean asc = true;
        boolean desc = true;

        while (number != 0) {
            if (number > previousNumber) {
                previousNumber = number;
                desc = false;

            } else if (number < previousNumber) {
                previousNumber = number;
                asc = false;
            }

            number = scanner.nextInt();
        }
        System.out.println(asc || desc);
			
		scanner.close();

	}

}