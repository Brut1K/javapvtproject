package by.it_academy.task2;

public class Thirteen extends Exception {
    private final String russianMessage = "Вводить 13 - плохая примета, повторите попытку";

    public String getRussianMessage() {
        return russianMessage;
    }
}
