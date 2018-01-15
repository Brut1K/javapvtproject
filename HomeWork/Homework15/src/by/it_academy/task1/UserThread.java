package by.it_academy.task1;

import static by.it_academy.task1.Main.print10;

public class UserThread extends Thread {
    @Override
    public void run() {
        print10();
    }
}
