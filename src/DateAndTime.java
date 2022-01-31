import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateAndTime {

    //The function is expected to return a STRING: the day of the week of input date in all caps
    // The function accepts following parameters:
    // INTEGER month
    // INTEGER day
    // INTEGER year

    public static String findDay(int month, int day, int year) {

        String formattedDate = "";

        //see if month or day are less than 10, if so add leading zeros to string formatted date
        if(month < 10 && day < 10){//if both, add leading zeros to both
            formattedDate = year + "-0" + month + "-0" + day;
        }
        else if(month < 10){ //if just month, add leading zero to month
            formattedDate = year + "-0" + month + "-" + day;
        }
        else if(day < 10){ //if jsut date, add leading zero to day
            formattedDate = year + "-" + month + "-0" + day;
        }
        else { //else parse as is
            formattedDate = year + "-" + month + "-" + day;
        }

        //convert String date to local date
        LocalDate date = LocalDate.parse(formattedDate);

        //create new locale
        Locale locale = new Locale("EN", "US");

        //extract day of week from date
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        //return text of day of week in all caps
        return dayOfWeek.getDisplayName(TextStyle.FULL, locale).toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println(findDay(8, 5, 2015));
    }



}
