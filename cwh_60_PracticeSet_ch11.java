package company;

// Q1:
abstract class Pen {
	abstract void write();
	abstract void refill();
}

// Q2:
class FountainPen extends Pen {
	void changeNib() {
		System.out.println("Changing nib of the fountain pen.");
	}
	
	public void write() {
		System.out.println("Writing with the pen.");
	}
	public void refill() {
		System.out.println("Refilling the pen.");
	}
}

// Q3:
interface BasicAnimal {
	void eat();
	void sleep();
}

class Monkey {
	void jump() {
		System.out.println("Jumping monkey.");
	}
	void bite() {
		System.out.println("Biting monkey.");
	}
}

class Human extends Monkey implements BasicAnimal {
	// Method of Human:
	void speak() {
		System.out.println("Speaking human.");
	}
	
	@Override
	public void eat() {
		System.out.println("Eating animal.");
	}
	@Override
	public void sleep() {
		System.out.println("Sleeping animal.");
	}
}

// Q4:
abstract class Telephone {
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}

class SmartTelephone extends Telephone {
	// Method ofSmartTelephone:
	void st() {
		System.out.println("Method of SmartTelephone.");
	}
	
	@Override
	public void ring() {
		System.out.println("Ringing...");
	}
	@Override
	public void lift() {
		System.out.println("Lifting...");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnecting...");
	}
}

// Q6:
interface SmartTVRemote {
	void getNetflix();
}

interface TVRemote extends SmartTVRemote {
	void changeChannel();
}

// Q7:
class Tv implements TVRemote {
	@Override
	public void changeChannel() {
		System.out.println("Changing channel on TV.");
	}
	// we need to write getNetflix() because TVRemote inherits SmartTVRemote:
	@Override
	public void getNetflix() {
		System.out.println("Getting Netflix on SmartTV.");
	}
}

public class cwh_60_PracticeSet_ch11 {

	public static void main(String[] args) {
		
		// Question - 1 --> Create an abstract method Pen with methods write() and refill() as abstract methods.
		
		// Question - 2 --> Use the Pen class from Q1 to create a concrete class FountainPen with additional method changeNib().
		FountainPen fp = new FountainPen();
		fp.write();
		fp.refill();
		fp.changeNib();
		System.out.println();
		
		/* Question - 3 --> Create a class Monkey with jump() & bite() methods. Create a class Human which inherits this Monkey class and implements
							BasicAnimal interface with eat() & sleep() methods. */
		Human h = new Human();
		h.jump();
		h.bite();
		h.eat();
		h.sleep();
		System.out.println();
		
		/* Question - 4 --> Create a class Telephone with ring(), lift(), & disconnect() methods as abstract methods.
							Create another class SmartTelephone and demonstrate polymorphism. */
		Telephone t = new SmartTelephone();
		// t.st(); --> not allowed, because st() is method of SmartTelephone and 't' is an object of SmartTelephone & referred as Telephone. Thus POLYMORPHISM.
		System.out.println("Using polymorphism:");
		t.ring();
		t.lift();
		t.disconnect();
		System.out.println();
		
		// Question - 5 --> Demonstrate polymorphism using Monkey class from Q3.
		Monkey m = new Human();
		// m.speak(); // not allowed, because speak() is a method of Human and 'm' is an object of Human & referred as Monkey. Thus POLYMORPHISM.
		// m.eat(); // not allowed.
		// m.sleep(); // not allowed.
		System.out.println("Using polymorphism:");
		m.jump();
		m.bite();
		System.out.println();
		
		// Question - 6 --> Create an interface TVRemote and use it to inherit another interface SmartTVRemote.
		
		// Question - 7 --> Create a class Tv which implements TVRemote interface from Q6.
		Tv tv = new Tv();
		tv.changeChannel();
		tv.getNetflix();
		
	}

}
