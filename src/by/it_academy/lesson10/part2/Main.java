package by.it_academy.lesson10.part2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    private static final String LINK = "https://www.tut.by/";

    public static void main(String[] args) {
/*

        Set<String> testSet = new HashSet();
        testSet.add("aaa");
        testSet.add("bbb");
        testSet.add("ccc");
        testSet.add("aaa");

        for(String test:testSet){
            System.out.println("value: = "+test);
        }
//удаление дубликатов из листа
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");

        testSet.addAll(list);
        list.clear();
        list.addAll(testSet);   */

        InputStream inputStream = null;

        FileOutputStream fileOutputStream = null;
        try{
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if(responseCode==HttpURLConnection.HTTP_OK){
                inputStream = httpURLConnection.getInputStream();


                File file = new File("ex2.html");
                fileOutputStream = new FileOutputStream(file);
                int byteRead = -1;
                byte[] buffer = new byte[4096];
                while((byteRead = inputStream.read(buffer))!=-1){
                    fileOutputStream.write(buffer, 0,byteRead);
                }


            } else {
                System.out.println("Данные не найдены, response code = "
                        +responseCode);
            }

        } catch(Exception e){
            System.out.println("Невозможно скачать файл");
        }
        finally {
            if(inputStream!=null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Невозможно закрыть inputStream");
                }
            if(fileOutputStream!=null)
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Невозможно закрыть fileOutputStream");
                }
        }


    }
}
