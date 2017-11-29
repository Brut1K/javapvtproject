package by.it_academy.lesson5.part1.Sharp;

public class Square extends Shape{
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getSqr() {
        return a*a;
    }
}
