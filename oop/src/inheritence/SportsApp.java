package inheritence;

public class SportsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c = new Cricket();
		c.excerise();
		c.play();
		c.win();
		Football f = new Football();
		f.excerise();
		f.play();
		f.win();
		Tt t = new Tt();
		t.excerise();
		t.play();
		t.win();

	}

}
class Player {
	public void excerise() {
		System.out.println("Exercise Everyday");
		
	}
	public void play() {
		System.out.println("Play Favourite Sports");
	}
	public void win() {
		System.out.println("Win the game");
	}
}
class Cricket extends Player{
	static {
		System.out.println("Cricket Players");
	}
}
class Football extends Player {
	static {
		System.out.println("Football Players");
	}
}
class Tt extends Player{
	static {
		System.out.println("Table Tennis Players");
	}
}
