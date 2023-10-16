package countElements;

import java.util.HashMap;
import java.util.Map;

public class CountElements {
    public static void main(String[] args) {
        // Bước 1: Khai báo mảng phần tử
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 2, 3, 4, 1};

        // Bước 2: Đếm số lần xuất hiện của mỗi phần tử và lưu vào HashMap
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : arr) {
            if (elementCountMap.containsKey(element)) {
                // Nếu phần tử đã có trong HashMap, tăng số lần xuất hiện lên 1
                int count = elementCountMap.get(element);
                elementCountMap.put(element, count + 1);
            } else {
                // Nếu phần tử chưa có trong HashMap, thêm phần tử mới với số lần xuất hiện ban đầu là 1
                elementCountMap.put(element, 1);
            }
        }

        // Bước 3: In ra số lần xuất hiện của từng phần tử
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            System.out.println("Phần tử " + element + " xuất hiện " + count + " lần");
        }
    }
}
