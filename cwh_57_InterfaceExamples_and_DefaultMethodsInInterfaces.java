package company;

interface MyCamera {
	void clickPic();
	void recordVideo();
	
	// We can include private methods in an interface which can not be accessed directly. It can be accessed through default method.
	private void takeSnap() {
		System.out.println("Taking snap...");
	}
	/* We can write(implement) default methods in interfaces.
	   By writing these default methods here we can avoid forcing implementation of these methods in the inherited class.*/
	default void record4kVideo() {
		takeSnap(); // this'll access the private method takeSnap()
		System.out.println("Recording 4k video...");
	}
}

interface MyWiFi {
	String[] getNetworks();
	void connectNetworks(String network);
}

class MyCellPhone {
	void callNumber(int phoneNumber) {
		System.out.println("Calling " +phoneNumber);
	}
	
	void pickCall() {
		System.out.println("Connecting...");
	}
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWiFi {
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
}

public class cwh_57_InterfaceExamples_and_DefaultMethodsInInterfaces {

	public static void main(String[] args) {
		
		MySmartPhone ms = new MySmartPhone();
		String[] ar = ms.getNetworks();
		for(String item: ar) {
			System.out.println(item);
		}
		
		/* Default Methods :-
		                    -An interface can have static and default methods.
		                    -Default methods enable us to add new functionality to existing interfaces.
		                    -This feature was introduced in Java8 to ensure backward compatibility while updating an interface.
		                    -Classes implementing the interface need not to implement the default methods.
		                    -Interfaces can also include private methods for default methods to use.
		 */
		
		// ms.takeSnap();  // this'll throw error as takeSnap() is private.
	}

}
