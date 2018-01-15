package by.it_academy.task2;

public class Main {
//synhronized methods
    public static void main(String[] args) {
        UserThread thread1 = new UserThread();
        UserThread thread2 = new UserThread();
        thread1.setName("Thread №1");
        thread2.setName("Thread №2");
        thread1.start();
        thread2.start();
    }

        public synchronized static void print10(){
        for(int i = 0;i<10;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i*10+1;j<i*10+11;j++){
                sb.append(j);
                sb.append(" ");
            }
            System.out.println(Thread.currentThread().getName()+" "+sb.toString());
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
