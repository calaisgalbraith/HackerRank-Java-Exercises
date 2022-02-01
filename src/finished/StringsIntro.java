package finished;

import java.util.Scanner;

public class StringsIntro {

    //Take in two strings
    //return sum of lengths, if A is lexicographically greater than B, and capitalize first letter of each string and print on single line
    //print rest on separate lines
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        //print sum of lengths
        System.out.println(A.length() + B.length());


        System.out.println(B.compareTo(A));

        //if parameter passed to compareTo is lexicographically first, will return greater than 0
        if(B.compareTo(A) >= 0){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

        //capitalize first letter of each string
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(A + " " + B);
    }
}
