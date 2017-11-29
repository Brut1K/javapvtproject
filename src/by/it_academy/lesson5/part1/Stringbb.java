package by.it_academy.lesson5.part1;

public class Stringbb {
    public static void main(String[] args) {

        String text = "a" + "b" + "c" + "d";
        String text3 = "a".concat("b").concat("c").concat("d");

        StringBuilder builder = new StringBuilder();
        builder.append("a");
        builder.append("b");
        builder.append("c");
        builder.append("d");
        String text2 = builder.toString();

    }
}
