package multithreading;

public class Test {

	public static void main(String[] args) {
		EventNumberThread ent = new EventNumberThread();
		Thread t1 = new Thread(ent);
		t1.start();

		OddNumberThread ont = new OddNumberThread();
		Thread t2 = new Thread(ont);
		t2.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
