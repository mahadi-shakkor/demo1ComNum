package com.oop.mahadi.demo1comnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator {

    public static boolean isValidDate(String dateStr, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isBeforeCurrentDate(String dateStr, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            Date inputDate = sdf.parse(dateStr);
            Date currentDate = new Date();
            return inputDate.before(currentDate);
        } catch (ParseException e) {
            return false;
        }
    }

    public static boolean isAfterCurrentDate(String dateStr, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            Date inputDate = sdf.parse(dateStr);
            Date currentDate = new Date();
            return inputDate.after(currentDate);
        } catch (ParseException e) {
            return false;
        }
    }
}
