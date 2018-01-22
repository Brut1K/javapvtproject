package by.it_academy.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Downloader {

    public static void download(String format) {
        String xmlLink = "<http://drop53.dropmefiles.com/dl/vAntl/255908486/school.xml";
        String jsonLink = "http://kiparo.ru/t/bank_card.json";
        String patternS = "(.+)"+"("+format +"$)";
        Pattern pattern = Pattern.compile(patternS);
        Matcher matcher = pattern.matcher(xmlLink);
        String link;
        String filepath;
        if(matcher.matches()) {
            link = xmlLink;
           filepath = "data.xml";
        } else{
            link = jsonLink;
            filepath = "data.json";
        }
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            URL url = new URL(link);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputStream = httpURLConnection.getInputStream();
                File file = new File(filepath);
                fileOutputStream = new FileOutputStream(file);
                int byteRead = -1;
                byte[] buffer = new byte[4096];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }
            } else {
                System.out.println("Данные не найдены, response code = "
                        + responseCode);
            }
        } catch (Exception e) {
            System.out.println("Невозможно скачать файл");
        } finally {
            if (inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Невозможно закрыть inputStream");
                }
            if (fileOutputStream != null)
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Невозможно закрыть fileOutputStream");
                }
        }
    }
}


