package objectMaster;

public class Ninja extends Human {
	public Ninja() {
		stealth = 10;
	}
	
	public void steal(Human target) {
		health += stealth;
		target.health -= stealth;
	}
	
	public void runAway() {
		health -= 10;
	}
}
