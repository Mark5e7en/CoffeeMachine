package w3resource;

import javax.swing.JOptionPane;

public class AreaAndCircumferenceProgram {

	public static void main(String[] args) {
		String radiusStr;
		double area;
		double circumference;
		double radius;
		String displayMessage;
		
		radiusStr = JOptionPane.showInputDialog("Enter the radius:");
		radius = Double.parseDouble(radiusStr);
		area = Math.PI * radius * radius;
		circumference = 2 * Math.PI * radius;
		
		displayMessage = "Radius: " + radius + "\nArea: " + area + " square units" + "\nCircumference: " + circumference + " units";
		
		JOptionPane.showMessageDialog(null, displayMessage, "Circle", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
