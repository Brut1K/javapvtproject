package by.it_academy.lesson13.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

       String text = "6562 OI-7";
        Pattern pattern = Pattern.compile("^[0-9]{4} [A-Za-z]{2}-[1-7]{1}$");
        Matcher matcher = pattern.matcher(text);
       if(matcher.matches()){
           System.out.println("Номер корректный");
       } else {
           System.out.println("Номер некорректный");
       }

       String text2 = "+375 (29) 331-95-22";
       text2 = text2.replaceAll("\\D","");
        System.out.println(text2);
        Pattern pattern1 = Pattern.compile("^375(17|29|33|44|25){1}[0-9]{7}$");
        Matcher matcher1 = pattern1.matcher(text2);
        if(matcher1.matches()){
            System.out.println("Номер корректный");
        } else {
            System.out.println("Номер некорректный");
        }

    }
}
