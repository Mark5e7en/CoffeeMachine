package game;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length;
		
		System.out.println("How many number of elements? ");
		length = scanner.nextInt();
		
		int[] element = new int[length];
		
		for (int i = 0; i < length; i++) {
			element[i] = scanner.nextInt();
			
			if (element[i] % 4 == 0) {
				element[i] = element[i];
			} else {
				element[i] = 0;
			}
		}
		
		Arrays.sort(element);
		
		System.out.println(element[element.length-1]);
		

		/*long firstNumber = scanner.nextLong();
		String operation = scanner.next();
		long secondNumber = scanner.nextLong();
		
		switch (operation) {
			case "+" : 
				System.out.println(firstNumber + secondNumber);
				break;
			case "-" : 
				System.out.println(firstNumber - secondNumber);
				break;
			case "*" : 
				System.out.println(firstNumber * secondNumber);
				break;
			case "/" : 
				if (secondNumber == 0) {
					System.out.println("Division by 0!");
					break;
				} else {
					System.out.println(firstNumber / secondNumber);
					break;
				}
			default: System.out.println("Unknown operator");
			
		}*/
		
		scanner.close();

	}
	

}
