package hamTrongList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HamTrongList {
    public static void main(String[] args) {
        // Tạo một List số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Số lượng phần tử ngẫu nhiên trong khoảng từ 1 đến 10
        int n = (int) (Math.random() * 10) + 1;

        // Gán giá trị ngẫu nhiên cho từng phần tử trong List
        for (int i = 0; i < n; i++) {
            int randomNumber = (int) (Math.random() * 100); // Giá trị ngẫu nhiên từ 0 đến 99
            numbers.add(randomNumber);
        }

        // In ra List số nguyên
        System.out.println("List số nguyên:"+ numbers);
        for (int number : numbers) {
            System.out.println(number);
        }

        // Tìm phần tử lớn nhất trong List sử dụng phương thức Collections.max()
        int maxNumber = Collections.max(numbers);

        // In ra phần tử lớn nhất
        System.out.println("Phần tử lớn nhất: " + maxNumber);
    }
}
