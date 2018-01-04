package by.it_academy.lesson13.qa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {



    }


    public static boolean checkCarNumber(String text){
        Pattern pattern = Pattern.compile("^[0-9]{4} [A-Za-z]{2}-[1-7]{1}$");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }


    public static boolean checkPhoneNumber(String text2){
        text2 = text2.replaceAll("\\D","");
        Pattern pattern1 = Pattern.compile("^375(17|29|33|44|25){1}[0-9]{7}$");
        Matcher matcher1 = pattern1.matcher(text2);
        return matcher1.matches();
    }


}