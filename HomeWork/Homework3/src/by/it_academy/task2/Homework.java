package by.it_academy.task2;

public class Homework {
    public static void main(String[] args) {
        System.out.println(getLetter(150));
    }

    public static int getLetter(int news){
        if (news%10!=0) {
            return (news / 10 + 1);
        }
        else {
            return news/10;
        }
    }
}
