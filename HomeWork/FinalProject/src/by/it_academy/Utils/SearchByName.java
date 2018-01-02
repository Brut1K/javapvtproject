package by.it_academy.Utils;

import by.it_academy.Entity.School;
import by.it_academy.Entity.Student;


import java.util.ArrayList;
import java.util.List;

public class SearchByName {
    public static List<Student> searchByName(School school,String s) {
        List<Student> studentList = new ArrayList<>();
        for(int i = 0; i<school.getGroups().size();i++){
            for(int j = 0;j<school.getGroups().get(i).getStudents().size();j++){
                if(school.getGroups().get(i).getStudents().get(j).getName().contains(s)||
                   school.getGroups().get(i).getStudents().get(j).getLastname().contains(s)||
                   school.getGroups().get(i).getStudents().get(j).getSurname().contains(s)){
                    studentList.add(school.getGroups().get(i).getStudents().get(j));
                }
            }
        }
        return studentList;
    }
}
