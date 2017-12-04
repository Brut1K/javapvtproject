package by.it_academy.task3;

public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getSqr() {
        return a*b;
    }
}
