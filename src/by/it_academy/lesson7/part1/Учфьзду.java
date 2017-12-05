package by.it_academy.lesson7.part1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;

public class Учфьзду {
        public static void main(String[] args) {
            String target = "08 28 20:29:30 2000";
            SimpleDateFormat df = new SimpleDateFormat("MM dd kk:mm:ss yyyy", Locale.ENGLISH);
            Date result = null;
            try {
                result = df.parse(target);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(result);
        }
    }

