package by.it_academy.task1;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.generateArray();
        Pacient[] p = manager.getPatientList();
        int command;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 1, чтобы получить информацию о всех пациентах\n" +
                    "Введите 2, чтобы произвести поиск по имени или фамилии\n" +
                    "Введите 3, чтобы произвести поиск по возрасту пацинта\n" +
                    "Введите 4 для выхода из программы");
            command = scanner.nextInt();
            switch (command) {
                case 1: {
                    //вывести всех

                    if (p.length > 1) {
                        printPatientArray(p);
                    } else {
                        System.out.println("Пациентов нет");
                    }
                    break;
                }
                case 2: {
                    //по фио
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Введите имя или фамилию");
                    Pacient[] array = manager.searchByName(scanner1.next());
                    if (array.length > 1) {
                        printPatientArray(array);
                    } else {
                        System.out.println("Пациентов с такими ФИО не найдено");
                    }
                    break;
                }
                case 3: {
                    //по возрасту
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Введите возраст пациента");
                    Pacient[] array = manager.searchByAge(scanner2.nextInt());
                    if (array.length > 1) {
                        printPatientArray(array);
                    } else {
                        System.out.println("Пациентов такого возраста не найдено");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Программа закончила свою работу");
                    break;
                }
                default: {
                    System.out.println("Вы ввели некорректное значение");
                    break;
                }

            }
        } while (command!=4);
    }




    public void infoPatient(Pacient pacient){
        System.out.println("Пациент: " + pacient.getName());
        System.out.println("Возраст пациента: " + pacient.getAge());
        System.out.println("Диагноз: " + pacient.getDiagnoz());
        System.out.println("Номер палаты: " + pacient.getRoom());
        String a;
        if(pacient.getRep()){
            a = "хроническое заболевание";
        } else {
            a = "не хроническое заболевание";
        }
        System.out.println("Тип заболевания: " + a);
        System.out.println();
    }


    public static void printPatientArray(Pacient[] array){
        UI ui = new UI();
        for (Pacient pacient : array){
        ui.infoPatient(pacient);
        }
    }



}
