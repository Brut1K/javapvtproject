package by.it_academy.lesson4;

public class People {

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(int age){
        this.age = age;
    }

    private String name;
    private int age;
    public static int staticValue;

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
}
