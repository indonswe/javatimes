package org.g37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(LocalDate.now());

        LocalDate march29 = LocalDate.parse("2020-03-25");

        System.out.println(march29.format(DateTimeFormatter.ofPattern("eeee dd MMM")));
    }
}
