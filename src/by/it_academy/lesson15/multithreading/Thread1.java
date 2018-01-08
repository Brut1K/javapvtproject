package by.it_academy.lesson15.multithreading;

public class Thread1 extends Thread {

    @Override
    public void run() {
        //всё что напишем здесь будет запущенов в другом потоке
        System.out.println("Start t1");
        for(int i = 0;i<10;i++){
        /*    if(isFinish){
                System.out.println("Close thread1");
                return;
            }  */
            if (isInterrupted()) {
                System.out.println("Close Thread1 by IF");
                return;
            }
            System.out.println("t1 = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Вошли в InterruptedException");
                return;
            }
        }

        System.out.println("Finish t1");
    }

    private boolean isFinish = false;

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}

