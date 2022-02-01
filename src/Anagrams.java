import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    //return boolean if a and b are case-insensitive anagrams (true if yes, false if no)

    public static boolean isAnagram(String a, String b){

        //convert to char arrays so can alphabetically sort strings
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();





        //works but can't import array in hackerrank, so did alterantive method
//        //sort char arrays
//        Arrays.sort(first);
//        Arrays.sort(second);
//

        //compare first to second, if equal to each other then return yes, else return no
        return Arrays.toString(first).equals(Arrays.toString(second));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }



}
