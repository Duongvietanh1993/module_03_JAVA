package tinhTongSoNguyen;

import java.util.ArrayList;
import java.util.List;

public class ChuyenDoi {
    public static void main(String[] args) {
        String input = "123 456 789 abc 987 def"; // Chuỗi đầu vào

        List<Integer> numbers = convertToIntegerList(input);

        System.out.println("Danh sách số nguyên:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static List<Integer> convertToIntegerList(String str) {
        List<Integer> list = new ArrayList<>();
        String[] parts = str.split(" "); // Tách chuỗi thành các phần tử

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part); // Chuyển đổi phần tử thành số nguyên
                list.add(num);
            } catch (NumberFormatException e) {
                list.add(0); // Thêm giá trị mặc định 0 nếu không phải số nguyên
                System.out.println("Lỗi: \"" + part + "\" không phải số nguyên. Giá trị mặc định 0 được sử dụng.");
            }
        }

        return list;
    }
}
