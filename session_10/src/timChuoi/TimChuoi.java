package timChuoi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TimChuoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String input = scanner.nextLine();

        // Bước 2: Chuyển đổi chuỗi thành List các từ (String)
        List<String> wordList = Arrays.asList(input.split(" "));

        // Bước 3: Tạo một List mới để lưu trữ các phần tử được tìm thấy
        List<String> foundList = new ArrayList<>();

        // Bước 4: Duyệt qua List để tìm các phần tử có độ dài nhỏ nhất
        int minLength = 10;
//        for (String word : wordList) {
//            int length = word.length();
//            if (length < minLength) {
//                minLength = length;
//                foundList.clear();
//                foundList.add(word);
//            } else if (length == minLength) {
//                foundList.add(word);
//            }
//        }
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            int length = word.length();
            if (length < minLength) {
                minLength = length;
                foundList.clear();
                foundList.add(word);
            } else if (length == minLength) {
                foundList.add(word);
            }
        }

        // Bước 5: In ra kết quả
        System.out.println("Các từ có độ dài nhỏ nhất:" +foundList);

    }
}
