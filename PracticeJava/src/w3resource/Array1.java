package w3resource;

import java.util.Scanner;

public class Array1 {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		int total = 5;
			
		for(int i = 0; i < 5; i++) {
			System.out.println("Input " + total + " numbers: ");
			arr[i] = console.nextInt();
			sum += arr[i];
			total--;
		}
		
		System.out.println("Total is " + sum);
		
		console.close();

	}

}
