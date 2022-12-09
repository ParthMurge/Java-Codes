package company;

public class EqualsMethod {

	public static void main(String[] args) {

		/* There are two ways of creating a String:
		 * 1. String literal
		 * 2. Using new keyword
		 */
		
		// 1. Using new keyword:
		String string1 = new String("Hello");
		String string2 = new String("Hello");
		
		// (string1 == string2) will not work here, because we used "new" keyword which creates an object.
		if(string1.equals(string2)) {
			System.out.println("Both the strings are equal.");
		}
		else {
			System.out.println("Both the strings are not equal.");
		}
		
		// 2. String literal:
		String string3 = "Hello";
		String string4 = "Hello";
		
		// As there is no "new" keyword in creating both the string variables, the bellow condition will compare the literals(letter by letter).
		// There is no need to write equals() method.
		if(string3 == string4) {
			System.out.println("Both the strings are equal.");
		}
		else {
			System.out.println("Both the strings are not equal.");
		}
		
	}

}
