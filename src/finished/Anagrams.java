package finished;

import java.util.Scanner;

public class Anagrams {
    //return boolean if a and b are case-insensitive anagrams (true if yes, false if no)

    public static boolean isAnagram(String a, String b){

        //convert to char arrays so can alphabetically sort strings
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toCharArray();

        //sort char arrays
        java.util.Arrays.sort(first);
        java.util.Arrays.sort(second);

        //compare first to second, if equal to each other then return yes, else return no
        return java.util.Arrays.toString(first).equals(java.util.Arrays.toString(second));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "finished.Anagrams" : "Not finished.Anagrams" );
    }



}
