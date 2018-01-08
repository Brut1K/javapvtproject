package by.it_academy.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String file = "test_22.doc";
        String p = "([\\wА-яа-я]{1,})(\\.)(\\w+$)";
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(file);
        if(m.matches()) {
            System.out.println("Расширение " + m.group(3));
        } else {
            System.out.println("Введено некорректное имя файла");
        }
    }
}
