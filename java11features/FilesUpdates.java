package java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class FilesUpdates {

	public static void main(String[] args) throws IOException {

		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 is cool");
		System.out.println(path);
		String str = Files.readString(path);
		System.out.println(str);

	}

}
