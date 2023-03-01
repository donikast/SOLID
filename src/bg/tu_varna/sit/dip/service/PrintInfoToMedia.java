package bg.tu_varna.sit.dip.service;

import bg.tu_varna.sit.dip.model.Book;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface PrintInfoToMedia {
    void printInfo(Book book);
}
