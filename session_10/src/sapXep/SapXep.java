package sapXep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SapXep {
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
        System.out.println("Danh sách ban đầu: "+ numbers);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Danh sách sắp xếp: "+ numbers);

    }
}
