package company;

interface SampleInterface {
	void meth1();
	void meth2();
}

// An interface can extend another interface.
interface ChildSampleInterface extends SampleInterface {
	void meth3();
	void meth4();
}

class SampleClass implements ChildSampleInterface {
	
	public void meth1() {
		System.out.println("Meth 1");
	}
	public void meth2() {
		System.out.println("Meth 2");
	}
	public void meth3() {
		System.out.println("Meth 3");
	}
	public void meth4() {
		System.out.println("Meth 4");
	}
}

public class cwh_58_Inheritanc_in_Interfaces {

	public static void main(String[] args) {
		
		SampleClass sc = new SampleClass();
		sc.meth1();
		sc.meth2();
		sc.meth3();
		sc.meth4();
	}

}
