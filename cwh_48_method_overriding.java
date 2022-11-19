package company;

class A
{
	
	public int harry()
	{
		return 4;
	}
	
	public void meth2()
	{
		System.out.println("This is method 2 of class A");
	}
}

class B extends A
{
	
	@Override  // this annotates that the method below is overridden. And it is a valid Java code.
			   // It is not must to write this annotation, but for our own convenience.
	public void meth2()
	{
		System.out.println("This is method 2 of class B");
	}
	
	public void meth3()
	{
		System.out.println("This is method 3 of class B");
	}
}

public class cwh_48_method_overriding
{

	public static void main(String[] args)
	{
		A a = new A();
		a.meth2();
		
		B b = new B();
		b.meth2();
		
		/*  Method Overriding --> If a child class implements the same method present in the parent class again, it is known as Method Overriding.
		 * 						  (redefining a method of super-class in sub-class)
		 *  -When an object of subclass is created and the overridden method is called, the method which has been implemented in the sub-class is called & its code is executed.
		 *  -The method that is to be overridden in the child class must have its implementation same as the method in the parent class, like their
		 *   access modifiers, return data-type , arguments etc.
		 */

	}

}
