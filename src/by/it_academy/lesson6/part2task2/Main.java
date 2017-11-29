package by.it_academy.lesson6.part2task2;

public class Main {
    public static void main(String[] args) {
       //создаем нужные элементы
        UI ui = new UI(); // в UI лежит логика работы с пользователем
        Button button = new Button();// создаем кнопку
        button.setMain(ui); // скинули ссылку на UI в баттон
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){}

        //симулируем нажатие на кнопку
        button.emulateClickButton();

        UI2 ui2 = new UI2();
        Button button2 = new Button();
        button2.setMain(ui2);

        try{
            Thread.sleep(500);
        } catch (InterruptedException e){}
        button.emulateClickButton();

        try{
            Thread.sleep(500);
        } catch (InterruptedException e){}
        button2.emulateClickButton();

        try{
            Thread.sleep(500);
        } catch (InterruptedException e){}
        button.emulateClickButton();

    }


}
