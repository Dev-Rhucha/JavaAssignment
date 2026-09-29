package Aug21_classObj;

public class Customer {

	int cid;
	String name;
	String mob;
	String email;
	String username;
	String password;

	void register(int cid, String name, String mob, String email, String username, String password) {

		this.cid=cid;
		this.name=name;
		this.mob=mob;
		this.email=email;
		this.username=username;
		this.password=password;
		
	}
	
	void display()
	{
		System.out.println("id of customer is "+ cid);
		System.out.println("name of customer is "+ name);
		System.out.println("mobNo of customer is "+ mob);
		System.out.println("email of customer is "+ email);
		System.out.println("username of customer is "+ username);
		System.out.println("password of customer is "+ password);
	

	}

}
