package luuVaInRa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Khởi tạo một danh sách đầu vào
        String[] inputList = {"A", "B", "C", "D", "E"};

        // Khởi tạo một Queue
        Queue<String> queue = new LinkedList<>();

        // Thêm các phần tử của danh sách vào Queue
        for (String element : inputList) {
            queue.add(element);
        }

        // In ra các phần tử của Queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
