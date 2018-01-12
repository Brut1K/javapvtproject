package by.it_academy.lesson16.singleton;

public class Main {

    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        Manager manager1 = Manager.getInstance();
        manager.setName("Name");
        System.out.println(manager1.getName());
        One one = new One();
        one.change();
        System.out.println(manager.getName());
    }
}
