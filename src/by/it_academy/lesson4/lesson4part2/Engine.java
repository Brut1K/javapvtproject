package by.it_academy.lesson4.lesson4part2;

public class Engine {
    public static final int GAS_98 = 0;
    public static final int GAS_95 = 1;
    public static final int GAS_92 = 2;
    public static final int DF = 3;
    public enum GAS_TYPE{
        GAS_98,GAS_95,GAS_92,DF
    };


    private double volume;
    private String model;
    private GAS_TYPE gas;


}
