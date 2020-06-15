package game;

public class ComplexNumbers {

	public static void main(String[] args) {
		Complex number = new Complex();
		number.real = 10;
		number.image = 4;
		
		Complex anotherNumber = new Complex();
		anotherNumber.real = 6;
		anotherNumber.image = 6;
		
		number.add(anotherNumber);

	}
	
}
