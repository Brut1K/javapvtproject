package by.it_academy.task2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int number = 0;
    static boolean bool = true;
    static String clear;
    static Scanner scanner = new Scanner(System.in);
    static int a;
    static int b;


    public static void main(String[] args) {

        int command;
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
                    Main.sub();
                    break;
                }
                case 3:{
                    Main.multi();
                    break;
                }
                case 4:{
                    Main.div();
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
        System.out.println("Введите первое слагаемое");
        a = Main.enterNumber();
        System.out.println("Введите второе слагаемое");
        b = Main.enterNumber();
        System.out.println(a+" + "+b+" = "+(a+b));
    }

    public static void sub(){
        System.out.println("Введите уменьшаемое");
        a = Main.enterNumber();
        System.out.println("Введите вычитаемое");
        b = Main.enterNumber();
        System.out.println(a+"-"+b+"="+(a-b));
    }

    public static void multi(){
        System.out.println("Введите первый множитель");
        a = Main.enterNumber();
        System.out.println("Введите второй множитель");
        b = Main.enterNumber();
        try{
            if(a!=5&&b!=5){
                System.out.println(a+"*"+b+"="+(a*b));
            } else {
                throw new MultiplyByFive();
            }
        } catch (MultiplyByFive e){
            System.out.println(e.getRussianMessage());
        }
    }

    public static void div (){
        System.out.println("Введите делимое");
        a = Main.enterNumber();
        System.out.println("Введите делитель");
        b = Main.enterNumber();
        try{
            System.out.println(a+"/"+b+"="+(a/b));
        } catch (ArithmeticException e){
            System.out.println("Делить на 0 нельзя");
        }
    }

    public static int enterNumber(){
        do{
            try {
                number = scanner.nextInt();
                if (number==13)
                    throw new Thirteen() ;
                bool = false;
            } catch(InputMismatchException e){
                System.out.println("Вы ввели некорректные данные, повторите ввод");
                clear = scanner.next();
            } catch(Thirteen e){
                System.out.println(e.getRussianMessage());
            }
        } while (bool);
        bool = true;
        return number;
    }

}
