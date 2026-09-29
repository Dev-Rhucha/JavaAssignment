package StaticKeyword;

public class Static_Nonstatic_Copies {

	static String BankName = "xyz";
	int age = 23;
	
	void display()
	{
		System.out.println(age);
		System.out.println(BankName);
	}

	public static void main(String[] args) {
		Static_Nonstatic_Copies s1=new Static_Nonstatic_Copies();
		s1.age=45;
		s1.display();
		
		
		Static_Nonstatic_Copies s2=new Static_Nonstatic_Copies();
            s2.age =67;
            System.out.println(s2.age);
            System.out.println(BankName);
		
	}

}
