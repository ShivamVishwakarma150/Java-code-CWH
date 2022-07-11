package com.Learn;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate=dt.format(df);//creating date string using date and format
        System.out.println(myDate);
    }
}
