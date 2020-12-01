package objectMaster;

public class Humantest {
	public static void main(String[] args) {
		Human DJ = new Human();
		Human Ken = new Human();
		Ken.attack(DJ);
		DJ.printHealth();
	}
}
