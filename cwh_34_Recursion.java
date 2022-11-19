package company;

public class cwh_34_Recursion
{
	// Recursion:
    static int factorial_recursive(int a)
    {
        if (a==0 || a==1)
        {
            return 1;
        } else
        {
            return a*factorial_recursive(a-1);
        }
    }

    // Iterative:
    static int factorial_iterative(int x)
    {
        int fact=1;
        for(int i=1; i<=x; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args)
    {

        System.out.println("\nThe factorial of 4 is = " +factorial_recursive(4));
        System.out.println("The factorial of 5 is = " +factorial_iterative(5)+ "\n");

    }
}
