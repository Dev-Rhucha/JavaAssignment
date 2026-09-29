package LoopsInJava;

public class stringPractice {

	public static void main(String[] args) {

		String s1 = new String("Welcome to java");
		String s2 = new String("Welcome to c");

		String s3 = s1.concat(s2);
		System.out.println(s3);

		boolean s = s2.equals(s1);
		System.out.println(s);

		boolean bb = s1.contains("to");
		System.out.println(bb);

		// s2.re
		String s4 = s2.replace("to", "too");
		System.out.println(s4);

		char ch = s1.charAt(6);
		System.out.println(ch);

		boolean res = s4.equalsIgnoreCase(s2);
		System.out.println(res);

		byte[] arr = s2.getBytes();
		System.out.println(arr);

		int l = s1.length();
		System.out.println(l);

		int i = s1.lastIndexOf(s3);
		System.out.println(i);

		boolean k = s1.isEmpty();
		System.out.println(k);

		boolean d = s2.isBlank();
		System.out.println(d);
		
		String ss=s4.trim();
		System.out.println(ss);
		
		String s5=s3.toUpperCase();
		System.out.println(s5);
		
		char[]a1=s3.toCharArray();
		System.out.println(a1);
		
		String s7=s3.substring(3, 5);
		System.out.println(s7);
		
		
	
		
		

	}

}
