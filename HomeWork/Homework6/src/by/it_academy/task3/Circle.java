package by.it_academy.task3;

public class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getSqr() {
        return Math.PI*r*r;
    }
}
