package Aug25;

public class StudentSystem {

	public static void main(String[] args) {
		
		Student s1 = new Student();

		s1.register(1, "abc", "Java", 75);
		s1.display();

		s1.UpdateName("abcd");
		s1.updateCourse("Testing");
		s1.updatePer(85);

		System.out.println("---------------------------------------------");

		Student s2 = new Student();

		s2.register(2, "xyz", "Python", 65);
		s2.display();

		s2.UpdateName("xyp");
		s2.updateCourse("Java");
		s2.updatePer(110);

	}

}
