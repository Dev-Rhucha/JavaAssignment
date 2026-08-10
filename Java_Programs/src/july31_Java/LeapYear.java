package july31_Java;

public class LeapYear {

	public static void main(String[] args) {
		
		
		int year = 1700;

        if ( (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

	}

}
//year % 400 == 0) ||