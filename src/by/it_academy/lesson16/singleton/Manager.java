package by.it_academy.lesson16.singleton;

public class Manager {
    private String name;
    private static Manager instance;

    private Manager() {}

    public static Manager getInstance(){
        if(instance==null) {
            instance = new Manager();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
