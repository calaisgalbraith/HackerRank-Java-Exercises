package finished;

import java.util.Scanner;

public class SubstringComparisons {
    //given a string, find the lexicographically smallest and largest substrings of length k

    public static String getSmallestAndLargest(String s, int k) {
        //create string array with substrings of length k
        java.util.List<String> substrings = new java.util.ArrayList<>();

        //populate array with substrings of length k (to avoid out of bounds err, go until length - k + 1)
        for(int i = 0; i < s.length() - k + 1; i++){
            substrings.add(s.substring(i, k + i)); //add substring to arraylist
        }

        //sort array list
        java.util.Collections.sort(substrings);

        System.out.println(substrings.toString());

        //get first and last index (largest and smallest)
        String smallest = substrings.get(0);
        String largest = substrings.get(substrings.size() - 1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
