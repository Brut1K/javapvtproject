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
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Введите имя студента");
        student.setName(scanner.nextLine());
        System.out.println("Введите фамилию студента");
        student.setSurname(scanner.nextLine());
        do {
            System.out.println("Введите дату рождения студента" +
                    " в формате 31-10-2006");
            datebd = scanner.nextLine();
            try {
                date = sdf.parse(datebd);
            } catch (ParseException e) {
                System.out.println("Вы ввели неверный формат");
            }
        } while(date==null);
        student.setDate(date);
    }

    public void generateArray(Student[] arr){
        Manager manager = new Manager();
        for (int i = 0;i<arr.length;i++){
            arr[i] = new Student();
            manager.addStudent(arr[i]);
        }
    }

    /**
     * Вычисляет средний возраст всех студентов
     * @param arr массив студентов
     */
    public void averageAge(Student[] arr){
        long age = 0L;
        long averageage;
        Date curDate= new Date();
        long curlong = curDate.getTime();
        //считаем возраст всех студентов в милисекундах
        for (Student a:arr){
            age = age + curlong - a.getDate().getTime();
        }
        averageage = age/arr.length;//находим средний возраст в милисекундах
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(averageage);//подставляем средний возраст в милисекундах в календарь
        int year = calendar.get(GregorianCalendar.YEAR) - 1970;
        int month = calendar.get(GregorianCalendar.MONTH);
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        int hour = calendar.get(GregorianCalendar.HOUR_OF_DAY);
        int minutes = calendar.get(GregorianCalendar.MINUTE);
        int second = calendar.get(GregorianCalendar.SECOND);
        System.out.println("Средний возраст составляет " + year + " лет" +
                " " + month + " месяцев " + day + " дней " + hour + " часов" +
                " " + minutes + " минут " + second + " секунд.");
        //по хорошему тут для каждого инта ещё написать код, чтобы писало в правильном падеже...

    }
}
