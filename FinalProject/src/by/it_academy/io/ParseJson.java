package by.it_academy.io;

import by.it_academy.entity.School;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class ParseJson {

    public School parseJson() {
        try {
            BufferedReader bufferedReader = new BufferedReader
                    (new FileReader("school.json"));
            //пишем через билдер, если хотим переопределить какие-то конверторы,
            // в данном случае дату
            GsonBuilder builder = new GsonBuilder() .registerTypeAdapter(Date.class, new DateGsonConvert());
            Gson gson = builder.create();
            School school = gson.fromJson(bufferedReader, School.class);
            return school;
        } catch (Exception e) {
            System.out.println("Невозможно открыть json error = " + e.toString());
            return null;
        }
    }
}
