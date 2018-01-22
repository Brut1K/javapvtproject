package by.it_academy.io;

import by.it_academy.entity.School;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class ParseJson {

    public static School parseJson(String path) {
        try {
            BufferedReader bufferedReader = new BufferedReader
                    (new FileReader(path));
            //пишем через билдер, если хотим переопределить какие-то конверторы,
            // в данном случае дату
            GsonBuilder builder = new GsonBuilder() .registerTypeAdapter(Date.class, new DateGsonConvert());

            //можно без билдера сразу создавать new Gson();
            Gson gson = builder.create();


            School school = gson.fromJson(bufferedReader, School.class);
            System.out.println("root = " + school.toString());
            return school;
        } catch (Exception e) {
            System.out.println("Невозможно открыть json error = " + e.toString());
            return null;
        }
    }
}
