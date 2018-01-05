package by.it_academy.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileWriter writter = new FileWriter("D:\\javapvt\\javapvtproject\\HomeWork\\Homework7\\src\\by\\it_academy\\reflectionAPI\\example.txt",false)) {
            String text = "Вот так работает Filewritter";
            writter.write(text);
            writter.append('\n');
            writter.write("Работает?");
            writter.write("      \n");
            writter.write("Работает?");
            writter.flush();
            writter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader reader = new FileReader("D:\\javapvt\\javapvtproject\\HomeWork\\Homework7\\src\\by\\it_academy\\reflectionAPI\\example.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }


    }
}
