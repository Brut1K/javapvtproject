package by.it_academy.utils;



import by.it_academy.entity.School;
import by.it_academy.entity.Student;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;


public class Searcher {
    public List<Student> searcher(int i, String attr, School school) {
        List<Student> students = new ArrayList<>();
            switch(i){
                case 1:{
                    students = searchByName(school,attr);
                    break;
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

    private List<Student> searchByAge(School school, int age) {
        List<Student> studentList = new ArrayList<>();
        GregorianCalendar curDate = new GregorianCalendar();
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


    private List<Student> searchByName(School school,String s) {
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


    private List<Student> searchByGroup(School school, String group) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < school.getGroups().size(); i++) {
            if(school.getGroups().get(i).getGroupName().toLowerCase().equals(group.toLowerCase())){
                for (int j = 0; j < school.getGroups().get(i).getStudents().size(); j++){
                    studentList.add(school.getGroups().get(i).getStudents().get(j));
                }
            }
        }
        return studentList;
    }


    private List<Student> searchByTeacher(School school, String teacherSurName) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < school.getGroups().size(); i++) {
            if(school.getGroups().get(i).getTeacher().getSurname().toLowerCase().equals(teacherSurName.toLowerCase())){
                for (int j = 0; j < school.getGroups().get(i).getStudents().size(); j++){
                    studentList.add(school.getGroups().get(i).getStudents().get(j));
                }
            }
        }
        return studentList;
    }
}
