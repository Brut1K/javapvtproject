package by.it_academy;

public class Main {
    public static void main(String[] args) {
        ParsingThread parsingThread = new ParsingThread();
        DownloadThread downloadThread = new DownloadThread();
        parsingThread.setDownloadThread(downloadThread);
        downloadThread.setParsingThread(parsingThread);
        parsingThread.setName("ParsingThread");
        downloadThread.setName("DownloadThread");
        parsingThread.start();
        downloadThread.start();



    }
}

