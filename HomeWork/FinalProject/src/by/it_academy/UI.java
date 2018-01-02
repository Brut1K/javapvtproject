package by.it_academy;

import by.it_academy.Entity.Student;

import static by.it_academy.Utils.AddStudent.addStudent;

public class UI {
    public static void main(String[] args) {
        Student first = addStudent();
        System.out.println(first);
    }
}
