package aug26;

public class DocterrMain {

	public static void main(String[] args) {
		Doctor d1 = new Doctor(101, "Amit", "Cardiologist", 90000.00);

		d1.checkPatient();
		d1.prescribeMedicine();

		Doctor ddoctor = new Doctor();
		ddoctor.id = 11;

	}

}
