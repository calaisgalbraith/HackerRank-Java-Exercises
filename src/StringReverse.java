import java.util.Scanner;

public class StringReverse {

    //print yes if string is palindrome, print no otherwise

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        //placeholder for string builder to reverse string
        StringBuilder reversed = new StringBuilder();
        reversed.append(A);

        //reverse string
        reversed.reverse();

        //compare if reversed is same as string
        if(reversed.toString().equals(A)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

}
