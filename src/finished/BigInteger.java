package finished;

import java.util.Scanner;

public class BigInteger {

    //Output two lines.
    // The first line should contain a +b  and the second line should contain a * b
    // Don't print any leading zeros.
    // a and b are non-negative integers and can have maximum 200 digits.
    //use java bigint


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.math.BigInteger a = scanner.nextBigInteger();
        java.math.BigInteger b = scanner.nextBigInteger();
        scanner.close();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
