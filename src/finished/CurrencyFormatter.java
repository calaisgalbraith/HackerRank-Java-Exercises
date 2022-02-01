package finished;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    //given double-precision number (payment), use NumberFormat class getCurrencyInstance to convert it to US, Indian, Chinese & French currency
    //print out values

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        //get locale and numberFormatter for us, india, china and france
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); //India not in default locale, so create it
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        //format and print out payment
        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + chinaFormat.format(payment));
        System.out.println("France: " + franceFormat.format(payment));
    }


}
