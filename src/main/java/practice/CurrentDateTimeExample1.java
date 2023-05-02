package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class CurrentDateTimeExample1 {
    public static void main(String[] args){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MMM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


    //  Calendar class can be used to get the instance of Date class.
    //  The getTime() method of Calendar class returns the instance of java.util.Date.
    //  The Calendar.getInstance() method returns the instance of Calendar class
        Date date = java.util.Calendar.getInstance().getTime();
        System.out.println(date);

    }
}
