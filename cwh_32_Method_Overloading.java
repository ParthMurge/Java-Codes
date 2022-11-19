package company;

public class cwh_32_Method_Overloading
{

	static void foo()
	{
        System.out.println("\nGood Morning...");
    }

    static void foo(int a)
    {
        System.out.println("\nGood Morning "+ a);
    }

    static void foo(int a, int b)
    {
        System.out.println("\nGood Morning "+ a + " and " +b+ "\n");
    }

    public static void main(String[] args)
    {
        /* Method Overloading: Methods with same name and different parameters can be overloaded, 
        but not with same name and different return-type.*/
        foo();
        foo(3000);
        foo(3000, 3000);
    }

}
