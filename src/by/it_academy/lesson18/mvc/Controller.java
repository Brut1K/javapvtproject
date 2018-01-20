package by.it_academy.lesson18.mvc;

import java.util.ArrayList;

public class Controller {

    private View view;
    private ArrayList<Model> data;

    public Controller(View view){
        this.view = view;
    }

    public String getHello(){
        return "Hello";
    }

    public int getNumber(){
        view.showMessage( "Вызываем ошибку");
        return 42;
    }

    public void sortedByName(){
        System.out.println("Отсортировано" + data.get(0).getName());

    }
}
