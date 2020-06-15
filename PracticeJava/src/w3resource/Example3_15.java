package w3resource;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Example3_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tuna = new tuna();
		
		System.out.println("Enter your name: ");
		String name = input.next();
		
		tuna.sayHelloName(name);
		
		input.close();
		
		double x = 15.674;
		double y = 235.73;
		double z = 9525.9864;
		String title = "Formatting wit the String Method format";
		String message;
		
		message = String.format("The value of x with two decimal places = %.2f\nThe value of y with two decimal places = %.2f\nThe value of z with two decimal places = %.2f", x, y, z);
		
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}
