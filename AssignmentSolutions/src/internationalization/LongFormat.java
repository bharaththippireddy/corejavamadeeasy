package internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class LongFormat {

	public static void main(String[] args) {
		long l = 123;
		NumberFormat usFormat = NumberFormat.getInstance(Locale.US);
		System.out.println(usFormat.format(l));
		NumberFormat ukFormat = NumberFormat.getInstance(Locale.UK);
		System.out.println(ukFormat.format(l));

		//Extras - not in the scope of the assignment but for a quick demo on formatting
		Double d = 12312312.3434;
		System.out.println(usFormat.format(d));
		System.out.println(ukFormat.format(d));

	}

}
