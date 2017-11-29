package by.it_academy.lesson5.part1.Sharp;

public class main {
    public static void main(String[] args) {
        Shape shape = null;
        int input = 1;
        switch (input) {
            case 1: {
                shape = new Triangle(10, 22);
                break;
            }
            case 2: {
                shape = new Square(10);
                break;
            }
            default: {
                System.out.println("Такой фигуры нет");
                break;
            }
        }
        printShapeSqr(shape);
    }

        private static void printShapeSqr(Shape shape){
        System.out.println("Площадь фигуры " + shape.getSqr());
        if (shape instanceof Shape){
            System.out.println("фигура");
        }
        if(shape instanceof Triangle){
            System.out.println("треугольник");
        }
        if (shape instanceof Square){
            System.out.println("квадрат");
        }
    }
}
