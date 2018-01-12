package by.it_academy.lesson16.part1;

public class Main {

  /*  private Object object = new Object();
    private volatile String value;


    public static void main(String[] args) {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.value = "1111";
                System.out.println(main.value);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
                main.value = main.value+"22222";
                System.out.println(main.value);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            if (thread2.isAlive()) {
                System.out.println("Thread №1 WIN!!!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
            if (thread1.isAlive()) {
                System.out.println("Thread №2 WIN!!!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void print10() {

        synchronized (value) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep((int) (Math.random() * 100));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }  */


    public static void main(String[] args) {
        ParsingThread parsingThread = new ParsingThread();
        DownloadThread downloadThread = new DownloadThread();
        parsingThread.setDownloadThread(downloadThread);
        downloadThread.setParsingThread(parsingThread);

        parsingThread.start();
        downloadThread.start();



    }
}

