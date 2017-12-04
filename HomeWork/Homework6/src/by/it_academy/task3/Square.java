package by.it_academy.task3;

public class Square extends Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }


    @Override
    double getSqr() {
        return a*a;
    }
}
