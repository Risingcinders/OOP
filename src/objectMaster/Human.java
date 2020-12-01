package objectMaster;

public class Human {
	public int strength;
	public int stealth;
	public int intelligence;
	public int health;

	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}

	public void attack(Human target) {
		target.health -= strength;
		
	}
	
	public void printHealth() {
		System.out.println(health);
	}
}
