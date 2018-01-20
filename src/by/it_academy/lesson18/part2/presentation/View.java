package by.it_academy.lesson18.part2.presentation;

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
        //например пользователь хочет снять деньги
        controller.getMoney();

    }
    // этот метод будет вызывать контроллер, чтобы показать
    // пользователю ответ на запрос о снятии денег
    public void showGetMoneyResult(boolean b){
        if(b){
            System.out.println("Деньги сняты");
        } else {
            System.out.println("Ошибка снятия денег");
        }
    }

    public void showMessage(String s){
        System.out.println("Что-то тут пошло не так " + s);
    }
}
