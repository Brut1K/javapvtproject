package by.it_academy.Utils;

import by.it_academy.Entity.School;
import by.it_academy.Entity.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class SearchByAge {
    public static List<Student> searchByAge(School school, int age) {
        List<Student> studentList = new ArrayList<>();
        Date date = new Date();
        GregorianCalendar curDate = new GregorianCalendar();
        curDate.setTime(date);
        GregorianCalendar calendar = new GregorianCalendar();
        for (int i = 0; i < school.getGroups().size(); i++) {
            for (int j = 0; j < school.getGroups().get(i).getStudents().size(); j++) {
                calendar.setTime(school.getGroups().get(i).getStudents().get(j).getbDay());
                if ((curDate.get(GregorianCalendar.YEAR) - calendar.get(GregorianCalendar.YEAR) == age) &&
                        curDate.get(GregorianCalendar.MONTH) <= calendar.get(GregorianCalendar.MONTH) &&
                        curDate.get(GregorianCalendar.DAY_OF_MONTH) <= calendar.get(GregorianCalendar.DAY_OF_MONTH)) {
                    studentList.add(school.getGroups().get(i).getStudents().get(j));
                }
            }
        }
        return studentList;
    }
}
