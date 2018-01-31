package by.it_academy.controller.utils;

import by.it_academy.entity.School;
import by.it_academy.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Поиск ученика по совпадению в имени
 */

public class SearcherByName implements Searcher {


    @Override
    public List<Student> search(School school, String s) {
        List<Student> studentList = new ArrayList<>();
        for(int i = 0; i<school.getGroups().size();i++){
            for(int j = 0;j<school.getGroups().get(i).getStudents().size();j++){
                if(school.getGroups().get(i).getStudents().get(j).getName().toLowerCase().contains(s.toLowerCase())||
                        school.getGroups().get(i).getStudents().get(j).getLastname().toLowerCase().contains(s.toLowerCase())||
                        school.getGroups().get(i).getStudents().get(j).getSurname().toLowerCase().contains(s.toLowerCase())){
                    studentList.add(school.getGroups().get(i).getStudents().get(j));
                }
            }
        }
        return studentList;
    }
}
