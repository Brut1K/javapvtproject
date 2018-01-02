package by.it_academy.Utils;

import by.it_academy.Entity.School;
import by.it_academy.Entity.Student;

import java.util.ArrayList;
import java.util.List;

public class SearchByTeacher {
    public static List<Student> searchByTeacher(School school, String teacher) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < school.getGroups().size(); i++) {
            if(school.getGroups().get(i).getTeacher().getName().equals(teacher)){
                for (int j = 0; j < school.getGroups().get(i).getStudents().size(); j++){
                    studentList.add(school.getGroups().get(i).getStudents().get(j));
                }
            }
        }
        return studentList;
    }
}
