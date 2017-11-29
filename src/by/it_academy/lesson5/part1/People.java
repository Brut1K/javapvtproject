package by.it_academy.lesson5.part1;

public abstract class  People {
    private static final String CONS = "asdas";
    private String name;
    private int age;
    private String address;
    private String pasportNumber;
    //final метод нельзя переоределить
    //final класс нельзя наследовать
    //final переменной делает её константой
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(String pasportNumber) {
        this.pasportNumber = pasportNumber;
    }
}
