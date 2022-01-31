package finished;

import java.util.Scanner;

public class DataTypes {

    //Given an input integer, you must determine which primitive data types are capable of properly storing that input.
    //If there is more than one appropriate data type, print each one on its own line and order them by size
    //f the number cannot be stored in one of the four aforementioned primitives, print the line: n can't be fitted anywhere
    //To get you started, a portion of the solution is provided for you in the editor.

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                }
                //Complete the code
                if(x>=-32768 && x<=32767){ //check if short
                    System.out.println("* short");
                }
                if(x>=-2147483648 && x<=2147483647){ //check if int
                    System.out.println("* int");
                }
                if(x>=-Long.MIN_VALUE && x<=Long.MAX_VALUE){ //check if long
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }


}
