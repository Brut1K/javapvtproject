package by.it_academy.Utils;

import by.it_academy.Entity.School;
import by.it_academy.Entity.Student;

import java.util.ArrayList;
import java.util.List;

public class SearchByGroup {
    public static List<Student> searchByGroup(School school, String group) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < school.getGroups().size(); i++) {
            if(school.getGroups().get(i).equals(group)){
                for (int j = 0; j < school.getGroups().get(i).getStudents().size(); j++){
                    studentList.add(school.getGroups().get(i).getStudents().get(j));
                }
                }
            }
        return studentList;
    }
}
