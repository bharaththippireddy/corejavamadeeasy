package encapsulation;

public class Test {

	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.setId(123);
		patient.setName("Bharath");
		patient.setSsn("1234567890");

		System.out.println("Id: " + patient.getId());
		System.out.println("Name: " + patient.getName());
		System.out.println("SSN: " + patient.getSsn());
	}

}
