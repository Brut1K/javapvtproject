package by.it_academy.Utils;

import by.it_academy.Entity.School;
import by.it_academy.Entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static by.it_academy.Utils.SearchByAge.searchByAge;
import static by.it_academy.Utils.SearchByGroup.searchByGroup;
import static by.it_academy.Utils.SearchByName.searchByName;
import static by.it_academy.Utils.SearchByTeacher.searchByTeacher;

public class Searcher {
    public static List<Student> searcher(School school) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Выберите вариант поиска:\n" +
                    "1. По имени или фамилии\n" +
                    "2. По возрасту\n" +
                    "3. По названию группы\n" +
                    "4. По имени педагога\n" +
                    "5. Отменить поиск\n" +
                    "Введите цифру 1-5");
            int command = scanner.nextInt();
            switch(command){
                case 1:{
                    System.out.println("Введите имя, фамилию или отчество(можно частично)");
                    students = searchByName(school,scanner.next());
                    break;
                }
                case 2:{
                    System.out.println("Введите возраст");
                    students = searchByAge(school,scanner.nextInt());
                    break;
                }
                case 3:{
                    System.out.println("Введите название группы");
                    students = searchByGroup(school,scanner.nextLine());
                    break;
                }
                case 4:{
                    System.out.println("Введите имя педагога");
                    students = searchByTeacher(school,scanner.nextLine());
                    break;
                }
            }

        } while ();
    }
}
