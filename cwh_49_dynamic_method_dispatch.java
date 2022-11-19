package company;

class Phone {
	
	public void showTime() {
		System.out.println("Time is 9am");
	}
	public void on() {
		System.out.println("Turning on the Phone");
	}
}

class SmartPhone extends Phone {
	
	public void music() {
		System.out.println("Playing music");
	}
	@Override
	public void on() {
		System.out.println("Turning on the SmartPhone");
	}
}
public class cwh_49_dynamic_method_dispatch {

	public static void main(String[] args) {
		
		// Phone ph = new Phone();    Allowed
		// SmartPhone sm = new SmartPhone();    Allowed
		
		Phone obj = new SmartPhone(); // This is also allowed.
		// SmartPhone obj2 = new Phone();   not allowed.
		
		obj.showTime();
		obj.on(); // this will call the overridden method in the SmartPhone.
		// obj.music(); not allowed.
		
		// in line number 30, because of " new" keyword, the object is created in runtime.
	}
}
