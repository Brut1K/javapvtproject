package by.it_academy.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Manager {

    public void addStudent(Student student){
        Scanner scanner = new Scanner(System.in);
        String datebd;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
   /*     System.out.println("Введите имя студента");
        student.setName(scanner.nextLine());
        System.out.println("Введите фамилию студента");
        student.setSurname(scanner.nextLine()); */
        do {
            System.out.println("Введите дату рождения студента" +
                    " в формате 31-10-2006");
            datebd = scanner.nextLine();
            try {
                date = sdf.parse(datebd);
            } catch (ParseException e) {
                System.out.println("Вы ввели неверный формат");
            }
            student.setDate(date);
        } while(date==null);
        student.setDate(date);
        date = null;
    }

    public void generateArray(Student[] arr){
        Manager manager = new Manager();
        for (int i = 0;i<arr.length;i++){
            arr[i] = new Student();
            manager.addStudent(arr[i]);
        }
    }

    public void averageAge(Student[] arr){
        int year = 0;
        int month = 0;
        int day;
        int hour;
        int minutes;
        long age = 0L;
        long averageage;
        Date curDate= new Date();
        long curlong = curDate.getTime();


        for (Student a:arr){
            age = age + curlong - a.getDate().getTime();
        }
        averageage = age/arr.length;
        Date avdate = new Date(averageage);
        System.out.println(avdate.toString());
        Date date2 = new Date();
        date2.setTime(0L);
        System.out.println(date2.toString());


    }
}
