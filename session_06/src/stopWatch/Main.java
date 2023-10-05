package stopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < 100000; i++) {
            for (int j = i + 1; j < 100000; j++) {
                for (int k = i + 1; k < 100000; k++) {

                }
            }
        }
        sw.stop();
        System.out.printf("Thời gian thực thi của thuật toán sắp xếp là: %d ms", sw.getElapsedTime());
    }
}
