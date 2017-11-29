package by.it_academy.lesson5.part1.Sharp;

public abstract class Shape {
    private double s;
    private double p;
    public abstract double getSqr();

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }
}
