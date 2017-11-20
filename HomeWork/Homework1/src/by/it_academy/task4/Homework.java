package by.it_academy.task4;

public class Homework {
    public static void main(String[] args) {
        int l1t4 = 15;
        String l1t4string = Integer.toString(l1t4);
        char l1t4char = l1t4string.charAt(l1t4string.length() - 1);
        if(l1t4char=='1') {
            System.out.println(l1t4+ " рубль");
        } else if (l1t4char == '2' || l1t4char == '3' || l1t4char == '4'&&l1t4>20) {
            System.out.println(l1t4 + " рубля");
        } else {
            System.out.println(l1t4 + " рублей");
        }
    }
}

