package week1.day1;

public class Car {
	
	public void applyBreak() {
		System.out.println("Break Applied");
	}
	
	public void applyGear() {
		System.out.println("Gear Applied");
	}
	
	public void switchonAC() {
		System.out.println("AC Switched On");
	}
	
	public void applyAccelerate() {
		System.out.println("Accelerated");
	}

	public static void main(String[] args) {
		Car venue = new Car();
		venue.applyGear();
		venue.switchonAC();
		venue.applyAccelerate();
	}
		
}

