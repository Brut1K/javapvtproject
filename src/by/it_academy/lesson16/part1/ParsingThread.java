package by.it_academy.lesson16.part1;

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

        try {
            Thread.sleep(2000);
            System.out.println("wait parsingthread");
            Thread.sleep(2000);
            wait();
        } catch (InterruptedException e) {
            System.out.println("ERRRROOORR");
            e.printStackTrace();
        }

        System.out.println("WAKE UP and parsing xml");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        downloadThread.notify();
        try {
            System.out.println("Sleep parsingthread again");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("WAKE UP and parsing json");


    }
}
