package OOP;

public class Gorilla extends Animal {
	
	public void eatBananas() {
		System.out.println("Yummy bananer");
		energy += 10;
	}
	
	public void throwSomthing() {
		System.out.println("the Gorrilla threw something");
		energy -= 5;
	}
	
	public void climb() {
		System.out.println("the Gorrilla climbed");
		energy -= 10;
	}
	
	
}
