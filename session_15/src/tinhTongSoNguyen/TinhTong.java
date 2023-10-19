package tinhTongSoNguyen;

public class TinhTong {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 10, 4}; // Mảng số nguyên

        try {
            int sum = calculateSum(numbers);
            System.out.println("Tổng của mảng là: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Một phần tử không phải số nguyên. Đã bỏ qua phần tử đó.");
        }
    }

    public static int calculateSum(int[] arr) throws NumberFormatException {
        int sum = 0;

        for (int num : arr) {
            try {
                sum += num;
            } catch (NumberFormatException e) {
                // Bỏ qua phần tử không phải số nguyên và tiếp tục vòng lặp
                continue;
            }
        }

        return sum;
    }
}
