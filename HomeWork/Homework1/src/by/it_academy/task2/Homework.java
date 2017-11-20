package by.it_academy.task2;

public class Homework {
    public static void main(String[] args) {
        int l1t2 = 1234332755;
        String l1t2string = Integer.toString(l1t2);
        if (l1t2string.charAt(l1t2string.length() - 1) == '7') {
            System.out.println("На конце числа цифра 7");
        } else {
            System.out.println("На конце числа не цифра 7");
        }
    }
}
