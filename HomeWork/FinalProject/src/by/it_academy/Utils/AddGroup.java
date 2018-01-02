package by.it_academy.Utils;

import by.it_academy.Entity.Group;
import by.it_academy.Entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static by.it_academy.Utils.AddStudent.addStudent;
import static by.it_academy.Utils.AddTeacher.addTeacher;

public class AddGroup {
    public static Group addGroup(){
        Group group = new Group();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название группы");
        group.setName(scanner.nextLine());
        group.setTeacher(addTeacher());
        List<Student> studentList = new ArrayList<>();
        boolean check = true;
        do {
            System.out.println("Добавить в группу ученика(да/нет)");
            if (scanner.nextLine().equals("да")) {
                studentList.add(addStudent());
            } else if (scanner.nextLine().equals("нет")){
                group.setStudents(studentList);
                check = false;
            } else {
                System.out.println("Введите \"да\" или \"нет\"");
            }
        } while(check);
        return group;
    }
}
