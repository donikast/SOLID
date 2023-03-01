package bg.tu_varna.sit.dip.service;

import bg.tu_varna.sit.dip.model.Book;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintingService {
    private PrintInfoToMedia printInfoToMedia;

    public PrintingService(PrintInfoToMedia printInfoToMedia) {
        this.printInfoToMedia = printInfoToMedia;
    }

    public void printToMedia(Book book) {
        printInfoToMedia.printInfo(book);
    }
}
