package finished;

import java.util.Scanner;

public class Substring {

    //print substring in inclusive range from int a to int b

    public static void substring(String sentence, int start, int end){
        System.out.println(sentence.substring(start, end));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        substring(S, start, end);
    }

}
