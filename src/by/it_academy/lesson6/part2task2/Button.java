package by.it_academy.lesson6.part2task2;

public class Button {

    private ButtonClick buttonClick;
    //записываем в баттон ссылку на мэйн,
    //чтобы баттон мог вызывать методы мэйн
    public void setMain(ButtonClick ui) {
        this.buttonClick = ui;
    }
    //симулирует нажатие на кнопку
    public void emulateClickButton(){
        if(buttonClick !=null)
            buttonClick.onClick();
    }

}
