package by.it_academy.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String string;
        do {
            System.out.println("Введите строку либо # для завершения ввода");
            string = scanner.nextLine();
            if(!string.equals("#")){
                list.add(string);
            }

        } while (!string.equals("#"));

        System.out.println(list.toString());
        for (int i = 0;i<list.size();i++){
            list.set(i,list.get(i).replace("а",""));
        }
        System.out.println(list.toString());
    }
}
