package by.it_academy.task3;

public class Homework {
    public static void main(String[] args) {
        //длина и ширина прямоугольника и радиус круга, a b r
        int a = 4;
        int b = 4;
        int r = 5;
        // круг сможет закрыть собой прямоугольник, если сможет закрыть угол прямоугольника.
        // Т.е. если 1/2 диагонали прямоугольника будет меньше радиуса круга
        if (Math.sqrt(a * a + b * b) <= r) {
            System.out.println("Можно закрыть");
        } else {
            System.out.println("Нельзя закрыть");
        }
    }
}
