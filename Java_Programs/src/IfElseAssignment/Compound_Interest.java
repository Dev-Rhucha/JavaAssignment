package IfElseAssignment;

public class Compound_Interest {

	public static void main(String[] args) {
	
		double p = 10000;
		double r = 10;
		double t = 2;

		double amount = p * Math.pow((1 + r / 100), t);
		double ci = amount - p;

		System.out.println("Compound Interest = " + ci);
	}

}
