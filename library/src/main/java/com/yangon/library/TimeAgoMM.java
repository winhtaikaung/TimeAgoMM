package com.yangon.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAgoMM {


    public static long SECOND = 1000l;
    public static long MINUTE = SECOND * 60l;
    public static long HOUR = MINUTE * 60l;
    public static long DAY = HOUR * 24l;
    public static long MONTH = DAY * 30l;
    public static long YEAR = DAY * 365l;

    private static String fromTimeMiliseconds(long phptime) {
        long current = System.currentTimeMillis();
        long gap = current - (phptime * 1000l);

        if (gap / YEAR == 1l) {
            return String.valueOf(gap / YEAR) + " year";
        } else if (gap / YEAR > 1l) {
            return String.valueOf(gap / YEAR) + " years";
        }

        if (gap / MONTH == 1l) {
            return String.valueOf(gap / MONTH) + " month";
        } else if (gap / MONTH > 1l) {
            return String.valueOf(gap / MONTH) + " months";
        }

        if (gap / DAY == 1l) {
            return "yesterday";
        } else if (gap / DAY > 1l) {
            return String.valueOf(gap / DAY) + " days";
        }

        if (gap / HOUR == 1l) {
            return String.valueOf(gap / HOUR) + " hour";
        } else if (gap / HOUR > 1l) {
            return String.valueOf(gap / HOUR) + " hours";
        }

        if (gap / YEAR == 1l) {
            return String.valueOf(gap / YEAR) + " year";
        } else if (gap / YEAR > 1l) {
            return String.valueOf(gap / YEAR) + " years";
        }

        if (gap / MINUTE == 1l) {
            return String.valueOf(gap / MINUTE) + " minute";
        } else if (gap / MINUTE > 1l) {
            return String.valueOf(gap / MINUTE) + " minutes";
        }

        if (gap / SECOND == 1l) {
            return String.valueOf(gap / SECOND) + " second";
        } else if (gap / SECOND > 1l) {
            return String.valueOf(gap / SECOND) + " seconds";
        }

        return "";
    }

    public static String format(Date date) {
        return fromTimeMiliseconds(date.getTime());
    }

    public static String format(Date date,FontFormat font) {
        return fromTimeMiliseconds(date.getTime());
    }

    /**
     * Convert Date String "dd-M-yyyy hh:mm:ss" to date and generate TimeAgo String
     * @param dateString
     * @param format
     * @return
     * @throws ParseException
     */
    public static String format(String dateString, TimeAgoFormat format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format.getFormat());
        Date date = sdf.parse(dateString);
        return fromTimeMiliseconds(date.getTime());
    }


}
