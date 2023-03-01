package bg.tu_varna.sit.dip;

import bg.tu_varna.sit.dip.model.Book;
import bg.tu_varna.sit.dip.printing.PrintToConsole;
import bg.tu_varna.sit.dip.printing.PrintToFile;
import bg.tu_varna.sit.dip.service.PrintInfoToMedia;
import bg.tu_varna.sit.dip.service.PrintingService;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("Джон Стайнбек", "За мишките и хората");
        PrintInfoToMedia printInfoToMedia = new PrintToFile("F:/123.txt");
        PrintingService printingService = new PrintingService(printInfoToMedia);
        printingService.printToMedia(book);
    }
}
