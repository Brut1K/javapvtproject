package by.it_academy.task1;

public class ParsingThread extends Thread {
    private DownloadThread downloadThread;

    public DownloadThread getDownloadThread() {
        return downloadThread;
    }

    public void setDownloadThread(DownloadThread downloadThread) {
        this.downloadThread = downloadThread;
    }

    @Override
    public void run() {
        System.out.println("Start ParsingThread");
        System.out.println("ParsingThread start sleep. zzzzzzz.....");
        synchronized (this){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Start parsing *.xml");

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (getDownloadThread()){
            System.out.println("Parsing *.xml finish");
            downloadThread.notify();
        }
        System.out.println("ParsingThread start sleep. zzzzzzz.....");
        synchronized (this){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Start parsing *.json");

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Parsing *.json finish");



        System.out.println("Finish ParsingThread");
    }
}