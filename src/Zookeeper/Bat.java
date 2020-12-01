package Zookeeper;

public class Bat extends Animal {
	
	public Bat() {
		energy = 300;
	}
	
	public void fly() {
		System.out.println("Flying");
		energy -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Yummy Humans");
		energy += 25;
	}
	
	public void attackTown() {
		System.out.println("Yummy town");
		energy -= 100;
	}
}
