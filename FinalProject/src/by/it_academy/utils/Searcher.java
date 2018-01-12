package by.it_academy.utils;



import by.it_academy.entity.School;
import by.it_academy.entity.Student;

import java.util.*;


public class Searcher {
    public static List<Student> searcher(School school) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int command;
        do {
            System.out.println("Выберите вариант поиска:\n" +
                    "1. По имени или фамилии\n" +
                    "2. По возрасту\n" +
                    "3. По названию группы\n" +
                    "4. По имени педагога\n" +
                    "5. Отменить поиск\n" +
                    "Введите цифру 1-5");
            command = scanner.nextInt();
            switch(command){
                case 1:{
                    System.out.println("Введите имя, фамилию или отчество(можно частично)");
                    students = searchByName(school,scanner.next());
                    break;
                }
                case 2:{
                    System.out.println("Введите возраст");
                    students = searchByAge(school,scanner.nextInt());
                    break;
                }
                case 3:{
                    System.out.println("Введите название группы");
                    students = searchByGroup(school,scanner.nextLine());
                    break;
                }
                case 4:{
                    System.out.println("Введите фамилию педагога");
                    students = searchByTeacher(school,scanner.nextLine());
                    break;
                }
                case 5:{
                    System.out.println("Поиск отменен");
                    break;
                }
                default:{
                    System.out.println("Вы ввели некорректные данные");
                    break;
                }
            }
        } while (command!=5);
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
