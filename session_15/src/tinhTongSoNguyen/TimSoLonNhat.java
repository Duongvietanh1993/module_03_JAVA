package tinhTongSoNguyen;

public class TimSoLonNhat {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 1, 5}; // Mảng các số nguyên

        try {
            int maxNumber = findMaxNumber(numbers);
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
        } catch (EmptyArrayException e) {
            System.out.println("Lỗi: Mảng rỗng.");
        }
    }

    public static int findMaxNumber(int[] arr) throws EmptyArrayException {
        if (arr.length == 0) {
            throw new EmptyArrayException();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}

class EmptyArrayException extends Exception {
    public EmptyArrayException() {
        super();
    }
}
