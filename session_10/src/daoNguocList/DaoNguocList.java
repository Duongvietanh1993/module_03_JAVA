package daoNguocList;

import java.util.ArrayList;
import java.util.List;

public class DaoNguocList {
    public static void main(String[] args) {
        // Tạo một danh sách (List) chứa các số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Thêm các số nguyên vào danh sách
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // In ra danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Đảo ngược danh sách
        List<Integer> reversedNumbers = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversedNumbers.add(numbers.get(i));
        }

        // In ra danh sách đã đảo ngược
        System.out.println("Danh sách đã đảo ngược:");
        for (int number : reversedNumbers) {
            System.out.println(number);
        }
    }
}
