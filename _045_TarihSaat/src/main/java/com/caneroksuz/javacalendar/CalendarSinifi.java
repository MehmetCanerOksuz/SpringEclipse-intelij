package com.caneroksuz.javacalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarSinifi {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getTime());
        System.out.println(Calendar.YEAR);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    }
}
