package w3resource;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConvertInchToMeter {

	public static void main(String[] args) {
		food fo = new tuna();
		Scanner input = new Scanner(System.in);
		
		int age;
		
		System.out.print("Input inch: ");
		double inch = input.nextDouble();
		double meters = inch * 0.0254;
		System.out.println(inch + " inches is " + meters + " meters");
		fo.eat();
		
		input.close();
		
		String ageStr = JOptionPane.showInputDialog("What is your age?");
		
		if (ageStr.isEmpty()) {
			System.out.println("Age is invalid");
		}else {
			age = Integer.parseInt(ageStr);
			System.out.println(age >= 60 ? "You are a senior citizen" : "You are young");
		}

	}

}
