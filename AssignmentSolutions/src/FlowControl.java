public class FlowControl {

	public static void main(String[] args) {
		int maths = 75;
		int physics = 99;
		int chemistry = 80;

		int average = maths + physics + chemistry;

		if (maths < 35 || physics < 35 || chemistry < 35) {
			System.out.println("Result is FAIL");
		} else if (average <= 59) {
			System.out.println("Grade C");
		} else if (average <= 69) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade A");
		}

	}
}
