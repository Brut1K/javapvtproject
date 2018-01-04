/*package by.it_academy;


import java.util.Objects;

public class Alex {
    private String name;
    private int age;
    private boolean checker;

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

    public boolean isChecker() {
        return checker;
    }

    public void setChecker(boolean checker) {
        this.checker = checker;
    }

    @Override
    public String toString() {
        return "Alex{" + "\n" +
                "name='" + name + "\',\n" +
                "age=" + age + ",\n" +
                "checker=" + checker +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alex alex = (Alex) o;
        return age == alex.age &&
                checker == alex.checker &&
                Objects.equals(name, alex.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, checker);
    }
}
*/
