package objectMaster;

public class Samurai extends Human {
	public static int samuraiCount = 0;
	
	public Samurai() {
		health = 200;
		samuraiCount++;
	}
	
	public void deathblow(Human target) {
		target.health = 0;
		health = health/2;
	}
	
	public void meditate() {
		health += health*.5;
	}
	
	public void howMany() {
		System.out.println(samuraiCount);
	}
}
