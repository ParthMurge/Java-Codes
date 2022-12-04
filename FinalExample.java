package company;

/*
 * If we write class Animal as final, it cannot be extended
 * final class Animal
 */
class Animal {
	private String name;
	private String colour;
	
	/* If  we write eat() method as final, it cannot be overridden.
	 * public final void eat()
	 */
	public void eat() {
		System.out.println("munch munch munch");
	}
	
	public void setClour(String colour) {
		this.colour = colour;
	}
	public String getClour() {
		return colour;
	}
}

class Dog extends Animal {
	
	@Override
	 public void eat() {
		System.out.println("nom nom nom " +FinalExample.PI);
	}
	public void bark() {
		System.out.println("woof woof woof");
	}
}

public class FinalExample {

	public static final double PI = 3.14159;
	public static void main(String[] args) {

		/* If we write the object below as final, it cannot be created multiple times.
		 * final Dog myDog;
		 * myDog = new Dog();
		 */
		final Dog myDog;
		myDog = new Dog();
		// myDog = new Dog(); --> not allowed, as it has been declared final.
		myDog.eat();

		// If a constant is initiated final, it cannot be changed.
		final int a = 9;
		// a = 4; --> not allowed, as it has been initiated final.
	}

}
