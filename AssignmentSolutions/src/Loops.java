public class Loops {

	public static void main(String[] args) {
		int n = 150; // You can improvise this to use command line arguments or
						// java.util.Scanner later on to get input from the
						// user.

		// For Loop

		for (int i = 1; i <= n; i++) {
			if (i % 10 == 0) {
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i);
		}

		// While Loop

		int i = 1;
		while (i <= n) {
			if (i % 10 == 0) {
				i++;
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i++);
		}

		// do-while
		i = 1;

		do {
			if (i % 10 == 0) {
				i++;
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i++);
		} while (i <= n);
	}

}
