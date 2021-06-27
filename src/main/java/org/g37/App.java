package org.g37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(LocalDate.now());

        LocalDate march29 = LocalDate.parse("2020-03-25");
        System.out.println(march29.format(DateTimeFormatter.ofPattern("eeee dd MMM")));


        LocalDate weekDay = LocalDate.parse("2021-06-21");
        Boolean finished;
        do {
            System.out.println(weekDay);
            weekDay = weekDay.plusDays(1);
            finished=weekDay.isEqual(LocalDate.parse("2021-06-28"));
        } while (!finished);
    }
}
