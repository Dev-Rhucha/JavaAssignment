package aug26;

public class Doctor {
	int id;
	String name;
	String specialization;
	double salary;

	public Doctor() {
	}

	Doctor(int id, String name, String specialization, double salary) {

		System.out.println("Welcome to hospital app");

		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.salary = salary;

		System.out.println(name + " >> doctor registered successfully");
	}

	void checkPatient() {
		System.out.println("Patient checked");
	}

	void prescribeMedicine() {
		System.out.println("Medicine prescribed");
	}
}
