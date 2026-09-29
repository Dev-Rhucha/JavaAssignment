package ClassObj;

public class studentSystem {

	public static void main(String[] args) {
		Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentid = 1;
        s1.name = "Rahul";
        s1.age = 20;
        s1.course = "Java";
        s1.marks = 85;

        s2.studentid = 2;
        s2.name = "Amit";
        s2.age = 21;
        s2.course = "Python";
        s2.marks = 90;

        s3.studentid = 3;
        s3.name = "Sneha";
        s3.age = 19;
        s3.course = "Testing";
        s3.marks = 88;

        s1.display();
        s2.display();
        s3.display();

	}

}
