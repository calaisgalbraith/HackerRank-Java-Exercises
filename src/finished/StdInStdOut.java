package finished;

import java.util.Scanner;

public class StdInStdOut {

    //1
    //In this challenge, you must read  integers from stdin and then print them to stdout.
    // Each integer must be printed on a new line.
    // To make the problem a little easier, a portion of the code is provided for you in the editor below.

    //2
    //In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the
    // instructions in the Output Format section below.
    // To make the problem a little easier, a portion of the code is provided for you in the editor.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1
            int a = scan.nextInt();
            // Complete this line
            int b = scan.nextInt();
            // Complete this line
            int c = scan.nextInt();

            System.out.println(a);
            // Complete this line
            System.out.println(b);
            // Complete this line
            System.out.println(c);

        //2
        int i = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
