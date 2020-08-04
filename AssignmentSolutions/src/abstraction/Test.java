package abstraction;

public class Test {

	public static void main(String[] args) {
		TouchScreenLaptop hp = new HPNoteBook();
		hp.click();
		hp.scroll();

		TouchScreenLaptop dell = new DellNoteBook();
		dell.click();
		dell.scroll();

	}

}
