package by.it_academy;

import by.it_academy.Entity.Root;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static by.it_academy.MySaxParser.mySaxParser;

public class Main {
    private static final String LINK = "http://kiparo.ru/t/test.xml";

    public static void main(String[] args) {

        InputStream inputStream = null;

        FileOutputStream fileOutputStream = null;
        try {
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputStream = httpURLConnection.getInputStream();
                File file = new File("test.xml");
                fileOutputStream = new FileOutputStream(file);
                int byteRead = -1;
                byte[] buffer = new byte[4096];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }

                Root root = mySaxParser(file);
                System.out.println(root.toString());
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
