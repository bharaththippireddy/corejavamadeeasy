package java11features;

import java.util.Optional;

public class OptionalUpdates {

	public static void main(String[] args) {

		Optional<String> str = Optional.of("test");
		System.out.println(str.isEmpty());
	}

}
