package finished;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimalityTest {

    //use Java BigInteger class's isProbablePrimeNumber
    //return if number is prime or not

    public static void isPrime(String n){

        //convert n to bigInteger
        BigInteger numb = new BigInteger(n);

        //check if is prime with certainty of one
        if(numb.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        isPrime(n);

    }



}
