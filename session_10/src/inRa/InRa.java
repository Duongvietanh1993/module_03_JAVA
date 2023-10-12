package inRa;

import java.util.ArrayList;
import java.util.List;

public class InRa {
    public static void main(String[] args) {

        String str = "Rekkei Academy để nông dân biết code";

        // Bước 2: Tạo một List có kiểu dữ liệu là String
        List<String> stringList = new ArrayList<>();

        // Bước 3: Chuyển đổi chuỗi ở bước 1 thành List String và gán vào List được tạo ở bước 2
        String[] words = str.split(" ");
        for (String word : words) {
            stringList.add(word);
        }
        System.out.println("chuỗi sau khi split: "+ stringList);
        // Bước 4: Duyệt List và in ra các phần tử có độ dài lớn hơn 3 ký tự
        System.out.println("Các từ có độ dài lớn hơn 3 ký tự:");
        for (String word : stringList) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}
