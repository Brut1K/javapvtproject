package by.it_academy.task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

    public void saveData(Student[] arr){

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            try (FileWriter writter = new FileWriter("D:\\javapvt\\javapvtproject\\HomeWork\\Homework8\\src\\by\\it_academy\\task3\\example.txt",false)) {
                for(Student s:arr){
                    writter.write(s.getName());
                    writter.write("#");
                    writter.write(s.getSurname());
                    writter.write("#");
                    writter.write(sdf.format(s.getDate()));
                    writter.write("#");
                    writter.write("\n");
                }
                writter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public Student[] loadData(){
        try(FileReader reader = new FileReader("D:\\javapvt\\javapvtproject\\HomeWork\\Homework8\\src\\by\\it_academy\\task3\\example.txt"))
        {
            Scanner scanner = new Scanner(reader);
            List<Student> list = new ArrayList<>();
            String file;
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            while(scanner.hasNextLine()){
                Student student = new Student();
                file = scanner.nextLine();
                student.setName(file.substring(0,file.indexOf('#')));
                file = file.substring(file.indexOf("#")+1);
                student.setSurname(file.substring(0,file.indexOf('#')));
                file = file.substring(file.indexOf("#")+1);
                try {
                    student.setDate(sdf.parse(file.substring(0,file.indexOf('#'))));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                list.add(student);
            }
            int listsize = list.size();
            Student[] arr = new Student[listsize];
            for(int i = 0; i<arr.length;i++){
                arr[i] = list.get(i);
            }
            return arr;
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            return new Student[0];
        }
    }
}

