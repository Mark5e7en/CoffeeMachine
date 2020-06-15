package game;

public class Complex {
	double real;
	double image;
	
	public void add(Complex num) {
		num.real += this.real;
		num.image += this.image;
		
		System.out.println(num.real + " + " + num.image + "i");
	}

}
