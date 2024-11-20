package com.example.vulnerable_app.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyClass {
    private static Calendar calendar = Calendar.getInstance();  // Noncompliant
    private static SimpleDateFormat format = new SimpleDateFormat("HH-mm-ss");  // Noncompliant

    public static String getFormattedTime() {
        calendar.setTimeInMillis(System.currentTimeMillis());
        return format.format(calendar.getTime());
    }
}
