package LoopsInJava;
public class PairSum {

    static void calculate(int a, int b) {

        int sum = a + b;
        int square = sum * sum;

        System.out.println("Sum of " + a + " & " + b + " is : " + sum
                + " ... Square is : " + square);
    }

    public static void main(stringPractice[] args) {

        calculate(10, 5);
        calculate(3, 4);
        calculate(22, 33);
    }
}