package game;

enum Secret {
	STAR, CRASH, START, STARCRAFT, STARTS
}

public class SomeClass {
	public static void main(String[] args) {
		int counter = 0;
		
		for (Secret secret: Secret.values()) {
			String str = secret.toString();
			

			if (str.contains("STAR")) {
				counter++;
			}
		}
		
		System.out.println(counter);
	}
}
