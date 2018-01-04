package by.it_academy;


import by.it_academy.Entity.Root;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main {


    public static void main(String[] args) {

        try {
            File file = new File("test.json");
            ObjectMapper objectMapper = new ObjectMapper();
           Root root = objectMapper.readValue(file, Root.class);
            System.out.println(root.toString());

        } catch (Exception e) {

            System.out.println(e);
        }
    }


}
