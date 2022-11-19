package company;

interface Bicycle {
	
	int a = 45; // We can create properties in an interface. It is 'final' by default.
	void applyBreaks (int decrement); // These are the declarations of the methods that must be implemented in the child-class that implements this interface.
	void acclerate (int increment);
}

interface Blowhorn {
	void blowHornK3G();
	void blowHornMHN();
}

class HerculesCycle implements Bicycle, Blowhorn {
	
	// int a = 4;  // This'll change the value of 'a' in interface Bicycle as this class implements the interface.
	
	@Override // notation to annotate that the method below is an abstract.
	public void applyBreaks(int decrement) {
		System.out.println("Decrease speed by " +decrement+ " kmph");		
	}
	@Override
	public void acclerate(int increment) {
		System.out.println("Increase speed by " +increment+ " kmph");
	}
	
	public void blowHornK3G() {
		System.out.println("Kabhi Khushi Kabhi Gham");
	}
	public void blowHornMHN() {
		System.out.println("Main Hoon Naa");
	}
}

public class cwh_54_Interface {

	public static void main(String[] args) {
		
		/* -Interface in English means, a point where two systems meet and interact.
		   -In Java, Interface is a group of related methods with empty bodies.
		   -In case of an Abstract class, we can 'extend' only one abstract class in the child-class.
		    But in case of Interfaces, we can 'implement' more than one interfaces in a same class. 
		   -ALL the methods in an interface must be implemented(overrided) in the child-class (that implements the interface).
		    And all those methods MUST BE PUBLIC.
		   -We can create properties in an interface. And these properties are 'final' by default.
		    We cannot modify these properties in main method as they are final.
		   -An interface cannot implement another interface.
		   -An interface can extend another interface.
		   
		   NOTE:
		        -Interfaces in java is a bit like a class, but with a significant difference.
		        -An interface can only have signature methods, fields(constants), and default methods.
		        -The class implementing an interface needs to define the methods and necessarily not the fields.
		        -We can create a reference of interfaces but not an object.
		        -Interface methods are public by default. */
		
		HerculesCycle hc = new HerculesCycle();
		
		hc.applyBreaks(20);
		hc.acclerate(40);
		// hc.a = 3;  // 'Bicycle.a' cannot be changed as it is final.
		System.out.println("We can write properties in interfaces : " +hc.a+ "\n");
		
		hc.blowHornK3G();
		hc.blowHornMHN();
	}

}
