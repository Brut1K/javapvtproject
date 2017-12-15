package by.it_academy.task2;

public class People {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public People(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }
}
