package by.it_academy.lesson20;

public class Main {
    public static void main(String[] args) {

        try {
            int a = 5 / 0;

        } catch (Exception e){
            System.out.println("Зашли в exception");
            System.out.println(e.getMessage());


        } finally {
            System.out.println("Finally");
            int b = 5/0;
        }



    }
}
