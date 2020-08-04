package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new MyThreadException();
		}
	}

}
