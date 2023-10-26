package baiTap.chanLe;

public class TestThread {
    public static void main(String[] args) {
        // Tạo đối tượng OddThread và EvenThread
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Start các thread
        oddThread.start();
        evenThread.start();

        try {
            // Sử dụng join để cho phép OddThread hoàn thành trước khi tiếp tục
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished.");
    }
}
