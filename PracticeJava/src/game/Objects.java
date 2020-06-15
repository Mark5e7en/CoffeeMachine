package game;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Objects {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setSize(400, 4_00);
		window.setTitle("My First Java Program");
		
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon.png");
		window.setIconImage(icon);
		
		Person person1 = new Person();
		person1.setName("Mark");
		person1.setAge(3_1);
		person1.setBodytype("M");
		
		System.out.println("person1 is " + person1.getName() + " with age " + person1.getAge() + " and body type " + person1.getBodytype());
	}

}
