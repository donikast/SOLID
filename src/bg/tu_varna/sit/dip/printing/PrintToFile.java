package bg.tu_varna.sit.dip.printing;

import bg.tu_varna.sit.dip.model.Book;
import bg.tu_varna.sit.dip.service.PrintInfoToMedia;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class PrintToFile implements PrintInfoToMedia {
    private String filePath;

    public PrintToFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void printInfo(Book book) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(book.toString());
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
