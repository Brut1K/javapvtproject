package by.it_academy.task1;

public class DownloadThread extends Thread {
    private ParsingThread parsingThread;

    public ParsingThread getParsingThread() {
        return parsingThread;
    }

    public void setParsingThread(ParsingThread parsingThread) {
        this.parsingThread = parsingThread;
    }

    @Override
    public void run() {
        System.out.println("Start DownloadThread");

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Start downloading *.xml");

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (getParsingThread()){
            System.out.println("Download *.xml finish");
            parsingThread.notify();
        }

        synchronized (this){
            System.out.println("DownloadingThread start sleep. zzzz....");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Start downloading *.json");

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (getParsingThread()){
            System.out.println("Download *.json finish");
            parsingThread.notify();
        }

        System.out.println("Finish DownloadingThread");
    }
}