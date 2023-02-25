package bg.tu_varna.sit.srp.refactored;

import java.util.Arrays;

public class TextPrinter {

    public void printText(String text) {
        System.out.println(text);
    }

    public void printOutEachWordOfText(String text) {
        System.out.println(Arrays.toString(text.split(" ")));
    }

    public void printRangeOfCharacters(String text, int startingIndex, int endIndex) {
        System.out.println(text.substring(startingIndex, endIndex));
    }
}
