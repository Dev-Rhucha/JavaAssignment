package july31_Java;

public class MaxOf3Numbers {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=40;

        if (a > b && a>c) {
            System.out.println(a + " is Max");
        } else if (b > a && b>c) {
            System.out.println(b + " is max");
        } else {
            System.out.println(c+"is max");
        }

	}

}
