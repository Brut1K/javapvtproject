package by.it_academy.lesson7.part2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        int day = date.getDate();
        //одинарные кавычки в паттрене защищают содержимое от интерпретации
        // SimpleDateFormat, оставит просто текст
        String pattern = "MMM d'" + getPosfix(day) + "' KK:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        String datatext = sdf.format(date);
        System.out.println(datatext);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();//default current time
        gregorianCalendar.setTime(date);
    //    gregorianCalendar.setTimeInMillis(1238971898798L);
        int dayM = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        int month = gregorianCalendar.get(GregorianCalendar.MONTH);
        //добавляет 30 дней
        gregorianCalendar.add(GregorianCalendar.DATE,30);
        System.out.println(gregorianCalendar.getTime().toString());


    }

        private static String getPosfix(int day){
            if(day>=11&&day<=13)
                return "th";
            switch(day%10){
                case 1: {
                    return "st";
                }
                case 2: {
                    return "nd";
                }
                case 3: {
                    return "rd";
                }
                default: {
                    return "th";
                }
            }

    }

}
