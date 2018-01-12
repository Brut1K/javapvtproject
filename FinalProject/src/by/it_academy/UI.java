package by.it_academy;


import by.it_academy.entity.Group;
import by.it_academy.entity.School;
import by.it_academy.entity.Student;
import by.it_academy.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

import static by.it_academy.io.ParseXML.createXML;


public class UI {
    public static void main(String[] args) {
        School school = new School();
        school.setSchoolName("Вверх");
        List<Group> groups= new ArrayList<>();
        Group group1 = new Group();
        Group group2 = new Group();
        group1.setGroupName("Инжирики");
        group2.setGroupName("Жасмин");
        group1.setTeacher(new Teacher());
        group1.getTeacher().setName("Евгения");
        group1.getTeacher().setSurname("Сенчихина");
        group1.getTeacher().setLastname("Анатольевна");
        group2.setTeacher(new Teacher());
        group2.getTeacher().setName("Яна");
        group2.getTeacher().setSurname("Козел");
        group2.getTeacher().setLastname("Евгеньевна");
        groups.add(group1);
        groups.add(group2);
        school.setGroups(groups);
        List<Student> students = new ArrayList<>();

        for (int i = 0;i<5;i++){
            Student student = new Student();
            student.setName("Name" + i + " 999");
            System.out.println(student.getName());
            student.setSurname("SurName" + i);
            student.setLastname("LastName" + i);
            students.add(student);
            System.out.println(student.toString());
        }
        school.getGroups().get(0).setStudents(students);
        for(Student s:students){
            System.out.println(s.toString());
        }
        List<Student> students2 = new ArrayList<>();
        school.getGroups().get(1).setStudents(students2);
        System.out.println(school.toString());

        for(int n = 0;n<school.getGroups().get(0).getStudents().size();n++){
            System.out.println(school.getGroups().get(0).getStudents().get(n).getName());
        }

        createXML(school);


    }
}
