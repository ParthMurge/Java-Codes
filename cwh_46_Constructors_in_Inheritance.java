package company;

class Base1
{
    Base1()
    {
        System.out.println("\nI am a Base class constructor.");
    }
    Base1(int  c)
    {
        System.out.println("\nI am an overloaded Base class constructor with value of x as: " +c);
    }
}

class Derived1 extends Base1
{

    Derived1()
    {
        // super(3);
        System.out.println("I am a Derived class constructor.");
    }
    Derived1(int x, int y)
    {
        super(x);
        System.out.println("I am an overloaded Derived class constructor with value of y as: " +y);
    }
}

class ChildOfDerived extends Derived1
{

    ChildOfDerived()
    {
        // super(3);
        System.out.println("I am a child of Derived class constructor.");
    }
    ChildOfDerived(int x, int y, int z)
    {
        super(x, y);
        System.out.println("I am an overloaded child of Derived class constructor with value of z as: " +z);
    }
}

public class cwh_46_Constructors_in_Inheritance
{

	public static void main(String[] args)
	{
		/*  -When a Derived class is extended from the Base class, the constructor of the Base class is executed first
         *  followed by the constructor of the Derived class.
         *  -When there are multiple constructors in the parent class, the constructor without any parameters is called
         *  from the child class.
         *  -If we want to call the constructor with parameters form the parent class, we can use keyword "super".  */

        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(9, 69);
        ChildOfDerived cd = new ChildOfDerived(12, 19, 25);
	}
}
