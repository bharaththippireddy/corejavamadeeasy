package collectionswithgenerics;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		String s[] = {"V","A","Z","P"};
		int result = Arrays.binarySearch(s, "Z");
		System.out.println("Z is found at index "+result); //Index starts from zero

	}

}
