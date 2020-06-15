package w3resource;

import javax.swing.JOptionPane;

public class ConditionalStatement1 {

	public static void main(String[] args) {
		String numberStr;
		String title = "ConditionalStatement1";
		String message = null;
		int number;
		
		numberStr = JOptionPane.showInputDialog("Input number:");
		number = Integer.parseInt(numberStr);
		
		if (number > 0) {
			message = "Number is positive";
		} else if (number < 0) {
			message = "Number is negative";
		} else {
			message = "Number is zero";
		}
		
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
