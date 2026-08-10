package IfElseAssignment;

public class Convert_Days {

	public static void main(String[] args) {
		
		int days = 800;

		int years = days / 365;
		days = days % 365;

		int weeks = days / 7;
		days = days % 7;

		System.out.println("Years = " + years);
		System.out.println("Weeks = " + weeks);
		System.out.println("Days = " + days);

	}

}
