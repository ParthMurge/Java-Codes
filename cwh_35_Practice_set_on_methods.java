package company;

public class cwh_35_Practice_set_on_methods
{
	// Q1:
    static void table(int x){
        for(int i=1; i<=10; i++){
            System.out.println(x+ " x " +i+ " = " +x*i);
        }
    }
    
    // Q2:
    static void pattern(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q3:
    static int sumNatural(int x){
        if(x==1){
            return 1;
        }
        return x + sumNatural(x-1);
    }

    // Q4:
    static void pattern2()
    {
        int n=4;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print("* ");
            }
            n--;
            System.out.println();
        }
    }

    // Q5:
    static int fibNth(int a)
    {
        // if(a==1){
        //     return 0;
        // }
        // else if(a==2){
        //     return 1;
        // }
        //         OR
        if(a==1 || a==2)
        {
            return a-1;
        }  // In short for the above if-else.
        else
        {
            return fibNth(a-1)+fibNth(a-2);
        }
    }

    // Q6:
    static int sumOfArguments(int ...s)
    {
        int sum=0;
        for(int e: s)
        {
            sum += e;
        }
        return sum;
    }

    // Q7:
    static void pattern2_rec(int d)
    {
        if(d>0)
        {
            for(int i=1; i<=d; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
            pattern2_rec(d-1);
        }
    }

    // Q8:
    static void pattern_rec(int d)
    {
        if(d>0)
        {
            pattern_rec(d-1);
            for(int i=1; i<=d; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q9:
    static float temp(int y)
    {
        return (((y*9/5f)+32));
    }

    // Q10:
    static int sumNaturalIterative(int h)
    {
        int sum = 0;
        for(int i=0; i<=h; i++)
        {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args)
    {

        // Question - 1 --> multiplication table of n using methods.
        int n = 5;
        System.out.println("\nThe multiplication table of " +n+  " is :");
        table(n);

        /* Question - 2 --> WAP to print the pattern:
        *
        * *
        * * *
        * * * *      */

        System.out.println("\nStar pattern using iteration:");
        pattern();

        // Question - 3 --> Write a recursive function to calculate the sum of first n natural numbers.
        int x = 5;
        System.out.println("\nThe sum of first " +x+ " natural numbers using recursion is = " +sumNatural(x));

        /* Question - 4 --> Function to print the following pattern:
        * * * *
        * * *
        * *
        *       */
        System.out.println("\nStar pattern using iteration:");
        pattern2();

        // Question - 5 --> Function to print n'th term of fibbonacci series using recursion.
        int n1=5;
        System.out.println("\nThe " +n1+ "th term of fibbonacci series is = " +fibNth(n1));

        // Question - 6 --> Function to find the average of the set of numbers passed as arguments.
        int [] arr = {10, 200, 30, 4, 5, 6};
        System.out.println("\nThe sum of the array is = " +sumOfArguments(arr));

        // Question - 7 --> Repeat Q4 using recursion.
        int b1=4;
        System.out.println("\nStar pattern using recursion:");
        pattern2_rec(b1);

        // Question - 8 --> Repeat Q2 using recursion.
        int b=4;
        System.out.println("\nStar pattern using recursion:");
        pattern_rec(b);

        // Question - 9 --> Function to convert temp from degree celsius to fahrenheit.
        int u=51;
        System.out.println("\n" +u+ " degree C = " +temp(u)+ " degree F");

        // Question - 10 --> Repeat Q3 using iterative approach.
        int r=5;
        System.out.println("\nThe sum of first " +r+ " natural numbers using iterative approach is = " +sumNaturalIterative(r)+ "\n");
        
    }
}
