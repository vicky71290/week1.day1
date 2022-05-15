package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 1234567L;
	boolean isPunctured = false;
	String bikeName = "Thunder Bird 350X"; // String is also a data type
	double runningKM = 100000.4;
	
	//all the above are global variables as these are defined under class
	
	public void royalEnfield() {
		System.out.println("noOfWheels = "+ noOfWheels);
		System.out.println("noOfMirrors = "+ noOfMirrors);
		System.out.println("chassisNumber = "+ chassisNumber);
		System.out.println("isPunctured = "+ isPunctured);
		System.out.println("bikeName = "+ bikeName);
		System.out.println("runningKM = " + runningKM);
		
	}
	public static void main(String [] args) {
		
		TwoWheeler bike = new TwoWheeler();
		bike.royalEnfield();
		
	}

}
