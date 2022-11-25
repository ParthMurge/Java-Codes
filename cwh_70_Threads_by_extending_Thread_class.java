package company;

class MyThread1 extends Thread {
	@Override
	public void run() {
		int i=0;
		while(i < 400) {
			System.out.println("Thread for cooking");
			System.out.println("I am happy.");
			i++;
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		int i=0;
		while(i < 400) {
			System.out.println("This thread for dancing");
			System.out.println("I am enjoying.");
			i++;
		}
	}
}

public class cwh_70_Threads_by_extending_Thread_class {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.start();
		t2.start();
	}

}
