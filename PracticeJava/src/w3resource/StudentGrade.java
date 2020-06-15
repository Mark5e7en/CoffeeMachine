package w3resource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("C:\\eclipse\\JavaTest.txt"));
		PrintWriter outFile = new PrintWriter("C:\\eclipse\\JavaTestOut.txt");
		
		String firstName;
		String lastName;
		double[] score = new double[5];
		double average;
		double sumScore = 0;
		
		firstName = inFile.next();
		lastName = inFile.next();
		
		for(int i = 0; i < score.length; i++) {
			score[i] = inFile.nextDouble();
			sumScore += score[i];
		}
		
		average = sumScore / 5;
		
		outFile.println("Student Name: " + firstName + " " + lastName);
		outFile.printf("Test scores: %.2f %.2f %.2f %.2f %.2f\n", score[0], score[1], score[2], score[3], score[4]);
		outFile.println("Average test score : " + average);
		
		inFile.close();
		outFile.close();
	}

}
