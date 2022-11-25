package company;

class MyThreadRunnable1 implements Runnable {
	@Override
	public void run() {
		int i=0;
		while(i<400) {
			System.out.println("My thread 111");
			i++;
		}
	}
}

class MyThreadRunnable2 implements Runnable {
	@Override
	public void run() {
		int i=0;
		while(i<400) {
			System.out.println("My thread 222");
			i++;
		}
	}
}

public class cwh_71_Runnable_Multithreading {

	public static void main(String[] args) {
		
		// Multi-threading implementing java.lang.Runnable.run();
		
		MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
		Thread gun1 = new Thread(bullet1);
		
		MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
		Thread gun2 = new Thread(bullet2);  // Thread(Runnable r);
		
		gun1.start();
		gun2.start();
	}

}
