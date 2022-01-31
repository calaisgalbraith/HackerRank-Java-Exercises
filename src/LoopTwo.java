//You are given q queries in the form of a, b,and n.
// For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.

import java.util.Scanner;

public class LoopTwo {

    public static void loop(int a, int b, int c){






    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            loop(a, b, n);
        }
        in.close();
    }


}
