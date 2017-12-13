package by.it_academy.task2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int command;
        int a ;
        int b ;
        String clear;
        Scanner scanner = new Scanner(System.in);
        do {
            command = 0;

            System.out.println("Введите 1, если хотите произвести сложение\n" +
                    "Введите 2, если хотите произвести вычетание\n" +
                    "Введите 3, если хотите произвести умножение\n" +
                    "Введите 4, если хотите произвести деление\n" +
                    "Введите 5, если хотите завершить работу программы");

            try {
                command = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Вы ввели некорректные данные, повторите попытку");
                clear = scanner.next();
            }

            switch(command){
                case 1:{
                    Main.add();
                    break;
                }
                case 2:{
                    System.out.println("Введите уменьшаемое");
                    try {
                        a = scanner.nextInt();
                    } catch(InputMismatchException e){
                        System.out.println("Вы ввели некорректные данные");
                        clear = scanner.next();
                        break;
                    }
                    System.out.println("Введите вычитаемое");
                    try {
                        b = scanner.nextInt();
                    } catch(InputMismatchException e){
                        System.out.println("Вы ввели некорректные данные");
                        clear = scanner.next();
                        break;
                    }
                    System.out.println(a+"-"+b+"="+sub(a,b));
                    break;
                }
                case 3:{
                    System.out.println("Введите первый множитель");
                    try {
                        a = scanner.nextInt();
                    } catch(InputMismatchException e){
                        System.out.println("Вы ввели некорректные данные");
                        clear = scanner.next();
                        break;
                    }
                    System.out.println("Введите второй множитель");
                    try {
                        b = scanner.nextInt();
                    } catch(InputMismatchException e){
                        System.out.println("Вы ввели некорректные данные");
                        clear = scanner.next();
                        break;
                    }
                    System.out.println(a+"*"+b+"="+multi(a,b));
                    break;
                }
                case 4:{
                    System.out.println("Введите делимое");
                    try {
                        a = scanner.nextInt();
                    } catch(InputMismatchException e){
                        System.out.println("Вы ввели некорректные данные");
                        clear = scanner.next();
                        break;
                    }
                    System.out.println("Введите делитель");
                    try {
                        b = scanner.nextInt();
                    } catch(InputMismatchException e){
                        System.out.println("Вы ввели некорректные данные");
                        clear = scanner.next();
                        break;
                    }
                    try{
                        System.out.println(a+"/"+b+"="+div(a,b));
                    } catch (ArithmeticException e){
                        System.out.println("Делить на 0 нельзя");
                    }
                    break;
                }
                case 5:{
                    System.out.println("Работа программы завершена");
                    break;
                }
                default:{
                    System.out.println("Вы ввели некорректное значение");
                }
            }

        } while(command!=5);

    }

    public static void add(){
        int a =0;
        boolean a2 = true;
        int b = 0;
        boolean b2 = true;
        String clear;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слагаемое");
        do{
            try {
                a = scanner.nextInt();
                a2 = false;
            } catch(InputMismatchException e){
                System.out.println("Вы ввели некорректные данные, повторите ввод");
                clear = scanner.next();
            }
        } while (a2);

        System.out.println("Введите второе слагаемое");
        do{
            try {
                b = scanner.nextInt();
                b2 = false;
            } catch(InputMismatchException e){
                System.out.println("Вы ввели некорректные данные, повторите ввод");
                clear = scanner.next();
            }
        } while (b2);
             System.out.println(a+" + "+b+" = "+(a+b));

    }



    public static int sub(int a,int b){
        return a-b;
    }

    public static int multi(int a, int b){
        return a*b;
    }
    public static int div (int a, int b){
        try {
        return a/b;
        } catch(ArithmeticException e){
            System.out.println("Делить на 0 нельзя");
            return 0;
        }
    }


}
