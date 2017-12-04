package by.it_academy.lesson7.part1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-YYYY", Locale.forLanguageTag("ru"));
        String dataText = sdf.format(date);
        System.out.println(dataText);
        Date date2 = null;
        String dbirth = "2017-11-30 17:50";
        SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm");
        try {
            date2 = sdf2.parse(dbirth);
        } catch(ParseException e){
            System.out.println("Формат неверный");
        }
        System.out.println(date2.toString());


    }
}
