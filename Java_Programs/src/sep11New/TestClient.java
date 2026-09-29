package sep11New;

public class TestClient {

	public static void main(String[] args) {

		Student students[] = new Student[5];

		Address address1 = new Address("pune", "410583");
		Address address2 = new Address("Kolhapur", "416007");
		Address address3 = new Address("pune", "415004");
		Address address4 = new Address("Mumbai", "235678");
		Address address5 = new Address("Kolhapur", "416008");

		Student stu1 = new Student(35, "rhucha", address1);
		Student stu2 = new Student(39, "Neha", address2);
		Student stu3 = new Student(32, "abc", address3);
		Student stu4 = new Student(35, "xyz", address4);
		Student stu5 = new Student(36, "abc", address5);
		students[0] = stu1;
		students[1] = stu2;
		students[2] = stu3;
		students[3] = stu4;
		students[4] = stu5;

		float sum = 0;

		int maxage = students[0].age;

		for (Student student : students) {
			System.out.println(student);
			if (student.address.cityname.equals("pune")) {
				System.out.println("Student from Pune: " + student.name);

				sum = sum + student.age;

			}

			if (student.age > maxage) {
				maxage = student.age;
			}

		}

		System.out.println(sum / 2);
		System.out.println(maxage);
		for(int i = 0; i < students.length; i++)
		{
		    int count = 0;

		    for(int j = 0; j < students.length; j++)
		    {
		        if(students[i].name.equals(students[j].name))
		        {
		            count++;
		        }
		    }

		    if(count > 1)
		    {
		        boolean alreadyPrinted = false;

		        for(int k = 0; k < i; k++)
		        {
		            if(students[i].name.equals(students[k].name))
		            {
		                alreadyPrinted = true;
		            }
		        }

		        if(!alreadyPrinted)
		        {
		            System.out.println("Duplicate name: " + students[i].name);
		        }
	

	}

}
	}
}
