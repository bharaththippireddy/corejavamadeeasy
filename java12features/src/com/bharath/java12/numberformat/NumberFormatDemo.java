package com.bharath.java12.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));
		format = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		System.out.println(format.format(1000));
		System.out.println(format.format(1000000));

		
	}

}
