package by.it_academy.lesson5.part1;

public class Main {

    public static int a = 10;
    public int b = 5;

    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();
        Main main3 = new Main();
        Main main4 = new Main();
        main2.test();
    }
        //нестатик индивидуальный, статик что-то общее
    // из статического метода нестатическую переменную не изменить
    // статические методы делать обобщенные, которые подойдут всем
    public void test(){
        a = 5;
        b = 20;
    }

}
