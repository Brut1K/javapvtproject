package by.it_academy.lesson19.task1;

public class MyCollection<MySuperValue extends Number,SecondValue extends String> {
    private MySuperValue value;
    private SecondValue secondValue;

    public SecondValue getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(SecondValue secondValue) {
        this.secondValue = secondValue;
    }

    public MySuperValue getValue() {
        return value;

    }

    public void setValue(MySuperValue value) {
        this.value = value;
    }

}
