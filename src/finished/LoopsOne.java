package finished;

import java.io.*;

public class LoopsOne {

    //Given an integer (n) print its first 10 multiples. Each multiple (N x i) should be printed on a new line in the form: N x i = result.

    public static void printMultiples(int n){

        //while i is less than 10, print
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        printMultiples(N);
    }
}
