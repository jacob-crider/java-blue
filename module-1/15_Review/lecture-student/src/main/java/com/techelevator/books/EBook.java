package com.techelevator.books;

public class EBook extends Book implements Downloadable{

    private String format;
    private String fileName;
    private int fileSize;

    public Ebook(String title, String format, String fileName, int fileSizeInMegabytes){
        super(title);
        this.format = format;
        this.fileName = fileName;
        this.fileSize = fileSizeInMegabytes;
    }

    @Override
    public String getFormat() {
        return this.format;
    }

    @Override
    public String getFileName() {
        return this.fileName;
    }

    @Override
    public int getFileSizeInMegabytes() {
        return this.fileSize;
    }

    @Override
    public double calculateDownloadTime(int megabitsPerSecond) {
        double timeInSeconds = fileSize / (megabitsPerSecond/ 8.0);
        return timeInSeconds;
    }
}
