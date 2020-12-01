package Zookeeper;

public class Animal {
	// Member Vars
	public int energy;
	
	public Animal() {
		energy = 100;
	}
	
	public void displayEnergy() {
		System.out.println(String.format("Energy is %d", energy));
	}

}
