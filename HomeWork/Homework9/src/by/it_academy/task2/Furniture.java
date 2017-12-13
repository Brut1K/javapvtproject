package by.it_academy.task2;

public class Furniture {
    //площадь
    private String name;
    private double sqr;

    public Furniture(String name, double sqr) {
        this.sqr = sqr;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getSqr() {
        return sqr;
    }

    public void setSqr(double sqr) {
        this.sqr = sqr;
    }
}
