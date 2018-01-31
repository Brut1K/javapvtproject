package by.it_academy.indevelop;

import by.it_academy.entity.Group;
import by.it_academy.entity.School;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static by.it_academy.indevelop.AddGroup.addGroup;

public class AddSchool {
    public static School addSchool(){
        School school = new School();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название школы");
        school.setSchoolName(scanner.nextLine());
        boolean check = true;
        List<Group> groups = new ArrayList<>();
        String a;
        do {
            System.out.println("Хотите добавить новую группу(да/нет)");
            a = scanner.nextLine();
            if (a.equals("да")) {
                groups.add(addGroup());
            } else if (a.equals("нет")){
                school.setGroups(groups);
                check = false;
            } else {
                System.out.println("Введите \"да\" или \"нет\"");
            }
        } while(check);
        return school;
    }
}
