import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("session_16/src/data.txt");
        if (dataFile.createNewFile()) {
            System.out.println("tao file.txt thanh cong ");
            return;
        }
        System.out.println("tao khong thanh cong");

        File inputDir = new File("input");
        if (inputDir.mkdir()) {
            System.out.println("tao folder thanh cong");
            return;
        }
        System.out.println("tao folder k thanh cong");

        File subFolder = new File("session_16/src/sub");
        if (subFolder.mkdir()) {
            File inputFile = new File("session_16/src/sub/input.txt");
            inputFile.createNewFile();
        }

        File srcDir = new File("session_16/src");
        File[] subArray = srcDir.listFiles();
        System.out.println("Fodel "+srcDir.getName()+ " có các tệp và thư mục con sau: ");
        for (File sub : subArray) {
            System.out.println(sub.getName());
        }
    }
}
