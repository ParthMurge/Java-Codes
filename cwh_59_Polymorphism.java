package company;

interface MyCamera2 {
	void clickPic();
	void recordVideo();
	
	// We can include private methods in an interface which can not be accessed directly. It can be accessed through default method.
	private void takeSnap() {
		System.out.println("Taking snap...");
	}
	/* We can write DEFAULT METHODS in interfaces.
	   By writing these default methods here we can avoid forcing implementation of these methods in the inherited class.*/
	default void record4kVideo() {
		takeSnap(); // this'll access the private method takeSnap()
		System.out.println("Recording 4k video...");
	}
}

interface MyWiFi2 {
	String[] getNetworks();
	void connectNetworks(String network);
}

class MyCellPhone2 {
	void callNumber(int phoneNumber) {
		System.out.println("Calling " +phoneNumber);
	}
	
	void pickCall() {
		System.out.println("Connecting...");
	}
}

class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWiFi2 {
	public void clickPic() {
		System.out.println("Taking picture [.]");
	}
	public void recordVideo() {
		System.out.println("Making video [.]");
	}
	
	public String[] getNetworks() {
		System.out.println("Getting list of networks...");
		String[] networkList = {"Mahi", "Anji_100G", "MadamSJ"};
		return networkList;
	}
	public void connectNetworks(String network) {
		System.out.println("Connecting to network " +network);
	}
	
	// below is the method of MySmartPhone2
	void sampMeth() {
		System.out.println("Method of MySmartPhone2");
	}
}

public class cwh_59_Polymorphism {

	public static void main(String[] args) {
		
		MyCamera2 cam = new MySmartPhone2(); // we can take reference of interface and make an object of its inherited class.
		// cam.getNetworks();  --> not allowed.
		// cam.callNumber(); --> not allowed.
		cam.record4kVideo(); // can access only methods of MyCamera2 using 'cam'.
		cam.clickPic();
		
		MyCellPhone2 cp = new MySmartPhone2();
		// cp.clickPic(); --> not allowed.
		// cp.sampMeth(); --> not allowed, as sampMeth() is a method of MySmartPhone2 and 'cp' is object of MyCellPhone2
		cp.callNumber(2981);
		cp.pickCall();
	}

}
