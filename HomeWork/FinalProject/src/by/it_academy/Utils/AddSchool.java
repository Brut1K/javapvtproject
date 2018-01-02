package by.it_academy.Utils;

import by.it_academy.Entity.Group;
import by.it_academy.Entity.School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static by.it_academy.Utils.AddGroup.addGroup;

public class AddSchool {
    public static School addSchool(){
        School school = new School();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название группы");
        school.setName(scanner.nextLine());
        boolean check = true;
        List<Group> groups = new ArrayList<>();
        do {
            System.out.println("Хотите добавить новую группу(да/нет");
            if (scanner.nextLine().equals("да")) {
                groups.add(addGroup());
            } else if (scanner.nextLine().equals("нет")){
                school.setGroups(groups);
                check = false;
            } else {
                System.out.println("Введите \"да\" или \"нет\"");
            }
        } while(check);
        return school;
    }
}
