package by.it_academy.lesson16.singleton;

public class One {

    public void change(){
        Manager m = Manager.getInstance();
        System.out.println(m.getName());
        m.setName("Name changed");
    }
}
