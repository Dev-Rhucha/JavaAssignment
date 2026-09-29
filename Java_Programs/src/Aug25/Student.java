package Aug25;

public class Student {
	int id;
	String name;
	String course;
	double per;

	void register(int Id, String sname, String scourse, double sper) {
		id = Id;
		name = sname;
		course = scourse;
		per = sper;
	}

	void display() {
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Percentage : " + per);
	}

	void UpdateName(String sname) {
		name = sname;
		System.out.println("name updated Sucessfully"+": "+name);
	}

	void updateCourse(String scourse) {
		course = scourse;
		System.out.println("course updated Sucessfully"+": "+course);
	}

	void updatePer(double sper) {
		if (sper >= 0 && sper <= 100) {
			per = sper;
			System.out.println("Percentage updated Sucessfully"+": "+per);
		} else {
			System.out.println("Invalid Percentage");
		}
	}
}
