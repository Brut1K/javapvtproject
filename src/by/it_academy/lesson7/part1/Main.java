package by.it_academy.lesson7.part1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args)  {

        Date date = new Date();//текущая дата
        System.out.println(date.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.forLanguageTag("by"));
        String dataText = sdf.format(date);  //конвертируем дату в стринг
        System.out.println(dataText); //пишет текущую дату в 06-12-2017, всё работает
        Date date2 = null;
        try {
            date2 = sdf.parse(dataText);//конвертируем стринг в дату и тут происходит хрень!!!
        } catch(ParseException e){
            System.out.println("Формат неверный");
        }
        String dataText2=sdf.format(date2);//конвертируем дату в стринг и всё, дата не текущая
        System.out.println(dataText2); //пишет 01-01-2017 если Locale.English или Locale.forLanguageTag("by")
        // 26-12-2017 если Locale.forLanguageTag("ru")
    }
}
