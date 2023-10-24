import java.io.File;
import java.io.IOException;

public class FileSubFile {
    public static void main(String[] args) throws IOException {

        File dataDir = new File("session_16/src/data");
        File inputTxtFile = new File(dataDir, "input.txt");
        File demoJavaFile = new File(dataDir, "Demo.java");
        File sub1Dir = new File(dataDir, "sub1");
        File sub2Dir = new File(dataDir, "sub2");
        File outputTxtFile = new File(sub1Dir, "output.txt");
        File studentDatFile = new File(sub1Dir, "student.dat");


        if (dataDir.mkdir()) {
            inputTxtFile.createNewFile();
            demoJavaFile.createNewFile();
            if (sub1Dir.mkdir()) {
                outputTxtFile.createNewFile();
                studentDatFile.createNewFile();
            }
            sub2Dir.mkdir();
        }

        displayDirectoryTree(dataDir, "");
    }

    public static void displayDirectoryTree(File dir, String indent) {
        System.out.println(indent + dir.getName());

        if (dir.isDirectory()) {
            File[] children = dir.listFiles();
            for (File child : children) {
                displayDirectoryTree(child, indent + "-");
            }
        }
    }
}
