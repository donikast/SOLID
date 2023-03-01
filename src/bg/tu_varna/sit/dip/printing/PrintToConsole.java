package bg.tu_varna.sit.dip.printing;

import bg.tu_varna.sit.dip.model.Book;
import bg.tu_varna.sit.dip.service.PrintInfoToMedia;

public class PrintToConsole implements PrintInfoToMedia {
    @Override
    public void printInfo(Book book) {
        System.out.println(book);
    }
}
