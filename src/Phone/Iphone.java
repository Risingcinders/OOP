package Phone;

public class Iphone extends Phone implements Ringable {

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		return String.format("Iphone says %s", getRingTone());
	}

	@Override
	public String unlock() {
		return String.format("Iphone unlocked via facial recognition");
		
	}

	@Override
	public void displayInfo() {
		System.out.println(String.format("Iphone %s from %s", getVersionNumber(), getCarrier()));
	}

}
