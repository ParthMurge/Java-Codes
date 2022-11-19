package company;

public class cwh_33_varargs
{
	// static int sum(int a, int b)
	// {
    //     return a+b;
    // }

    // static int sum(int a, int b, int c)
	// {
    //     return a+b+c;
    // }

    // static int sum(int a, int b, int c, int d)
	// {
    //     return a+b+c+d;
    // }

    static int sum(int ...arr)
    {
        int result = 0;
        for(int a : arr)
        {
            result += a;
        }
        return result;
    }
    // static void sum(int a, int ...arr) --> This can be used when one argument is compulsory and so on.

    public static void main(String[] args)
    {

        System.out.println("\nThe sum of nothing is = " +sum());
        System.out.println("\nThe sum of 2 and 3 is = " +sum(2, 3));
        System.out.println("\nThe sum of 2, 3, and 4 is = " +sum(2, 3, 4));
        System.out.println("\nThe sum of 2, 3, 4, and 5 is = " +sum(2, 3, 4, 5));
        System.out.println("\nThe sum of 2, 3, 4, 5, and 6 is = " +sum(2, 3, 4, 5, 6)+ "\n");
    }

}
