package w3resource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConditionalStatement12 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("C:\\eclipse\\JavaTest.txt"));
		PrintWriter outFile = new PrintWriter("C:\\eclipse\\JavaTestOut.txt");
		
		int[] num = new int[5];
		int sum = 0;
		double average;
		
		System.out.println("Input the 5 numbers:");
		
		for (int i = 0; i < num.length; i++) {
			num[i] = inFile.nextInt();
			sum += num[i];
		}
		
		average = sum / 5;
		
		outFile.print("The sum of 5 no. is :" + sum);
		outFile.println("\nThe Average is : " + average);
		
		inFile.close();
		outFile.close();

	}

}
