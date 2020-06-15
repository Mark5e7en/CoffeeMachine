package w3resource;

import java.util.Scanner;

public class Basic152 {

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.print("Input first number: ");
		a = input.nextInt();
		
		System.out.print("Input second number: ");
		b = input.nextInt();
		
		System.out.print("Input third number: ");
		c = input.nextInt();
		
		System.out.print("Input fourth number: ");
		d = input.nextInt();
		
		if(a == b && b == c && c == d && d == a) {
			System.out.println("Numbers are equal!");
		} else {
			System.out.println("Numbers are not equal!");
		}
		
		input.close();*/
		
		
		int arr[][] = {{0,1,2,3},{4,5,6},{7,8}};
		
		for(int row=0; row < arr.length; row++) {
			
			for(int column=0; column < arr[row].length; column++) {
				System.out.println(arr[row][column]);
			}
		}

	}

}
