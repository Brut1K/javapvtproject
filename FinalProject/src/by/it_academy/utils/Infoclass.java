package by.it_academy.utils;

import by.it_academy.entity.School;
import by.it_academy.entity.Student;

import java.util.List;

public class Infoclass {

    public void info(School school) {
        int countGroup = 0;
        int countStudent = 0;
        for (int i = 0; i < school.getGroups().size(); i++) {
            countGroup++;
            countStudent = countStudent + school.getGroups().get(i).getStudents().size();
        }
        System.out.println("Были загружены данные о школе танцев:\n" +
                "Групп " + countGroup + " шт.\n" +
                "Учеников " + countStudent + " чел.");
    }

    public void info(Student student){
        System.out.println("Имя: " + student.getName() + "\n" +
                "Фамилия: " + student.getSurname() + "\n" +
                "Отчество: " + student.getLastname() + "\n" +
                "Дата рождения: " + student.getbDay() + "\n");

    }

    public void info(List<Student> list){
        for(int i = 0;i<list.size();i++){
            System.out.println((i+1)+". " + list.get(i).getSurname() +
            " " + list.get(i).getName() + " " + list.get(i).getLastname());
        }
    }
}
