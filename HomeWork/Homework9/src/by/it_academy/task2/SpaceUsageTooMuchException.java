package by.it_academy.task2;

public class SpaceUsageTooMuchException extends Exception {

    private final String INFO = "Заполнено больше 70% площади";

    public String getINFO() {
        return INFO;
    }
}
