package by.it_academy;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.println("Здравствуйте, данные для работы находятся" +
                " на web-ресурсе. Какой формат данных скачать?\n" +
                "Выберите 1 для XML, либо 2 для JSON");
        String command;
        boolean checker = false;
        do {
            command = sc.nextLine();
            Pattern pattern = Pattern.compile("1|2");
            Matcher matcher = pattern.matcher(command);
            if (matcher.matches()) {
                switch (command) {
                    case "1": {
                        manager.createSchoolFromWeb("xml");
                        checker = true;
                        break;
                    }
                    case "2": {
                        manager.createSchoolFromWeb("json");
                        checker = true;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            } else {
                System.out.println("Вы ввели некорректные данные\n" +
                        "\"Выберите 1 для XML, либо 2 для JSON\"");
            }
        } while (checker == false);


        String comm;
        do {
            System.out.println("Выберите функцию, которой вы хотите восползоваться:\n" +
                    "1. Поиск учеников\n" +
                    "2. Просмотр расписания\n" +
                    "3. Просмотр списка именинников\n" +
                    "4. Завершение работы программы\n" +
                    "Введите цифру 1-4");
            comm = sc.nextLine();
            Pattern pattern = Pattern.compile("1|2|3|4");
            Matcher matcher = pattern.matcher(command);
            if (matcher.matches()) {
                switch (comm) {
                    case "1": {
                        String searchChoice;
                        do {
                            System.out.println("Выберите вариант поиска:\n" +
                                    "1. По имени или фамилии\n" +
                                    "2. По возрасту\n" +
                                    "3. По названию группы\n" +
                                    "4. По имени педагога\n" +
                                    "5. Отменить поиск\n" +
                                    "Введите цифру 1-5");
                            searchChoice = sc.nextLine();
                            switch (searchChoice) {
                                case "1": {
                                    System.out.println("Введите имя, фамилию или отчество(можно частично)");
                                    manager.search(Integer.parseInt(searchChoice),sc.nextLine());
                                }
                                case "2": {
                                    System.out.println("Введите возраст");
                                    students = searchByAge(school, scanner.nextInt());
                                    break;
                                }
                                case "3": {
                                    System.out.println("Введите название группы");
                                    students = searchByGroup(school, scanner.nextLine());
                                    break;
                                }
                                case "4": {
                                    System.out.println("Введите фамилию педагога");
                                    students = searchByTeacher(school, scanner.nextLine());
                                    break;
                                }
                                case "5": {
                                    System.out.println("Поиск отменен");
                                    break;
                                }
                                default: {
                                    System.out.println("Вы ввели некорректные данные");
                                    break;
                                }
                            }
                        } while (!searchChoice.equals("5"));


                        manager.search();
                        break;
                    }
                    case "2": {
                        System.out.println("Просмотр расписания");
                        //          students = searchByAge(school,scanner.nextInt());
                        break;
                    }
                    case "3": {
                        System.out.println("Просмотр списка именинников");
                        //           students = searchByGroup(school,scanner.nextLine());
                        break;
                    }
                    case "4": {
                        System.out.println("Завершение работы");
                        break;
                    }
                    default: {
                        System.out.println("Вы ввели некорректные данные");
                        break;
                    }
                }
            } else {
                System.out.println("Вы ввели некорректные данные");
            }

        }  while (!comm.equals("4")) ;
            }

    }

