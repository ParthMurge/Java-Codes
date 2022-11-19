package company;

class EkClass
{
	int a;
	int getA() {
		return a;
	}
	
	EkClass(int a) {
		this.a = a;  // "this" is a way for us to refer an object of the class which is being created/referenced.
		
	}
	
	public int meth(int a) {
		return a;
	}
}

class DoClass extends EkClass {
	
	DoClass(int a) {
		super(a);
		/* super --> a reference variable used to refer immediate parent class object.
		 *           - can be used to refer immediate parent class instance variable.
		 *           - can be used to invoke parent class methods.
		 *           - can be used to invoke parent class constructor.
		 */
		System.out.println("I am a constructor.");
	}
}
public class cwh_47_this_super {

	public static void main(String[] args) {
		
		EkClass e = new EkClass(6);
		DoClass d = new DoClass(45);
		System.out.println(e.getA());

	}

}
