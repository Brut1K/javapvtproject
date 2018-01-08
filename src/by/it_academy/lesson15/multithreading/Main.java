package by.it_academy.lesson15.multithreading;

public class Main {


    public static void main(String[] args) {

        System.out.println("Start main");
    /*
    //создаем новый поток и в него передаем экземпляр интерфейса
    //Runnable(), где переопределяем метод run()
     Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //всё что напишем здесь будет запущенов в другом потоке
                System.out.println("Start t1");
                int result = 0;
                for(int i = 0;i<10;i++){
                    System.out.println("t1 = " + (result =result+i));
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println(e.toString());
                }
                System.out.println("Finish t1");
            }
        }); */

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //всё что напишем здесь будет запущенов в другом потоке
                System.out.println("Start t2");
                for(int i = 0;i<10;i++){
                    System.out.println("t2 = " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println(e.toString());
                }
                test();
                System.out.println("Finish t2");
            }
        });


        Thread1 thread1 = new Thread1();
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
  /*      thread1.setFinish(true);
        System.out.println("setFinish = true");*/

        thread1.interrupt();
        System.out.println("thread1.interrupt()");
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End main");





    }

    public static void test(){
        System.out.println("Test");

    }
}
