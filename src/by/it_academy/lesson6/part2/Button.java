package by.it_academy.lesson6.part2;

public class Button {

    private UI ui;
    //записываем в баттон ссылку на мэйн,
    //чтобы баттон мог вызывать методы мэйн
    public void setMain(UI ui) {
        this.ui = ui;
    }
    //симулирует нажатие на кнопку
    public void emulateClickButton(){
        if(ui!=null)
            ui.onClick();
    }

}
