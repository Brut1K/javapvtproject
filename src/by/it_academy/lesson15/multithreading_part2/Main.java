package by.it_academy.lesson15.multithreading_part2;

import java.util.concurrent.LinkedBlockingQueue;

public class Main {


    private static LinkedBlockingQueue<Integer> list;
    private static StringBuffer stringBuffer = new StringBuffer();
    private static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        System.out.println("Start main");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<10;i++){


                stringBuilder.append(i+"A");
                stringBuilder.replace(0,1,"KJFHJ");
                stringBuffer.append(i+"A");
                try {
                    Thread.sleep(111200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<10;i++) {


                    stringBuilder.append(i+"B");
                    stringBuffer.append(i+"B");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
// Daemon - системный поток, обслуживает другие,
// если main звершается он закрывает и демона
        thread1.setName("Первый поток");
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread1.setPriority(Thread.NORM_PRIORITY);




        try {

            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        System.out.println("End main");



    }

    public static void test(){
        System.out.println("Test");
    }


    // synchronized доступ к этому методу будет только
    // у одного потока в один момент времени
    public synchronized static void openFile(){
        String name = Thread.currentThread().getName();
        System.out.println(name);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
