package finished;

import java.util.Scanner;

public class IfElse {
    //Given an integer (n) perform the following conditional actions:
    //If n is odd, print Weird
    //If n is even and in the inclusive range of 2 to 5, print Not Weird
    //If n is even and in the inclusive range of 6 to 20 print Weird
    //If n is even and greater20  than print Not Weird
    //Complete the stub code provided in your editor to print whether or not is weird.

    private static final Scanner scanner = new Scanner(System.in);

    //method to check number
    public static void weirdNumber(int n){
        //check if number is odd
        if(n % 2 != 0){
            System.out.println("Weird");
        }
        else if(n >= 2 && n <= 5){ //else if n is between 2 and 5
            System.out.println("Not Weird");
        }
        else if (n >= 6 && n <= 20){ //else if n is between 6 and 20
            System.out.println("Weird");
        }
        else { //else (if even and greater than 20)
            System.out.println("Not Weird");
        }
    }

    //provided code
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        weirdNumber(N); //call method with input

    }


}
