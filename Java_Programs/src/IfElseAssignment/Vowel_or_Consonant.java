package IfElseAssignment;

public class Vowel_or_Consonant {

	public static void main(String[] args) {
		char ch = 'x';

		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
		    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
		    System.out.println("Vowel");
		} else {
		    System.out.println("Consonant");
		}
	}

}
