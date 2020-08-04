package arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		String[] courses = { "Java Web Services", "Spring Data REST", "Hibernate", "Spring in easy steps" };
		for (int i = courses.length-1; i >= 0; i--) {
			System.out.println(courses[i]);
		}
	}

}
