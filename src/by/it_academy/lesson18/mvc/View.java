package by.it_academy.lesson18.mvc;

public class View {

    public static void main(String[] args) {
        View view = new View();
        view.startUI();
    }

    private Controller controller;

    public View(){
        controller = new Controller(this);
    }
    private void startUI(){
        System.out.println("Что ты хочешь?");
        System.out.println(controller.getHello());
        System.out.println(controller.getNumber());
    }

    public void showMessage(String s){
        System.out.println("Что-то тут пошло не так " + s);
    }
}
