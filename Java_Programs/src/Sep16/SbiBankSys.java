package Sep16;

public class SbiBankSys {

	public static void main(String[] args) {

		Account ac1 = new Account(121, "nayan", 20000.00);
		ac1.setAccno(122);
		int accn = ac1.getAccno();
		System.out.println(accn);

		ac1.setBalance(250000.0);

		double bal = ac1.getBalance();
		System.out.println(bal);
		
		ac1.setName("xyz");
		String cname=ac1.getName();
		System.out.println(cname);

	}

}
