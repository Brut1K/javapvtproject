package by.it_academy.lesson8.part1;

public class fiveException extends Exception {

    private int errorCode = 765;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
