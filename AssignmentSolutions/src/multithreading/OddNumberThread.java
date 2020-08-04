package multithreading;

public class OddNumberThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}
	}

}
