package by.it_academy.utils;



import by.it_academy.entity.School;
import by.it_academy.entity.Student;

import java.util.*;


public class Searcher {
    public List<Student> searcher(int i,String attr,School school) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String searchChoice;
            searchChoice = scanner.nextLine();
            switch(i){
                case 1:{
                    students = searchByName(school,attr);
                    return students;
                }
                case 2:{
                    students = searchByAge(school,Integer.parseInt(attr ));
                    break;
                }
                case 3:{
                    students = searchByGroup(school,attr);
                    break;
                }
                case 4:{
                    students = searchByTeacher(school,attr);
                    break;
                }
                default:{

                    break;
                }
            }
        return students;
    }

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


    public static List<Student> searchByTeacher(School school, String teacherSurName) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < school.getGroups().size(); i++) {
            if(school.getGroups().get(i).getTeacher().getSurname().equals(teacherSurName)){
                for (int j = 0; j < school.getGroups().get(i).getStudents().size(); j++){
                    studentList.add(school.getGroups().get(i).getStudents().get(j));
                }
            }
        }
        return studentList;
    }
}
