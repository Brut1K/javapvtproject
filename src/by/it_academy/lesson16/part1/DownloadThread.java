package by.it_academy.lesson16.part1;

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
        System.out.println("Start downloadThread xml");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        parsingThread.notify();
        try {
            System.out.println("Скачали xml и спать");
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download json");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        parsingThread.notify();
        System.out.println("Downloader разбудил и завершил работу");


    }
}
