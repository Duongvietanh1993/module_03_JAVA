package baiTap.copyFile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceFile = "session_17/src/baiTap/copyFile/source file"; // Đường dẫn tệp nguồn
        String targetFile = "session_17/src/baiTap/copyFile/source file"; // Đường dẫn tệp tin đích

        File inputFile = new File(sourceFile); // Tạo đối tượng File cho tệp nguồn
        File outputFile = new File(targetFile); // Tạo đối tượng File cho tệp tin đích

        // Kiểm tra xem tệp nguồn có tồn tại hay không
        if (!inputFile.exists()) {
            System.out.println("File nguồn không tồn tại.");
            return;
        }

        // Kiểm tra xem tệp tin đích đã tồn tại hay không
        if (outputFile.exists()) {
            System.out.println("Tập tin đích đã tồn tại.");
            return;
        }

        // Tạo luồng đầu vào và đầu ra
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(inputFile);
            outputStream = new FileOutputStream(outputFile);

            // Tạo một bộ đệm để đọc và ghi dữ liệu
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Đọc byte từ tệp nguồn và ghi vào tệp tin đích
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Sao chép hoàn tất. Số byte: " + inputFile.length());
        } finally {
            // Đảm bảo giải phóng tài nguyên bằng cách đóng luồng
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
