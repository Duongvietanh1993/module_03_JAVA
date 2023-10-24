package fileIo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        File outputFile = new File("session_16/src/fileIo/output.txt");
        outputFile.createNewFile();
        FileWriter fileWriter = new FileWriter(outputFile);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.newLine();
        fileWriter.write("Hello Java");
        bufferedWriter.newLine();
        fileWriter.write(" Hello PHP");

        bufferedWriter.close();
    }
}
