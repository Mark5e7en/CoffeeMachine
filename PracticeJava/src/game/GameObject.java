package game;

public abstract class GameObject {
	
	public abstract void draw();
	
	public static void main(String[] args) {
		GameObject player = new Player();
		player.draw();
		
		GameObject menu = new Menu();
		menu.draw();
	}
}
