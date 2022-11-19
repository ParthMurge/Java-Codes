package company;

class Base
{
    int x;

    void setX(int p)
    {
        System.out.println("\nI am in Base setting x.");
        x = p;
    }
    int getX()
    {
        return x;
    }
}

class Derived extends Base
{
    int y;

    void setY(int p)
    {
        System.out.println("\nI am in Derived setting y.");
        y = p;
    }
    int getY()
    {
        return y;
    }
}

public class cwh_45_Inheritance
{

	public static void main(String[] args)
	{
		/*  -Inheritance is used to borrow properties & methods from an existing class.
        	-Inheritance in Java is declared using keyword "extends".
        	-When a class inherits from a superclass, it inherits parts of superclass' methods and fields.
        	 It cannot inherit some parts of super-class methods & fields, due to access modifiers.
        	-Java doesn't support multiple inheritance, i.e. two classes cannot be super-classes for a sub-class  */

     Base b = new Base();
     b.setX(4);
     System.out.println(b.getX());

     Derived d = new Derived();
     d.setX(5);
     System.out.println(d.getX());

	}
}
