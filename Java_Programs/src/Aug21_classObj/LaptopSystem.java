package Aug21_classObj;

public class LaptopSystem {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.Info("Asus","abc", 16, 512, 50000,"black");
		l1.display();
		
		//Laptop l2=new Laptop();
		l1.Info("HP","xyz", 16, 256, 90000,"white");
		l1.display();

	}

}
