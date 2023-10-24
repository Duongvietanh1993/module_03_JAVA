package baiTap.demSoDong;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File outputFile = new File("session_16/src/baiTap/demSoDong/output.txt");
        outputFile.createNewFile();

        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("tạo file và cho sẵn dữ liệu(có thêt coppy đề bài cho vào file)");
        bufferedWriter.newLine();
        bufferedWriter.write("viết hàm đọc file");
        bufferedWriter.newLine();
        bufferedWriter.write("convert file đọc được thành mảng string với mỗi từ là 1 phần tử");
        bufferedWriter.newLine();
        bufferedWriter.write("sử dụng vòng lặp để tìm kiếm các phần tử xuất hiện nhiều hơn 1 lần và add những phần tử đó vào 1 list");

        bufferedWriter.close();

        File inputFile = new File("session_16/src/baiTap/demSoDong/output.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));

        int count = 0;
        while (bufferedReader.readLine() != null) {
            count++;
        }

        bufferedReader.close();

        System.out.println("Số dòng trong file: " + count);
    }


}
