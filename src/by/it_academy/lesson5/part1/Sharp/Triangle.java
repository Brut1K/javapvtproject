package by.it_academy.lesson5.part1.Sharp;

public class Triangle extends Shape {
    private double a;
    private double h;

    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
        setS(0.5*a*h);
    }

    @Override
    public double getSqr() {
        return 0.5*a*h;
    }
}
