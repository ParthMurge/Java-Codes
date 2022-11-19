
import java.util.Scanner;
import java.lang.System;

class Eligibility {

    void Eligible(int a) {
        System.out.println("\n1. Male");
        System.out.println("2. Female");
        System.out.println("Enter your gender:");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if (x == 1) {
            System.out.println("\nEnter your age:");
            int age = s.nextInt();

            if (age > 0 && age < 18 || age > 35) {
                System.out.println("\nYou are eligible by gender but not by age");
            } else if (age <= 0) {
                System.out.println("\nInvalid entry.");
            } else {
                System.out.println("\nYou are eligible by both gender & age.");
            }
        }
        else if (x == 2) {
            System.out.println("\nEnter your age:");
            int age = s.nextInt();

            if (age > 0 && age < 18 || age > 35) {
                System.out.println("\nYou are not eligible by both gender & age.");
            } else if (age <= 0) {
                System.out.println("\nInvalid entry.");
            } else {
                System.out.println("\nYou are eligible by age but not by gender.");
            }
        } else {
            System.out.println("\nInvlaid entry.");
        }
    }
}

public class Eligibility_check {

	public static void main(String[] args) {
		while (true) {
            System.out.println("\n1. Check eligibility for scholarship.");
            System.out.println("2. Exit.");
            System.out.println("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            Eligibility el = new Eligibility();

            switch (a) {
                case 1:
                    el.Eligible(a);
                    break;

                case 2:
                	System.out.println("\nThank you for visiting.");
                    break;

                default:
                    System.out.println("\nInvalid entry.");
                    break;
            }
            if(a==1) {continue;}
            else if(a==2) {break;}
            else {System.out.println("\nInvalid entry."); continue;}
        }

	}

}
