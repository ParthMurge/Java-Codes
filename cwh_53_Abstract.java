package company;

abstract class Parent
{
	public Parent()
	{
		System.out.println("I am a Parent class constructor.");
	}
	
	abstract public void greet();
	abstract public void greet2();
}

class Child extends Parent
{
	@Override
	public void greet()
	{
		System.out.println("Good Morning..");
	}
	@Override
	public void greet2()
	{
		System.out.println("Good Afternoon..");
	}
}

abstract class Child2 extends Parent
{
	public void joBhi()
	{
		System.out.println("Kuch bhi..");
	}
}

public class cwh_53_Abstract {

	public static void main(String[] args)
	{
		// Parent p = new Parent();  --error
		Child c = new Child();
		// Child2 c = new Child2();  --error
		
		/* -Abstract in English means :- existing only in thought or as an idea without concrete existence.
		   -Abstract Method :- a method that is declared without an implementation.
		    Ex :   abstract public void moveTo(double x, double y);
		   -Abstract Class :- If a class includes abstract methods, then the class itself must be declared abstract.
		    When an abstract class is sub-classed, the subclass usually provides implementations for all of the methods in parent class.
		    If it doesn't, it must be declared abstract.
		   -Note : It is possible to create reference of an abstract class. But it is not possible to create an object of an abstract class.
		*/
	}

}
