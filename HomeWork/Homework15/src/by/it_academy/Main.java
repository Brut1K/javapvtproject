package by.it_academy;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                print10();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                print10();
            }
        });

        thread1.start();
        thread2.start();
    }

        public static void print10(){
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
