package by.it_academy.task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = null;
        Scanner scanner = new Scanner(System.in);

        int checker;
        do {
            System.out.println("Введите 1, если хотите создать квадрат\n" +
                    "Введите 2, если хотите создать треугольник\n" +
                    "Введите 3, если хотите создать прямоугольник\n" +
                    "Введите 4, если хотите создать круг\n" +
                    "Введите 5, если хотите узнать площадь последней созданной фигуры\n" +
                    "Введите 6, если хотите завершить работу программы");
            checker = scanner.nextInt();
            switch (checker) {
                case 1: {
                    System.out.println("Введите сторону квадрата");
                    shape = new Square(scanner.nextDouble());
                    break;
                }
                case 2: {
                    System.out.println("Введите 3 стороны треугольника");
                    shape = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
                    break;
                }
                case 3: {
                    System.out.println("Введите длину и ширину прямоугольника");
                    shape = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
                    break;
                }
                case 4: {
                    System.out.println("Введите радиус круга");
                    shape = new Circle(scanner.nextDouble());
                    break;
                }
                case 5: {
                    try {
                        System.out.println("Площадь фигуры " + shape.getSqr());
                    } catch (NullPointerException e) {
                        System.out.println("Вы ещё не создали фигуру");
                    }
                    break;
                }
                case 6: {
                    System.out.println("Программа завершена");
                    break;
                }
                default: {
                    System.out.println("Вы ввели некорректное число");
                    break;
                }
            }

        } while (checker != 6);
    }
}
