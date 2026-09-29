package StaticKeyword;

public class StaticVariable {
	static int i=0;
	
	static int j=34;
	
	int age=34;
	
	public static void display()
	{
		System.out.println(i);
//		System.out.println(age);
		//StaticVariable s=new StaticVariable();
		//s.nonstatic();
	
	}
	
	public void nonstatic()
	{
		System.out.println(age);
		System.out.println(i);
		display();
		yes();
		
	}
	
	void yes()
	{
		nonstatic();
	}

	public static void main(String[] args) {
	
		display();
		System.out.println(i);
		i=39;
		System.out.println(i);
		
		StaticVariable s=new StaticVariable();
		StaticVariable s1=new StaticVariable();

		s.i=56;
		
		//StaticVariable.nonstatic(); not possible 
		s.nonstatic();
		s.age=46;// non static age is accessed in static by creating object 
		//System.out.println(age);
		
		StaticVariable.j=34;
	
		 
		

	}

}
