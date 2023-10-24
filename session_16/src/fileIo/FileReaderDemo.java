package fileIo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File outputFile = new File("session_16/src/fileIo/output.txt");
        FileReader fileReader = new FileReader(outputFile);
        int choice;
        while ((choice = fileReader.read()) != -1) {
            System.out.print((char) choice);
        }

    }
}
