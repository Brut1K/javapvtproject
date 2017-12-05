package by.it_academy.task1;

public class UI {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Student[] arr = new Student[2];
        manager.generateArray(arr);
        manager.averageAge(arr);
    }
}
