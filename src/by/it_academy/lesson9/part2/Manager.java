package by.it_academy.lesson9.part2;

import java.util.*;

public class Manager {

    public static void main(String[] args) {

/*        List<Student> arr = new ArrayList<>();

        int command;
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Введите 1 для добавления студента\n" +
                    "Введите 2 для вывода информации о студентах\n" +
                    "Введите 3 для выхода из программы программы");
            command = scanner.nextInt();
            switch(command) {
                case 1: {
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Введите ФИО студента");
                    name = scanner1.nextLine();
                    System.out.println("Введите возраст студента");
                    age = scanner1.nextInt();
                    arr.add(new Student(name, age));
                    break;
            }
                case 2: {
                    for(int i = 0;i<arr.size();i++){
                        System.out.println((i+1)+". Студент: " + arr.get(i).getName()+"\n" +
                                "Возраст: " + arr.get(i).getAge());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Программа завершена");
                    break;
                }
                default: {
                    System.out.println("Введены некорректные данные");
                    break;
                }
            }


        } while (command!=3); */

        Student student1 = new Student("name",25);
        Student student2 = new Student("name",25);
        if(student1.equals(student2)){
            System.out.println("@@");
        }
        Student[] arr2 = new Student[2];
        ArrayList<Student> arr3 = new ArrayList<>();
        arr3.add(student1);
        arr3.add(student2);
        arr2[0] = student1;
        arr2[1] = student2;
        System.out.println(student1.toString());
        System.out.println(arr3.toString());

        //двухмерный массив
        int[][] a = new int[2][2];
        a[0][0] = 1;
/*
чтобы пользоваться сортировкой надо имплеменировать интерфейс Comparable
в класс энтити и переопределить метод compareTo,
где мы укажем кто больше и по каким критериям
*/
        Collections.sort(arr3);
 /*
определяем новый класс от интерфейса Comparator
и переопределяем метод Compare по нужным нам признакам,
можно создать много видов сортировки.
Каждый вид сортировки будет отдельным классом имплементированным от Comparator
        */


        Comparator sortbyAge = new SortByAgeComparator();
        Collections.sort(arr3,sortbyAge);


    }
}
